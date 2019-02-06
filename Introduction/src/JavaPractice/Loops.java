package JavaPractice;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		System.out.println("Please enter first number:");
		
		int a=in.nextInt();
		
		System.out.println("Please enter second number:");
		int b=in.nextInt();
		System.out.println("Please enter third number:");
		int c=in.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("First number is biggest:" +a);	

		}else if(b>c)
		{
			System.out.println("Second number is biggest:" +b);

		}else
		{
			System.out.println("Third number is biggest:" +c);

		}	
		
		
	}
}

