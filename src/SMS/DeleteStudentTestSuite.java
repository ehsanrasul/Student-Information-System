package SMS;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class DeleteStudentTestSuite {

	
//Deleting a Student
//Enter 1 and Then Roll Number	
	
//	@Test
//	void Test1() {
//
//		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(outContent));
//		Main obj = new Main();
//		obj.Menu();		
//		String c = outContent.toString();
//		assertEquals(true,c.contains("Student Deleted!!"));
//
//	}


	
	//Deleting a Student
	//Enter 1 and Then Roll Number	
	
	
	@Test
	void Test2() {

		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Main obj = new Main();
		obj.Menu();		
		String c = outContent.toString();
		assertEquals(true,c.contains("No such Record Found"));

	}
	

}
