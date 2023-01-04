package com.bridgelabz.employeewages;
import java.util.Random;
public class AddingPartTimeEmployeeWage {
	
public static void main(String[] args) {
	  int wagePerHour = 20;
	  int fullDayHours = 8;
		Random attendance = new Random();
        int checkAttendance = attendance.nextInt(3);
        if(checkAttendance == 1) {
        	System.out.println("Employee Is Present:");
        	System.out.println("daily employee wage is:"+(wagePerHour*fullDayHours));
        }else if (checkAttendance == 2){
        	System.out.println("Employee Is Present But PartTime:");
        	System.out.println("part Time Employee daily wage is:"+((wagePerHour/2)*fullDayHours));

        }else {
        	System.out.println("Employee is Abscent:");
        }
	}

}
