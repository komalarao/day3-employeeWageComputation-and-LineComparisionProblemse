package com.bridgelabz.employeewages;
import java.util.Random;
public class EmployeeWageUsingSwitchCase {
	
public static void main(String[] args) {
	  int wagePerHour = 20;
	  int fullDayHours = 8;
		Random attendance = new Random();
        int checkAttendance = attendance.nextInt(3);
        switch (checkAttendance) {
        case 1:
        	System.out.println("Employee Is Present:");
        	System.out.println("daily employee wage is:"+(wagePerHour*fullDayHours));
        	break;
        case 2:
        	System.out.println("Employee Is Present But PartTime:");
        	System.out.println("part Time Employee daily wage is:"+((wagePerHour/2)*fullDayHours));
        	break;
        default:
        	System.out.println("Employee is Abscent:");
        	break;
        }
	}

}
