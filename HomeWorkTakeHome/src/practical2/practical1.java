package practical1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class practical1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Practical 1: Generate 500 random numbers and print the nth smallest  
//		number in a programming language of your choice.
//		(Ask user for the Nth smallest number)
		
		try (Scanner input = new Scanner(System.in)) {
			Random rnd = new Random();
			int[] array = new int [500];
			for (int i =0;i< 500; i++) {
				array[i]= rnd.nextInt(99999);
			}
			
			Arrays.sort(array);
			Arrays.toString(array);
			System.out.println("the total amount of randome numbers are " + array.length);
			System.out.println(Arrays.toString(array));
			System.out.print("Enter the value of N to find the Nth smallest number: ");
			int n = input.nextInt();
			System.out.println("The " + n + "th smallest number is: " + array[n - 1]);
		}
	}


		
		
	}


