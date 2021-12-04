package com.greatlearning.dept;

public class AdminDepartment extends SuperDepartment {
	public String departmentName () {
		return " Welcome to Admin Department";
	}
	
	public String getTodaysWork () {
		return "Complete your documents Submission";
	}
	
	public String getWorkDeadline () {
		return "Complete by EOD";
	}
}