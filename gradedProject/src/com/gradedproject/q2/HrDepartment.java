package com.gradedproject.q2;

class HrDepartment extends SuperDepartment{

	@Override
	String departmentName() {
		
		return "HR Department";
	}
	String getTodaysWork() {
		return "Complete your documents Submission";
	}
	String getWorkDeadline () {
		return "Complete by EOD";
	}
	String doActivity() {
		return "team Lunch";
	}
}
