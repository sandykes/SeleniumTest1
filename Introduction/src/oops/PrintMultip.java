package oops;

import java.util.Scanner;

public class PrintMultip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,c;

Scanner in=new Scanner(System.in);

System.out.println("Please enter the number which multiplication table you want:");
  n=in.nextInt();
  
  for(c=1;c<=10;c++)
  {
	  System.out.println(n+""+"*" +" "+c+" "+"="+(n*c));
  }
	}

}
