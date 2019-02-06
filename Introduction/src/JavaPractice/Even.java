package JavaPractice;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String result=isEven(5);
         System.out.println(result);
         
	}
	
	private static String isEven(int num)
	{
		
		
		String str;
		if(num%2==0)
		{
			str=num +" is Even";
		}
		else
		{
			str=num +" is odd";

		}
		return str;
	}

}
