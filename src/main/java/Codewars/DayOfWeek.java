package Codewars;

import java.util.Scanner;

public class DayOfWeek {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the number to calculate the day of the week");
	int n = sc.nextInt();
	System.out.println(getDay(n));
}
    public static String getDay(int n) {
        //magic here
      switch(n) {
      case 1: 
        return "Sunday";
        
      case 2: 
        return "Monday";
        
      case 3: 
        return "Tuesday";
        
      case 4: 
        return "Wednesday";
        
      case 5: 
        return "Thursday";
        
      case 6:
        return "Friday";
       
      case 7:
        return "Saturday";
     
      default:
        return "Wrong, please enter a number between 1 and 7";
     
      }
   }
}
