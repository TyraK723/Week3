package Week3;

import java.util.Scanner;

public class Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Sally May";
		System.out.println(name.length());
		
		String a="Hello";
		String b="Hello";
		System.out.println(a.equals(b));
		
		int[] arr= {50, 25, 0, 25, 50};
		int j = arr.length;
		int[] reverseArr = new int[j];
		
		for ( int i = 0; i < arr.length; i++ ) {
		    reverseArr[j-1] = arr[i];
		    j--;
		}
		
		for ( int x : arr ) {
		    System.out.println(x);
		}
		for ( int y : reverseArr ) {
		    System.out.println(y);
		}
		
}
}