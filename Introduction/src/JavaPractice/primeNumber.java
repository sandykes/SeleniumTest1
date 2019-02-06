package JavaPractice;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter the number");
		int number=scan.nextInt();
		
		int i;
		int num=0;
		String prime=" ";
		for(i=1;i<number;i++)
		{
			
			int counter =0;
			for(num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					counter=counter+1;
				}
				
			}
			if(counter==2)
			{
				prime=prime+i+" ";
			}
		}
		System.out.println("Prime number between 1 and "+number+" are:");
		System.out.println(prime);
	}
}
