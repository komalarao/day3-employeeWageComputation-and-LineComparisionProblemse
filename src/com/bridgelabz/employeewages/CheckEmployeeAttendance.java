package com.bridgelabz.employeewages;
import java .util.Random;
public class CheckEmployeeAttendance {
	
public static void main(String[] args) {
		Random attendance = new Random();
        int checkAttendance = attendance.nextInt(2);
        if(checkAttendance == 1) {
        	System.out.println("Employee Is Present:");
        }else {
        	System.out.println("Employee Is Abscent:");

        }
	}

}
