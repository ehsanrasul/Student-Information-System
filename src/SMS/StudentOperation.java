package SMS;

import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StudentOperation {

	public static LinkedList<StudentInfo> list = new LinkedList<StudentInfo>();
	private static StudentInfo record;
	@SuppressWarnings("unused")
	private static int numOfStudent = 0;
	static int totalmarks = 500;
	static int STUDENT_FEE = 5000;
	static int courseMarks = 100;
	static boolean isgrade = false;
	static Scanner cin = new Scanner(System.in);
	
	private static Queue<Integer> counterList = new LinkedList<Integer>();
    static int counter=1;

	public StudentOperation() {
	}

	public void addStudent(String fname, String lname, int Age, String rollno, String dept, String Address, int enrollYear,
			String number, String email, String course1, String course2, String course3, String course4, String course5) {

		list.add(new StudentInfo(fname, lname, Age, rollno, dept, Address, enrollYear, number, email, course1, course2,
				course3, course4, course5));
		numOfStudent++;
	}
	
	 public static void counter() {

	        counterList.add(counter);
	        System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\tSo far "+ counter + " student registered to the system!!\n\n ");
	        counter++;

	    }

	public void getResult() {
		System.out.println("\n**********************************************************************************");
		System.out.println("\t\t\tRESULT CALCULATION");
		System.out.println("**********************************************************************************\n");
		System.out.println("Please enter your subject numbers:\n");
		System.out.println("\nEnter course1 marks out of " + courseMarks);
		int c1 = cin.nextInt();
		System.out.println("Enter course2 marks out of " + courseMarks);
		int c2 = cin.nextInt();
		System.out.println("Enter course3 marks out of " + courseMarks);
		int c3 = cin.nextInt();
		System.out.println("Enter course4 marks out of " + courseMarks);
		int c4 = cin.nextInt();
		System.out.println("Enter course 5 marks out of " + courseMarks);
		int c5 = cin.nextInt();
		int sum = c1 + c2 + c3 + c4 + c5;
		float percentage = (sum * 100) / totalmarks;
		System.out.println("From " + totalmarks + " marks you got " + sum + " marks in total.\n");
		System.out.println("\nThe student Percentage is: " + percentage);

		System.out.print("\nThe student Grade is: ");
		if (percentage >= 80) {
			isgrade = true;
			System.out.print("A");
		} else if (percentage >= 60 && percentage < 80) {
			isgrade = true;
			System.out.print("B");
		} else if (percentage >= 50 && percentage < 60) {
			isgrade = true;
			System.out.print("C");
		} else if (percentage >= 40 && percentage < 50) {
			isgrade = true;
			System.out.print("D");
		} else {
			isgrade = false;
			System.out.println("E");
		}

	}

	public void getResultInfo() {
		System.out.println("\n\n**********************************************************************************");
		System.out.println("\t\t\tRESULT STATUS");
		System.out.println("**********************************************************************************\n");
		if (isgrade == true) {
			System.out.println("\t\n\tPASS\nCongratulations!!\nnYou have Passed the exams\n");
		} else if (isgrade == false) {
			System.out.println("\t\n\tOOPS unfortunately you have Failed in exams\nBest wishes for the next time.\n");
		}

	}

	public void viewStudent() {
		System.out.println("\n**********************************************************************************");
		System.out.println("\t\t\tSTUDENTS INFORMATION");
		System.out.println("**********************************************************************************\n");

		for (StudentInfo record : list) {
			record.getStudentInfo();

		}
	}

	public void deleteStudent(StudentInfo record) {
		list.remove(record);
		numOfStudent--;
		System.out.println("\n\tStudent Deleted!!");
	}

	public StudentInfo search(String rollNum) {

		for (StudentInfo record : list) {

			if (record.getRollNumber().equals(rollNum)) {
				System.out.println("\n");
				//record.getStudentInfo();
				return record;

			}
		}
		return null;
	}

	public void print(String rollNum) {
		record = search(rollNum);
		if (record == null) {
			System.out.println("There is no Student of this Roll number");
		} else {
			record.getStudentInfo();
		}

	}
	
	
	public void setFeeStatus(String rollNum) {
		
		for (StudentInfo record : list) {

			if (record.getRollNumber().equals(rollNum)) {
				System.out.println("\n");
				record.setFeeStatus(true);
				break;
			}
		}		
		
	}	
}
