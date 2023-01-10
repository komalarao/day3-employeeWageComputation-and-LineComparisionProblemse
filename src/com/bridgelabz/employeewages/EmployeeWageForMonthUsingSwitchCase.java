package com.bridgelabz.employeewages;
import java.util.Random;
public class EmployeeWageForMonthUsingSwitchCase {
	
public static void main(String[] args) {
	  int Wage_Per_Hour = 20;
	  int Full_Day_Hours = 8;
	  int Total_Working_Days = 20;
		Random attendance = new Random();
        int Check_Attendance = attendance.nextInt(3);
        switch (Check_Attendance) {
        case 1:
        	System.out.println("Employee Is Present:");
        	System.out.println("monthly employee wage is:"+(Total_Working_Days*Wage_Per_Hour*Full_Day_Hours));
        	System.out.println("daily employee wage is:"+(Wage_Per_Hour*Full_Day_Hours));
        	break;
        case 2:
        	System.out.println("Employee Is Present But PartTime:");
        	System.out.println("part Time Employee monthly wage is:"+((Wage_Per_Hour/2)*Full_Day_Hours*totalWorkingDays));
        	System.out.println("part Time Employee daily wage is:"+((Wage_Per_Hour/2)*Full_Day_Hours));

        	break;
        default:
        	System.out.println("Employee is Abscent:");
        	break;
        }
	}

}
