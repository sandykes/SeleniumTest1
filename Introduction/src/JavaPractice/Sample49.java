package JavaPractice;

import java.util.Scanner;

public class Sample49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Input Number :" );
		int number=scan.nextInt();
		scan.close();
		if (number%2==0)
		{
		System.out.println("Even number");
		System.out.println("1");
		}
		else 
		{
			System.out.println("0");
		}
	}

}
