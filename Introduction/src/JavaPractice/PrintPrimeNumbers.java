package JavaPractice;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int num=0;
		String primeNumbers= " ";
		
		for(i=1;i<=20;i++)
		{
			int counter=0;
			for(num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					counter=counter+1;
				}
			}
				if(counter==2)
				{
					primeNumbers=primeNumbers + i + " ";
				}
			}
		
			System.out.println("Prime numbers from 1 to 20  are :");
			System.out.println(primeNumbers);
				
		
		
	}

}
