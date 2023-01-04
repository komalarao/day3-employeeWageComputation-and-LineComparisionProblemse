package com.bridgelabz.employeewages;
import java .util.Random;
public class DailyEmployeeWage {
	
public static void main(String[] args) {
	  int wagePerHour = 20;
	  int fullDayHours = 8;
		Random attendance = new Random();
        int checkAttendance = attendance.nextInt(2);
        if(checkAttendance == 1) {
        	System.out.println("Employee Is Present:");
        	System.out.println("daily employee wage is:"+(wagePerHour*fullDayHours));
        }else {
        	System.out.println("Employee Is Abscent:");

        }
	}

}
