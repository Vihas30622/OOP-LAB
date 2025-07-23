package JAVA;
import java.util.Scanner;

public class OOPJAVA{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fahrenheit : ");
		int F;
		F = sc.nextInt();
		
		double C;
		C = 5.0/9.0*(F-32);
		
		System.out.println(F + " Converted to Celsius is " + C);
	}
}