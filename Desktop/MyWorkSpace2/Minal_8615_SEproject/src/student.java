
public class student {
	int studentID;
	String studentName;
	String programEnrolled;
	String emailAddress;
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getProgramEnrolled() {
		return programEnrolled;
	}
	public void setProgramEnrolled(String programEnrolled) {
		this.programEnrolled = programEnrolled;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public void viewSchedule() {
		
	}
	public student(int studentID, String studentName, String programEnrolled, String emailAddress) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.programEnrolled = programEnrolled;
		this.emailAddress = emailAddress;
	}
	public void bookAppointment() {
			
		}
	public void viewAppointments() {
		
	}
}
