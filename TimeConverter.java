/**
 * Agamjot Singh
 * CH.7 TimeCoverter
 */

 import java.util.Scanner;
  
public class TimeConverter {
	
	/*
	* Converts and displays hours into minutes. 
	* pre: hours > 0
	* post: amount of minutes in the hours entered is calculated and displayed
	*/
    public static void hoursToMins() { 

		int hours, mins;
		Scanner input = new Scanner(System.in); 

		System.out.print("Enter the number of hours: ");
		hours = input.nextInt(); 
		input.close();

		mins = hours * 60;

		System.out.println("There are " + mins + " minutes in " + hours + " hours.");
	
    }  
    
    /*
	* Converts and displays days into hours. 
	* pre: days > 0
	* post: amount of hours in the days entered is calculated and displayed
	*/
    public static void daysToHours() { 
    	
		int day, hours;
		Scanner input = new Scanner(System.in); 

		System.out.print("Enter the number of days: ");
		day = input.nextInt(); 
		input.close();

		hours = day * 24;

		System.out.println("There are " + hours + " hours in " + day + " days.");
	
    }  
    
    /*
	* Converts and displays minutes into hours. 
	* pre: minutes > 0
	* post: amount of minutes in the hours entered is calculated and displayed
	*/
    public static void minsToHours() { 
    	
		int min, hours;
		Scanner input = new Scanner(System.in); 

		System.out.print("Enter the number of minutes: ");
		min = input.nextInt(); 
		input.close();

		hours = min / 60;

		System.out.println("There are " + hours + " hours in " + min + " minutes.");
	
    }
    
    /*
	* Converts and displays hours into days. 
	* pre: hours > 0
	* post: amount of days in the hours entered is calculated and displayed
	*/
    public static void hoursToDays() { 
    	
		int hours, day;
		Scanner input = new Scanner(System.in); 

		System.out.print("Enter the number of hours: ");
		hours = input.nextInt(); 
		input.close();

		day = hours / 24;

		System.out.println("There are " + day + " days in " + hours + " hours.");
	
    }    		    		  		
    
	public static void main(String[] args) { 

		int choice;
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. Hours to minutes.");
		System.out.println("2. Days to hours.");
		System.out.println("3. Minutes to hours.");
		System.out.println("4. Hours to days.");
		System.out.print("Enter your choice: ");
		choice = input.nextInt(); 
		
		switch (choice) {
		case 1: hoursToMins(); break; 
		case 2: daysToHours(); break;
		case 3: minsToHours(); break;
		case 4: hoursToDays(); break;
		}

	}
}
