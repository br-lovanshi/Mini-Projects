package student.model;

public class Students {

	private int rollNum;
	private String studentName;
	private int studentMarks;
	
	public Students() {
		// TODO Auto-generated constructor stub
	}

	public Students(int rollNum, String studentName, int studentMarks) {
		super();
		this.rollNum = rollNum;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}

	@Override
	public String toString() {
		return "Students [rollNum=" + rollNum + ", studentName=" + studentName + ", studentMarks=" + studentMarks + "]";
	}
	
	
	
	
}
