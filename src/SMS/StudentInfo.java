package SMS;

public class StudentInfo extends CourseInfo {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	public String firstName;
	private String lastName;
	private int age;
	private String rollNumber;
	private String department;
	private String address;
	private int EnrollmentYear;
	private String phoneNumber;
	private String emailAdress;
	int courseMarks = 100;
	private int remainingFees;
	private boolean feeStatus = false;

	public StudentInfo(String fname, String lname, int Age, String rollno, String dept, String Address, int enrollYear,
			String number, String email, String course1, String course2, String course3, String course4, String course5
			) {

		firstName = fname;
		lastName = lname;
		age = Age;
		rollNumber = rollno;
		department = dept;
		address = Address;
		EnrollmentYear = enrollYear;
		phoneNumber = number;
		emailAdress = email;
		this.remainingFees = remainingFees;

		setCourseName1(course1);
		setCourseName2(course2);
		setCourseName3(course3);
		setCourseName4(course4);
		setCourseName5(course5);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getEnrollmentYear() {
		return EnrollmentYear;
	}

	public void setEnrollmentYear(int enrollmentYear) {
		EnrollmentYear = enrollmentYear;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public void getStudentInfo() {
		System.out.println("\n");
		System.out.println("Name: " + firstName + " " + lastName + "\nRollNumber: " + rollNumber + "\nDepartment: "
				+ department + "\nEnrollment Year: " + EnrollmentYear + "\nAge: " + age + "\nAddress: " + address
				+ "\nPhone Number: " + phoneNumber + "\nEmail Address: " + emailAdress
				+ "\n\n**************************************************"
				+ "********************************\n\t\t\tSELECTED COURSES\n****************************************"
				+ "******************************************\n" + getCourseName1() + "\n" + getCourseName2() + "\n"
				+ getCourseName3() + "\n" + getCourseName4() + "\n" + getCourseName5() + "\n\nTotal marks per course: "
				+ courseMarks * 5);
		System.out.println("\n**********************************************************************************");
		System.out.println("\t\t\tFEES STATUS");
		System.out.println("**********************************************************************************\n");
		if (getRemainingFees() == 0) {
			System.out.println("\tFees paid!!\nFees Submitted.\nTHANK YOU!!");
		} else {
			System.out.println(
					"\tFees unpaid!!\nPlease submit your remaining Fees: " + getRemainingFees() + "\nTHANK YOU!!");
		}
	}

	public int getRemainingFees() {
		return remainingFees;
	}

	public void setRemainingFees(int remainingFees) {
		this.remainingFees = remainingFees;
	}

	public String getFeesInfo() {
		return "Default Implemetnation";
	}

	public boolean getFeeStatus() {
		return feeStatus;
	}

	public void setFeeStatus(boolean feeStatus) {
		this.feeStatus = feeStatus;
	}
	
	
	

}
