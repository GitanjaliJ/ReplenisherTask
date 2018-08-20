package com.replenisher;

public class Task {
	String taskID;
	String taskName;
	String taskDesc;
	String notes;
	String feedback;
	String status;
	String rank;
	
	public Task() {
		this.taskID = "-1";
		this.taskName="bad query";
		this.taskDesc="bad query";
		this.notes="bad query";
		this.feedback="bad query";
		this.status="bad query";
		this.rank="-1";
	}
	public Task(String taskID, String taskName, String taskDesc, String notes, String feedback, String status, String rank) {
		this.taskID = taskID;
		this.taskName=taskName;
		this.taskDesc=taskDesc;
		this.notes=notes;
		this.feedback=feedback;
		this.status=status;
		this.rank=rank;
	}
	
	public String getTaskID() {
		System.out.println("in getTaskID "+taskID);
		return taskID;
	}
	
	public void setTaskID(String TaskID) {
		System.out.println("in setTaskID "+taskID);
		this.taskID = TaskID;
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
		System.out.println("in getTaskDesc "+taskDesc);
		return taskDesc;
	}
	
	public void setTaskDesc(String taskDesc) {
		System.out.println("in setTaskDesc "+taskDesc);
		this.taskDesc = taskDesc;
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
}
