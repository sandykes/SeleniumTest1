package JavaPractice;

public class Child extends Parent {
	String s2="This is in child";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c= new Child();
		c.test1();
		c.test2();
		System.out.println(c.s);
		System.out.println(c.a);
	}
	public void test3()
	{
		System.out.println("this is in Child class");
	}

}
