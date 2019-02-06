package JavaPractice;

public class SwitchSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade='b';
		
		switch(grade) {
		

		case 'A':
			System.out.println("Excellent...Your garde is:" +grade);
			break;
		case 'B':
			System.out.println("Good ..Your garde is:" +grade);
			break;
		case 'C':
			System.out.println("Passed...Your garde is:" +grade);
			break;
		default :
			System.out.println("Invalid grade : " +grade);

		
		
		}
		for (int i=0;i<4;i++)
		{
			
			System.out.println("Hello");
		}

		
	}

}
