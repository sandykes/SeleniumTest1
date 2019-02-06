package oops;

public class Largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {28,60,59,78};
		int val=arr[0];
		
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]> val)
			{
				val=arr[i];
			}
		}
		
		System.out.println("Largest value"+val);

	}

}
