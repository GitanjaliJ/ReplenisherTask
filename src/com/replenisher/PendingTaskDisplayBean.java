package com.replenisher;

public class PendingTaskDisplayBean {
	private String taskID;
	private String taskName;
	private String taskDescription;
	private String notes;
	private String feedback;
	private String status;
	private String rank;
	
	public PendingTaskDisplayBean() {
		this.taskID = "bad query";
		this.taskName="bad query";
		this.taskDescription="bad query";
		this.notes="bad query";
		this.feedback="bad query";
		this.status="bad query";
		this.rank="bad query";
		System.out.println("in plain constructor");
	}
	public PendingTaskDisplayBean(String taskID, String taskName, String taskDescription, String notes, String feedback, String status, String rank) {
		this.taskID = taskID;
		this.taskName=taskName;
		this.taskDescription=taskDescription;
		this.notes=notes;
		this.feedback=feedback;
		this.status=status;
		this.rank=rank;
		System.out.println("in parameter constructor");
	}
	
	public String getTaskID() {
		System.out.println("in getTaskID "+taskID);
		return taskID;
	}
	
	public void setTaskID(String taskID) {
		System.out.println("in setTaskID "+taskID);
		this.taskID = taskID;
	}
	public String getTaskName() {
		System.out.println("in getTaskname "+taskName);
		return taskName;
	}
	
	public void setTaskName(String taskName) {
		System.out.println("in setTaskname "+taskName);
		this.taskName = taskName;
	}
	
	public String getTaskDesc() {
		System.out.println("in getTaskDesc "+taskDescription);
		return taskDescription;
	}
	
	public void setTaskDesc(String taskDescription) {
		System.out.println("in setTaskDesc "+taskDescription);
		this.taskDescription = taskDescription;
	}
	
	public String getNotes() {
		System.out.println("in getNotes "+notes);
		return notes;
	}
	
	public void setNotes(String notes) {
		System.out.println("in setNotes "+notes);
		this.notes = notes;
	}
	
	public String getFeedback() {
		System.out.println("in getfeedback "+feedback);
		return feedback;
	}
	
	public void setFeedback(String feedback) {
		System.out.println("in setfeedback "+feedback);
		this.feedback = feedback;
	}
	
	public String getStatus() {
		System.out.println("in getstatus "+status);
		return status;
	}
	
	public void setStatus(String status) {
		System.out.println("in setstatus "+status);
		this.status = status;
	}
	
	public String getRank() {
		System.out.println("in getrank "+rank);
		return rank;
	}
	
	public void setRank(String rank) {
		System.out.println("in setrank "+rank);
		this.rank = rank;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("TaskID: %s%n", this.getTaskID()));
		
		return sb.toString();
	}
	
}

