package java_1.pattern;

import java.util.Scanner;

public class InvertedPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of rows: ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i<=n ; i++) {
			
			for(int j = 0 ; j <= i ; j++) {
				System.out.print(" ");
			}
			
			for(int k = i ; k <=n ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
}
