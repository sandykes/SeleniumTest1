package JavaPractice;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random re= new  Random();
	int value=	re.nextInt(50);
	System.out.println(value);
for (int i=0;i<=5;i++)
{
	System.out.println(re.nextInt(15));
}
	}

}
