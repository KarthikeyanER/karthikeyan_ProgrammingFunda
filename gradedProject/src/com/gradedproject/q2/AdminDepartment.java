package com.gradedproject.q2;

class AdminDepartment extends SuperDepartment {
	
	
	@Override
	String departmentName() {
		// TODO Auto-generated method stub
		return "Admin Department";
	}
	@Override
	String getTodaysWork() {
		
		return "Complete your documents Submission";
	}
	@Override
	String getWorkDeadline() {
		
		return "Complete by EOD";
	}

}
