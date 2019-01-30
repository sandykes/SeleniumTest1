package JavaPractice;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a=new int[4];
		a[0]=5;
		a[1]=9;
		a[2]=4;
		a[3]=10;

		int temp;
		
		for(int i=0;i<a.length;i++)
			
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
							}

			
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}

			
	}

}
