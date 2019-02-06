package JavaPractice;

public class Stringmanup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="This is Sandy kes";
		//length
		System.out.println(str.length());
		//split
		
		String st[] =str.split(" ");
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}

		//character at specific index
		System.out.println(str.charAt(5));
		//index of specific character
		System.out.println(str.indexOf("Sandy"));
		System.out.println(str.indexOf('s')); //returns first character
		System.out.println(str.indexOf('s', str.indexOf('s')+1));
		//substring
		System.out.println(str.substring(2,7));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.replace(" ", "_"));
		
		System.out.println(str.concat("Hello"));
		String s="    Hi! friends   ";
		System.out.println(s.trim());
		
		String str1="This is Sandy kes";
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println(str.compareToIgnoreCase(str1));
		String res=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
		res=	res+str.charAt(i);
		}
		System.out.println(res);
		
		
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
		
		
		
		
	}

}
