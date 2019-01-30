package oops;

public class arrayreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res="";
		int a[]= {1,8,6,7,9};
		String s="Sandyarani";
		for(int i=s.length()-1;i>=0;i--)
		{
			res=res+s.charAt(i);
			
		}
		System.out.println(res);
		StringBuffer Sb=new StringBuffer("This is reverse");
		System.out.println(Sb.reverse());
		
		String str="This is Apple and Orange";
		
	
		
		
		/*System.out.println(a.length);
		for (int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
			
		}*/
	

}
}