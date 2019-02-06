package JavaPractice;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			if(i==2) {
				break;
			}
		}
		
		int x=0;
		while(x<=10)
		{
			System.out.println(x);
			if(x==2)
			{
				break;
			}
			x++;
		}
		
		//do while
		int y=20;
		
		do 
		{
			System.out.println(y);
			if(y==18)
			{
				break;
			}
			y--;
		}while(y>=0);
		
		
	}

}
