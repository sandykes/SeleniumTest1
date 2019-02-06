package oops;

public class PrintTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=20,a=0,b=1,i,c;
		
		System.out.print(a+" "+b);
		
		for( i=2;i<n;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		

	}

}
