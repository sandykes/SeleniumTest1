package JavaPractice;

public class Removeunwanted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="45456 $%&&& Sndy kesDDDDD **********";
		s=s.replaceAll("[^a-zA-Z]","");
		System.out.println(s);
		
		
		int num=56789;
		int res=0;
		while(num!=0)
		{
			res=res*10 + num % 10;
			num=num/10;
		}
		System.out.println(res);
		int num1=234;
		StringBuffer sb=new StringBuffer(String.valueOf(num1));
		System.out.println(sb.reverse());
		

	}

}
