package JavaPractice;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter number");
		int n=scan.nextInt();
		for(int i=0;i<=10;i++)
		{
			System.out.println(n+" *"+(i+1)+" ="+(n*(i+1)));
			
			
		}
	}

}
