package JavaPractice;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5678;
		int res=0;
		while(n!=0)
		{
			res=res*10;
			res=res+n%10;
			n=n/10;
		}
		System.out.println(res);
		

	}

}
