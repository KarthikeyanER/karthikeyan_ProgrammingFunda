package com.gradedproject.q2;

class Main {

	public static void main(String[] args) {
		
		AdminDepartment adminDepartment=new AdminDepartment();
		System.out.println(" Welcome to "+adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());
		System.out.println();
		
		HrDepartment hrDepartement=new HrDepartment();
		System.out.println(" Welcome to "+hrDepartement.departmentName());
		System.out.println(hrDepartement.doActivity());
		System.out.println(hrDepartement.getTodaysWork());
		System.out.println("Fill today's timesheet and mark your attendance");
		System.out.println(hrDepartement.getWorkDeadline());
		System.out.println(hrDepartement.isTodayAHoliday());
		System.out.println();
		
		TechDepartment techDepartment=new TechDepartment();
		System.out.println(" Welcome to "+techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(techDepartment.isTodayAHoliday());
		System.out.println();
		
		
		
	}

}
