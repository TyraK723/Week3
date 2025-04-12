package Week3;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName="Bob";
		String lastName="Ross";
		String fullName=createFullName (firstName, lastName);
		String fullName2=createFullName("Sam", lastName);
		
		System.out.println(fullName);
		System.out.println(fullName2);
		
		int[] intArray = new int[3];
		intArray[0]=7;
		intArray[1]=8;
		intArray[2]=9;
		
		System.out.println(sumArray(intArray));
		
		double[]grades= new double[5];
		grades[0]=88.7;
		grades[1]=93.1;
		grades[2]=79.5;
		grades[3]=83.4;
		grades[4]=80.9;
		
		System.out.println(calculateAverage(grades));
		
		System.out.println(multiplyString("Hello, ", 3));
		
	}
public static String createFullName(String firstName, String lastName) {
	return firstName+ " "+ lastName;
}
	//Take an array of ints and return the sum of all ints
	public static int sumArray(int[] numbers) {
		int sum=0;
		for (int number:numbers) {
			sum+=number;
		}
		return sum;
		}
	
	
	//Take an array of doubles and return the average of all elements
	
	public static double calculateAverage(double[] numbers) {
		double sum=0;
		for(double number:numbers) {
			sum+=number;
		}
		return sum /numbers.length;
	}
	
	//Take a string and an int return the string concaternated with 
	//itself int number of times
	
	public static String multiplyString(String str, int num) {
		String resultStr="";
		for (int i=0; i<num; i++) {
			resultStr+=str;
		}
		return resultStr;
	}

}

