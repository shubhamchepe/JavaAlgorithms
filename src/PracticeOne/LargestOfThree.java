package PracticeOne;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[3];
		
		System.out.println("Enter first number : ");
		numbers[0] = sc.nextInt();
		
		System.out.println("Enter second number : ");
		numbers[1] = sc.nextInt();
		
		System.out.println("Enter third number : ");
		numbers[2] = sc.nextInt();
		
		int largest = numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i] > largest) {
				largest = numbers[i];
			}
		}
		System.out.println("The largest number is : " + largest);
	}
}
