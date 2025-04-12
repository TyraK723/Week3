package Week3;

import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] students = new String[3];
		
		students[0] = "Tom Sawyer";
		students[1] = "Jack Smith";
		students[2] = "Bill Turner";
		
//		for (int i =0; i < students.length; i++) {
		
	//	System.out.println(students[i]);
//		}
		
		for (String student : students) {
			System.out.println(student);
		}
		
		int[] multiplesOf3 = new int[10];
		
		for (int i=1; i<=multiplesOf3.length; i++) {
			multiplesOf3[i-1]=i*3;
			System.out.print("Number is " +multiplesOf3[i-1]);
		}
		System.out.println();
		
		int[] multiplesOf5= new int[10];
		
		for (int i=0; i<multiplesOf5.length; i++) {
			multiplesOf5[i]= (i+1)*5;
			System.out.print(multiplesOf5[i]+" ");
		}
		
	}
	
	

}
