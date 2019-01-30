package JavaPractice;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Input number:");
		int n=scan.nextInt();
		
		System.out.printf("%d + %d%d+ %d%d%d \n", n,n,n,n,n,n);
		int a[]= new int[4]	;
		a[0]=1;
		a[1]=30;
		a[2]=15;
		System.out.println(a.length);
		
		for (int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
	}
	

}
