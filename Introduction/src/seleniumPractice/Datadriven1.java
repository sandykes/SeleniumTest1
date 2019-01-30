package seleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Datadriven1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Datadriven1 t=new Datadriven1();
		t.test1();
	}
	public void test1() throws IOException {
		
		Properties prop=new Properties();
		FileInputStream  fis= new FileInputStream("C:\\Users\\surya\\eclipse-SandyWorksapce\\Introduction\\src\\seleniumPractice\\dataset1.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("UserName"));
	}

}
