package oops;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp;
		
		int a[]= {7,9,10,6,8,5};
		
		for(int i=0;i<a.length;i++)
		
		{
			for(int j=i;j>0;j--)
			{
				if(a[j]<a[j-1])
				{
					temp=a[j];
					
					a[j]=a[j-1];
					a[j-1]=temp;
					}
			}
		}
		

}
}