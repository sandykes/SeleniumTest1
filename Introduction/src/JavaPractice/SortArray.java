package JavaPractice;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,9,7,6,4,2};
		
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if (a[i]>a[j])
				{
					temp=a[i];
					
					a[i]=a[j];
					a[j]=temp;
					
				}

			}
		}
		System.out.println("Ascending order:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ ", ");
			
		}
		

	}

}
