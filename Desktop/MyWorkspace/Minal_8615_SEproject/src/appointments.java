
public class appointments {
	int appointmentNo;
	String time;
	int studentID;
	String instructorName;
	String date;
	String status;
	public int getAppointmentNo() {
		return appointmentNo;
	}
	public void setAppointmentNo(int appointmentNo) {
		this.appointmentNo = appointmentNo;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public appointments(int appointmentNo, String time, int studentID, String instructorName, String date,
			String status) {
		super();
		this.appointmentNo = appointmentNo;
		this.time = time;
		this.studentID = studentID;
		this.instructorName = instructorName;
		this.date = date;
		this.status = status;
	}
	
	
}
