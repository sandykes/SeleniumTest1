package JavaPractice;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]={8,7,9,5};
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+",");
		}
		System.out.println();
		String str="Sndyakes";
		
		String res="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			res=res+str.charAt(i);
		}
		System.out.println(res);
		
	}
}
