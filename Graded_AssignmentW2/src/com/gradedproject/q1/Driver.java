package com.gradedproject.q1;

public class Driver {

    public static void main(String[] args) {
        SuperDepartment superDept = new SuperDepartment();
        AdminDepartment admin = new AdminDepartment();
        HrDepartment hr = new HrDepartment();
        TechDepartment tech = new TechDepartment();

        System.out.println("Welcome to " + admin.departmentName());
        System.out.println(admin.getTodaysWork());
        System.out.println(admin.getWorkDeadline());
        System.out.println(superDept.isTodayAHoliday());

        System.out.println("\nWelcome to " + hr.departmentName());
        System.out.println(hr.doActivity());
        System.out.println(hr.getTodaysWork());
        System.out.println(hr.getWorkDeadline());
        System.out.println(superDept.isTodayAHoliday());

        System.out.println("\nWelcome to " + tech.departmentName());
        System.out.println(tech.getTodaysWork());
        System.out.println(tech.getWorkDeadline());
        System.out.println(tech.getTechStackInformation());
        System.out.println(superDept.isTodayAHoliday());
    }
}
