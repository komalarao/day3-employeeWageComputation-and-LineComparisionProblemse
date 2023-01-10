package com.bridgelabz.employeewages;
import java .util.Random;
public class DailyEmployeeWage {
	
public static void main(String[] args) {
	  int WAGE_PERHOUR = 20;
	  int FULL_DAYHOURS = 8;
		Random attendance = new Random();
        int Check_Attendance = attendance.nextInt(2);
	
        if(Check_Attendance == 1) {
        	System.out.println("Employee Is Present:");
        	System.out.println("daily employee wage is:"+(WAGE_PERHOUR*FULL_DAYHOURS));
        }else {
        	System.out.println("Employee Is Abscent:");

        }
	}

}
