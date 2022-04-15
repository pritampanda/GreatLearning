package com.greatLearning.assignment;

public class Main {
	public static void main(String[] args) {

		// create the object of TechDepartment and use all the methods 
		AdminDepartment ad = new AdminDepartment();
		System.out.println(ad.deparmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		
		
		// create the object of Hr Department and use all the methods 
		HrDepartment hd = new HrDepartment();
		System.out.println(hd.deparmentName());
		System.out.println(hd.doActivity());
		System.out.println(hd.getTodaysWork());
		System.out.println(hd.getWorkDeadline());
		System.out.println(hd.isTodayAHoliday());
		
		// create the object of TechDepartment and use all the methods 
		TechDepartment td = new TechDepartment();
		System.out.println((td.deparmentName()));
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());

		// 
	}

}
