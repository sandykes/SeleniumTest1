package JavaPractice;

import java.util.Arrays;

public class ArrayPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a= {5,6,9,10};
		int []  b= new int[4];
		b[0]=8;
		b[1]=9;
		b[2]=5;
		b[3]=2;
		int sum=0;
		int [] c=Arrays.copyOf(b, b.length);
		c[1]=35;
		for(int num: c)
		{

			System.out.println(num);
			
		
		}
		
		

		System.out.println();
		
	
	for(int num: b)
	{
		System.out.println(num);
		
	}
	
	System.out.println();
	
		
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
		sum=sum+a[i];

	}
	System.out.println(sum);


	}

}
