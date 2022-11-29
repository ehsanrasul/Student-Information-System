package SMS;

import java.io.Serializable;

public class CourseInfo implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String courseName1;
	private String courseName2;
	private String courseName3;
	private String courseName4;
	private String courseName5;

	public CourseInfo() {
		// TODO Auto-generated constructor stub
	}

	public CourseInfo(String course1, String course2, String course3, String course4, String course5) {

		courseName1 = course1;
		courseName2 = course2;
		courseName3 = course3;
		courseName4 = course4;
		courseName5 = course5;

	}

	public String getCourseName1() {
		return courseName1;
	}

	public void setCourseName1(String courseName1) {
		this.courseName1 = courseName1;
	}

	public String getCourseName2() {
		return courseName2;
	}

	public void setCourseName2(String courseName2) {
		this.courseName2 = courseName2;
	}

	public String getCourseName3() {
		return courseName3;
	}

	public void setCourseName3(String courseName3) {
		this.courseName3 = courseName3;
	}

	public String getCourseName4() {
		return courseName4;
	}

	public void setCourseName4(String courseName4) {
		this.courseName4 = courseName4;
	}

	public String getCourseName5() {
		return courseName5;
	}

	public void setCourseName5(String courseName5) {
		this.courseName5 = courseName5;
	}

}