package JavaPractice;

public class ArrayMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] a= {{3,5,6},{4,8,9},{1,9,5}};
int sum=0;

for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a[i].length;j++)
	{
		System.out.print(a[i][j]+ " ");
		sum=sum+a[i][j];
	}
	System.out.println();
}
System.out.println(sum);

}
	}


