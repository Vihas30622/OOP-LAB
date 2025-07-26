package JAVA;

import java.util.Scanner;

public class Perfect_Number {

	public static void main(String args []) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		num = sc.nextInt();
		
		int S = 0;
		
		int t = 0;
		for(t=1;t<num;t++)
		{
			if(num%t==0&&t!=num)
			{
				S=S+t;
			}
			
		}
		
		System.out.println(S);
		
		
		
		

	}

}
