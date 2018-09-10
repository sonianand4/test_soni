package week4;

import java.util.Scanner;

public class LargestandSmallest {

	public static void main(String[] args) {
		 System.out.println("enter number");
	        int num = new Scanner(System.in).nextInt(), numCopy = num, digit, large = 0, small = 10;
	        if(num == 0) {
	            small = 0;
	        }
	        else {
	            while(num > 0) {
	                digit = num % 10;
	                if(digit > large)
	                    large = digit;
	                if(digit < small)
	                    small = digit;
	                else if(digit == 0)
	                    small = 0;
	                num /= 10;
	            }
	        }
	        System.out.println("Largest digit in " + numCopy + " is: " + large);
	        System.out.println("Smallest digit in " + numCopy + " is: " + small);
	    }
	}


