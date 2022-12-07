package SMS;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class FeeCalculationAndRegisterStudent {

	// test case for register student 

	@Test
	void Test1() { 
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream(); 
		System.setOut(new PrintStream(outContent));  
		Main m = new Main(); 
		m.Menu(); 
		String c = outContent.toString(); 
		assertEquals(true,c.contains("You are registered succesfully")); 
	}

	// test case for Fee Payment when student is not registered
	@Test
	void Test2() {

		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Main m = new Main();
		m.Menu();
		String c = outContent.toString();
		assertEquals(true,c.contains("No such Record Found"));

	}


	//test case for Fee Payment when fee is paid
	@Test
	void Test3() {

		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Main m = new Main();
		m.Menu();
		String c = outContent.toString();
		assertEquals(true,c.contains("\tFee paid!!\nFee Submitted.\nTHANK YOU!!"));

	}




	// test case when paid fees is less than 5000
	@Test
	void Test4() { 
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream(); 
		System.setOut(new PrintStream(outContent));  
		Main m = new Main(); 
		m.Menu(); 
		String c = outContent.toString(); 
		assertEquals(true,c.contains("\nYour Balance Amount is Not Enough to Pay the Fee")); 
	}

	// test case when entering invalid number and then entering valid number
	@Test
	void Test5() { 
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream(); 
		System.setOut(new PrintStream(outContent));  
		Main m = new Main(); 
		m.Menu(); 
		String c = outContent.toString(); 
		assertEquals(true,c.contains("\nThank you for your payemnt!!")); 
	} 

	// test case when entering invalid number and then entering less fees
	@Test
	void Test6() { 
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream(); 
		System.setOut(new PrintStream(outContent));  
		Main m = new Main(); 
		m.Menu(); 
		String c = outContent.toString(); 
		assertEquals(true,c.contains("\nYour Balance Amount is Not Enough to Pay the Fee")); 
	}
}
