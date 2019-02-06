package JavaPractice;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{2,3,4,},{3,5,6},{8,9,1}};
		int min= a[0][0];
		for (int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a.length;j++)
			{
				System.out.println(a[i][j]);
				if(a[i][j]<min)
				{
					min=a[i][j];
					System.out.println(min);
					
				}
			}
		}
	}

}
