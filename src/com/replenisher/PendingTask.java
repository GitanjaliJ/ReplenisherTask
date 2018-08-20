package com.replenisher;

public enum PendingTask {
    TASKID ("taskid"),TASKNAME("taskname"), TASKDESC("taskdescription"),NOTES("notes"),FEEDBACK("feedback"),STATUS("Status"),RANK("Rank");
	/*,  F, */
	private String databaseColumnName;
	
	private PendingTask(String databaseColumnName) {
		this.databaseColumnName = databaseColumnName;
	}
	
	public String getColumnName() {
		return this.databaseColumnName;
	}
	
	public static PendingTask getOptionFromString(String value) {
		for(PendingTask s : PendingTask.values()) {
			String item = s.getColumnName();
			if(item.equalsIgnoreCase(value)) {
				return s;
			}
		}
		return STATUS;
	}
	
	public static boolean contains(PendingTask value) {
		for(PendingTask s : PendingTask.values()) {
			if(s.equals(value)) {
				return true;
			}
		}
		return false;
	}
}
