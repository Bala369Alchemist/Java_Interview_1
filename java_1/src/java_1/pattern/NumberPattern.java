package java_1.pattern;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int rows = sc.nextInt();
		int n = 1;
		for(int i = 1 ; i<= rows ; i++) {
			for(int j = 1 ; j<=i ; j++) {
				System.out.print(n++ +" ");
			}
			System.out.println();
		}
		
	}
	
}
