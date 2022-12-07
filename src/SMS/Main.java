package SMS;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner cin = new Scanner(System.in);
	static boolean isExit = false;
	static int courseMarks = 100;
	static StudentOperation operation;
	static ArrayList <Teacher> teacher = new ArrayList<>();


	Main(){

		operation = new StudentOperation();
		operation.list.add(new StudentInfo("Ehsan", "Rasul", 19, "20i-1812", "CE" , "house no.3", 2020, "ehsan@gmail.com","03110948524","english","math","urdu","object oriented","C++"));
		DB();
		
	}	
	
	
	public static void main(String[] args) {
		operation = new StudentOperation();
		DB();
		MainMenu();		
	}
	

	
	public static void addStudentData() {

		System.out.println("\n**********************************************************************************");
		System.out.println("\t\t\tEnter Student information");
		System.out.println("**********************************************************************************\n");
		System.out.println("First Name: ");
		String fname = cin.next();
		System.out.println("Last Name: ");
		String lname = cin.next();
		cin.nextLine();
		System.out.println("Roll Number: ");
		String rollNum = cin.next();
		cin.nextLine();
		System.out.println("Department(Like CE,BE,EE): ");
		String depart = cin.nextLine();
		System.out.println("Enrollment Year: ");
		int enrollmentYear = cin.nextInt();
		System.out.println("Age: ");
		int age = cin.nextInt();
		cin.nextLine();
		System.out.println("Address: ");
		String Address = cin.nextLine();
		System.out.println("Email Address: ");
		String email = cin.nextLine();
		System.out.println("Contact Number: ");
		String number = cin.nextLine();
		System.out.println("\n**********************************************************************************");
		System.out.printf("\t\t\tCOURSE SELETION\n");
		System.out.println("**********************************************************************************\n");

		System.out.println("Please Select five of your courses from given list:\n");

		System.out.println("\n1.\tENGLISH\n2.\tMATH.\n3.\tJAVA.\n4.\tURDU.\n5.\tDATA STRUCTURES.\n6.\tLOGIC GATES.\n7."
				+ "\tCIRCUIT ANALYSIS.\n8.\tOBJECT ORIENTED.\n9.\tC++.\n10.\tADVANCE ENGINEERING.\n");
		System.out.println("Course:01");
		String courseName1 = cin.nextLine();
		System.out.println("Course marks: " + courseMarks);
		System.out.println("Course:02");
		String courseName2 = cin.nextLine();
		System.out.println("Course marks: " + courseMarks);
		System.out.println("Course:03");
		String courseName3 = cin.nextLine();
		System.out.println("Course marks: " + courseMarks);
		System.out.println("Course:04");
		String courseName4 = cin.nextLine();
		System.out.println("Course marks: " + courseMarks);
		System.out.println("Course:05");
		String courseName5 = cin.nextLine();
		System.out.println("Course marks: " + courseMarks);

//		System.out.println("\n**********************************************************************************");
//		System.out.println("\t\t\tFEES PROCESS");
//		System.out.println("**********************************************************************************\n");
//		System.out.println("Your Total Fees is Rs: " + StudentOperation.STUDENT_FEE);
//		System.out.println("Enter your payemnt Rs:");
//		int payment = cin.nextInt();
//		int remainingBalance = 0;
//		if (payment == StudentOperation.STUDENT_FEE) {
//			System.out.println("\nThank you for your payemnt!!");
//		} else if (payment < StudentOperation.STUDENT_FEE) {
//			remainingBalance = StudentOperation.STUDENT_FEE - payment;
//			System.out.println("\nYour Balance Amount is Rs: " + remainingBalance);
//		} else if (payment > StudentOperation.STUDENT_FEE) {
//			remainingBalance = payment - StudentOperation.STUDENT_FEE;
//			System.out.println("You remaining amount is Rs: " + remainingBalance);
//		} else {
//			System.out.println("Invalid Number\nSubmit your fees again. ");
//			payment = cin.nextInt();
//			if (payment == StudentOperation.STUDENT_FEE) {
//				System.out.println("\nThank you for your payemnt!!");
//			} else if (payment < StudentOperation.STUDENT_FEE) {
//				remainingBalance = StudentOperation.STUDENT_FEE - payment;
//				System.out.println("\nYour Balance Amount is Rs: " + remainingBalance);
//			}
//
//		}
//
//		System.out.println("\n**********************************************************************************");
//		System.out.println("\t\t\tFEE STATUS");
//		System.out.println("**********************************************************************************\n");
//		if (remainingBalance == 0) {
//			System.out.println("\tFee paid!!\nFees Submitted.\nTHANK YOU!!");
//		} else {
//			System.out.println("\tFees unpaid!!\nPlease submit your Fees.\nTHANK YOU!!");
//		}

		operation.addStudent(fname, lname, age, rollNum, depart, Address, enrollmentYear, number, email, courseName1,
				courseName2, courseName3, courseName4, courseName5);

	}
	
	
	public static void Menu() {
		
		System.out.println("**********************************************************************************");
		System.out.println("\t\t\tSTUDENT INFORMATION SYSTEM");
		System.out.println("**********************************************************************************");

		//do {
			System.out.println("\t\tPlease select the action you want to perform");
			System.out.println("Press 1 for: Registering a Student");
			System.out.println("Press 2 for: Fee Payment");
			System.out.println("Press 3 for: Find a student");
			System.out.println("Press 4 for: Delete a student");
			System.out.println("Press 5 for: Checking And Calculating Result");
			System.out.println("Press 6 for: Listing the Entire Student Records");
			System.out.println("Press 7 for: Logout");
			
		
			int choosenCase = cin.nextInt();

			switch (choosenCase) {
			case 1:

				addStudentData();
				
				break;

			case 2:
				
				System.out.println("\nPlease enter student roll number");
				String rollNumber = cin.next();
				StudentInfo stud = operation.search(rollNumber);
				if(stud != null)
				{
					//stud.getStudentInfo();
					feePayment(stud);
				}	
				else {
					
					System.out.println("No such Record Found");
					
				}
				
				
			
				break;

				
			case 3:

				System.out.println("\nPlease enter student roll number");
				rollNumber = cin.next();
				stud = null;
				stud = operation.search(rollNumber);
				if(stud != null)
				{
					System.out.println("Student Record Found !");
					stud.getStudentInfo();					
				}	
				else {
					
					System.out.println("No such Record Found");
					
				}
				
				
				break;

			case 4:

				System.out.println("\nPlease enter student roll number: ");
				rollNumber = cin.next();
				operation.deleteStudent(operation.search(rollNumber));
				break;

			case 5:

				operation.getResult();
				operation.getResultInfo();
				break;

			case 6:

				operation.viewStudent();
				StudentOperation.counter();
				
			break;
				
			case 7:

				isExit = true;
				System.out.println("THANK YOU!!");
				break;


			default:
			}

		//} while (!isExit);

		
		
	}
	
	
	public static boolean Login(){
		
		System.out.println("Please Enter the Email");
		String email = cin.next();
		System.out.println("Please Enter the Password");
		String password = cin.next();
		
		for(int i = 0 ; i<teacher.size(); i++) {
			
			if(teacher.get(i).getEmail().equals(email) && teacher.get(i).getPassword().equals(password)) {
				
				return true;
				
			}
			
		}
		
		return false;
	}
	
	
	public static void Signup(){
		
		System.out.println("Enter your FullName");
		String name = cin.next();
		cin.nextLine();
		System.out.println("Enter your phone Number");
		String pNumber = cin.next();
		cin.nextLine();
		System.out.println("Enter your Age ");
		int age = cin.nextInt();
		
		if(age > 60 || age < 30) {
			
			System.out.println("You Entered Invalid Age");
			return;
		} 
		
		System.out.println("Please Enter the Email");
		String email = cin.next();
		cin.nextLine();
		System.out.println("Please Enter the Password");
		String password = cin.next();		
		cin.nextLine();
		
		teacher.add(new Teacher(name, pNumber, age,email, password));
		System.out.println("Registered Successfully");
		//Menu();
				
	}
	
	public static void MainMenu() {
		
		while(true) {
		System.out.println("**********************************************************************************");
		System.out.println("\t\t\tSTUDENT INFORMATION SYSTEM");
		System.out.println("**********************************************************************************");
		System.out.println("Press 1 : To Login as a Staff ");
		System.out.println("Press 2 : To Signup as a Staff ");
		System.out.println("Press 0 : To Exit the System");
		int choice = cin.nextInt();
		if(choice == 1) {
			
			if(Login()){
				System.out.println("Logged In Successfully");
				break;
				//Menu();				
			}else {
				
				System.out.println("OOPS ! Your Credentials are not Correct");
				break;
			}
			
		}
		else if(choice == 2) {
			
			Signup();
			break;
		}else if(choice == 0) {
			
			System.out.println("Thank You");
			System.exit(0);
			
		}
		else {
			
			System.out.println("OOPS you Entered an Invalid Choice ! \nTry Again ");
			
		}
	}
		
  }
	
	public static void DB() {
		
		teacher.add(new Teacher("Ahmed", "03078421",51, "ahmed0@gmail.com", "ah0213"));
		teacher.add(new Teacher("Ehsan", "03278429",34 , "ehsan1@gmail.com", "eh312"));
		teacher.add(new Teacher("Ali", "03478425",55,"ali2@gmail.com", "aliham2"));
		teacher.add(new Teacher("Hamza", "03319423",52 ,"hamza3@gmail.com", "hali313"));
		teacher.add(new Teacher("Nabeel", "03219594",56 ,"nabeel4@gmail.com", "nabj213"));

	}	
	
	
	public static void feePayment(StudentInfo stud) {
		
		
		if(!stud.getFeeStatus()) {
		
		System.out.println("\n**********************************************************************************");
		System.out.println("\t\t\tFEES PROCESS");
		System.out.println("**********************************************************************************\n");
		System.out.println("Your Total Fee is Rs: " + StudentOperation.STUDENT_FEE);
		System.out.println("Enter your payemnt Rs:");
		int payment = cin.nextInt();
		boolean isPaid = false;
		//int remainingBalance = 0;
		if (payment == StudentOperation.STUDENT_FEE) {
			System.out.println("\nThank you for your payemnt!!");
			isPaid = true;
		} else if (payment < StudentOperation.STUDENT_FEE) {
			System.out.println("\nYour Balance Amount is Not Enough to Pay the Fee");
		}else {
			
			while(true) {
			System.out.println("Invalid Number\nSubmit your fees again. ");
			payment = cin.nextInt();
			if (payment == StudentOperation.STUDENT_FEE) {
				System.out.println("\nThank you for your payemnt!!");
				isPaid = true;
				break;
			} else if (payment < StudentOperation.STUDENT_FEE) {
				System.out.println("\nYour Balance Amount is Not Enough to Pay the Fee");			}

		 }
		}

		System.out.println("\n**********************************************************************************");
		System.out.println("\t\t\tFEE STATUS");
		System.out.println("**********************************************************************************\n");
		if (isPaid == true) {
			System.out.println("\tFee paid!!\nFee Submitted.\nTHANK YOU!!");
		} else {
			System.out.println("\tFee unpaid!!\nPlease submit your Fees.\nTHANK YOU!!");
		}
		
		operation.setFeeStatus(stud.getRollNumber());
		
	}
	else {
	
		System.out.println("Fee Already Submitted");
		
	}
		
	}	
}