package JavaPractice;

public class DivideByNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 System.out.println("Divided by 3:");
  for(int i=0;i<=100;i++)
  {
	  if(i%3==0)
	  {
		  System.out.print(i+ " ," );
	  }
  }
	//System.out.println();

  System.out.println(" \n \nDivided by 5:");
  for(int i=0;i<=100;i++)
  {
	  if(i%5==0)
	  {
		  System.out.print(i +" ,");
	  }
  }
	//System.out.println();

 System.out.println("\n \nDivided by 3 & 5 :");
	  for(int i=0;i<=100;i++)
	  {
		  if(i%3==0 && i%5==0)
		  {
			  System.out.print(i+ ",");
		  }
	  }
  
		System.out.println("\n");
	}

}
