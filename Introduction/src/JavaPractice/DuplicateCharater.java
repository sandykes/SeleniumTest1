package JavaPractice;

public class DuplicateCharater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "W3schools";
		int cnt=0;
		char[] inp=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(inp[i]==inp[j])
				{
					System.out.println(inp[j]);
					cnt++;
					System.out.println(cnt);
					break;
					
					
				}
				
			}
		}

	}

}
