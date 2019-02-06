package JavaPractice;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Sting to integer conversion
		String s="100";
		System.out.println(s+20);
		int t=Integer.parseInt(s);
		System.out.println(t+20);
		//String to boolean
		String bol="True";
		System.out.println(bol);
		boolean b=Boolean.parseBoolean(bol);
		System.out.println(b);
		//int to string
		int r=200;
		String y=String.valueOf(r);
		System.out.println(y+30);
	}

}
