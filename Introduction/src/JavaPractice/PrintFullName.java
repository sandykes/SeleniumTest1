package JavaPractice;

import java.util.Scanner;

public class PrintFullName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your First Name");
		String fName=scan.next();
		System.out.println("Enter Your Last Name");
		String lName= scan.next();
		System.out.println("Hello \n"+ fName+ " "+lName);
		System.out.println("Enter 1st number");
		int f1=scan.nextInt();
		System.out.println("Enter 2nd number");
		int f2=scan.nextInt();
		int sum= f1+f2;
		System.out.println(sum);
		int multi=f1*f2;
		System.out.println(multi);
		int mod=f1%f2;
		System.out.println(mod);

	}

}
