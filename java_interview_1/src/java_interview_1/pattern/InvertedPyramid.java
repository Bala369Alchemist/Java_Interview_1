package java_interview_1.pattern;

import java.util.Scanner;

public class InvertedPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of rows : ");
		int  number = sc.nextInt();
		for(int  i = 1 ; i <=number ; i++) {
			for(int j = 0; j<=i;j++) { // for space
				System.out.print(" ");
			}
			for(int k=i;k<=number;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
}
