package SMS;

public class Teacher {
	
	private String name ;
	private String phoneNumber ;
	private int age;
	private String email;
	private String password ;
	
	public Teacher(){}
	
	
	
	
	public Teacher(String name, String phoneNumber, int age, String email, String password) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.email = email;
		this.password = password;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + ", password=" + password
				+ "]";
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
}
