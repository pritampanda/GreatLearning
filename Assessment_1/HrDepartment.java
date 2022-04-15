package com.greatLearning.assignment;

public class HrDepartment extends SuperDepartment{

	//declare method departmentName of return type string
	public String deparmentName() {
		return " Welcome to HR Department";
	}

	//declare method getTodaysWork of return type string
	public String getTodaysWork() {
		return "Fill todays timesheet and mark your attendance";
	}
	
	//declare method doActivity of return type string
	public String doActivity() {
		return "team Lunch";
	}

	//declare method getWorkDeadline of return type string
	public String getWorkDeadline() {
		return "Complete by EOD ";
	}

}
