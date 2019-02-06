package JavaPractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan= new Scanner(System.in);
		System.out.println("Please enter String");
		char[] letters=scan.nextLine().toCharArray();
		
		System.out.print("Reversed String:");
		for(int i=letters.length-1;i>=0;i--)
		{
			System.out.print(letters[i]);
		}
		
		System.out.print("\n"); */
		String s="Sandyakes";
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res=res+s.charAt(i);
		}
		System.out.println(res);

	}

}
