package com.bridgelabz.employeewages;
import java.util.Random;
public class EmployeeWageForMonthUsingSwitchCase {
	
public static void main(String[] args) {
	  int wagePerHour = 20;
	  int fullDayHours = 8;
	  int totalWorkingDays = 0;
	  int totalWorkingHours=0;
		Random attendance = new Random();
        int checkAttendance = attendance.nextInt(3);
        Random checking = new Random();
        int check = checking.nextInt(2);
        switch (checkAttendance) {
        case 1:
        	
        	while(totalWorkingHours <=100 && totalWorkingDays<20) {
        		if(check == 1) {
        			totalWorkingDays++;
        	
        	System.out.println(" employee wage for "+totalWorkingDays+" days is: "+(totalWorkingDays*wagePerHour*fullDayHours));
        		}else {
                	System.out.println(" employee wage for "+totalWorkingHours+" hours is:"+(totalWorkingHours*wagePerHour));
                     totalWorkingHours++;
        		}
        	}System.out.println("Employee Is Present and performing full time:");
        	break;
        case 2:

        	while(totalWorkingHours<=100 && totalWorkingDays<20) {
        		if(check ==1) {
        			totalWorkingDays++;
        	System.out.println("part Time Employee wage for "+totalWorkingDays+"days is: "+((wagePerHour/2)*fullDayHours*totalWorkingDays));
        		}else {
        			System.out.println("part Time Employee wage for "+totalWorkingHours+"hours is:"+((wagePerHour/2)*totalWorkingHours));
        			totalWorkingHours++;
        		}
        	}System.out.println("Employee Is Present But PartTime:");

        	break;
        default:
        	System.out.println("Employee is Abscent:");
        	break;
        }
	}

}
