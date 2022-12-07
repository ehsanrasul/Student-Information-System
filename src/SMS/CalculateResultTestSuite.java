package SMS;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class CalculateResultTestSuite {
	
 //test case for grade A	
//	@Test
//	void Test1() {
//
//		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(outContent));
//		Main m = new Main();
//		m.Menu();
//		String c = outContent.toString();
//		assertEquals(true,c.contains("The student Grade is: A"));
//
//	}
	
// test case for grade B	
//@Test
//void Test2() {
//
//	final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//	System.setOut(new PrintStream(outContent));
//	Main m = new Main();
//	m.Menu();
//	String c = outContent.toString();
//	assertEquals(true,c.contains("The student Grade is: B"));
//}
	
// test case for grade C	
//	@Test
//	void Test3() {
//
//		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(outContent));
//		Main m = new Main();
//		m.Menu();
//		String c = outContent.toString();
//		assertEquals(true,c.contains("The student Grade is: C"));
//	}
	
// test case for grade D	
//	@Test
//	void Test4() {
//
//		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(outContent));
//		Main m = new Main();
//		m.Menu();
//		String c = outContent.toString();
//		assertEquals(true,c.contains("The student Grade is: D"));
//	}
	
// test case for grade E
	@Test
	void Test5() {

		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Main m = new Main();
		m.Menu();
		String c = outContent.toString();
		assertEquals(true,c.contains("The student Grade is: E"));

	}

// For BUGS
	
	//check for negative input value
//	@Test
//	void Test6() {
//
//		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(outContent));
//		Main m = new Main();
//		m.Menu();
//		String c = outContent.toString();
//		assertEquals(true,c.contains("OOPS unfortunately you have Failed in exams"));
//
//	}
	
////check for more than 100 input value
//	@Test
//	void Test7() {
//
//		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(outContent));
//		Main m = new Main();
//		m.Menu();
//		String c = outContent.toString();
//		assertEquals(true,c.contains("Congratulations!!"));
//
//	}
//check for string input value and it should fail
//	@Test
//	void Test8() {
//
//		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(outContent));
//		Main m = new Main();
//		m.Menu();
//		String c = outContent.toString();
//		assertEquals(true,c.contains("Congratulations!!"));
//
//	}
}