package SMS;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class SignupTestSuite {

//	//Test case for Signup
//	@Test
//	void Test1() {
//
//		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(outContent));
//		Main obj = new Main();
//		obj.MainMenu();
//		String c = outContent.toString();
//		assertEquals(true,c.contains("Registered Successfully"));
//
//	}
	
	


//	
//	@Test
//	void Test2() {
//
//		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(outContent));
//		Main obj = new Main();
//		obj.MainMenu();
//		String c = outContent.toString();
//		assertEquals(true,c.contains("You Entered Invalid Age"));
//
//	}


	
	
	//Entering a String age and getting an error
//	@Test
//	void Test3() {
//
//		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(outContent));
//		Main obj = new Main();
//		obj.MainMenu();
//		String c = outContent.toString();
//		assertEquals(true,c.contains("You Entered Invalid Age"));
//
//	}

	
	
	
	
	//Entering Digits in the Name
//	@Test
//	void Test4() {
//
//		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(outContent));
//		Main obj = new Main();
//		obj.MainMenu();
//		String c = outContent.toString();
//		assertEquals(true,c.contains("Name cannot Contain Numbers"));
//
//	}


	//	Entering More than 11 Digits in the Contact Number
	@Test
	void Test5() {

		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Main obj = new Main();
		obj.MainMenu();
		String c = outContent.toString();
		assertEquals(true,c.contains("Contact Number Cannot contain More than 11 Digits"));

	}

	
	
	
}
