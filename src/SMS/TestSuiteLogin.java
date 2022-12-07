package SMS;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class TestSuiteLogin {

//	@Test
//	void Test1() {
//
//		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(outContent));
//		Main obj = new Main();
//		obj.MainMenu();
//		String c = outContent.toString();
//		assertEquals(true,c.contains("Logged In Successfully"));
//
//	}


	@Test
	void Test2() {

		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Main obj = new Main();
		obj.MainMenu();
		String c = outContent.toString();
		assertEquals(true,c.contains("OOPS ! Your Credentials are not Correct"));

	}

	
}
