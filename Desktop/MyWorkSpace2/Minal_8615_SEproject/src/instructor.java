
public class instructor {
	int instructorID;
	String instructorName;
	String email;
	String department;
	String room;
	public int getInstructorID() {
		return instructorID;
	}
	public void setInstructorID(int instructorID) {
		this.instructorID = instructorID;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public void viewSchedule() {
		
	}
	public void respondRequest() {
			
		}
	public instructor(int instructorID, String instructorName, String email, String department, String room) {
		super();
		this.instructorID = instructorID;
		this.instructorName = instructorName;
		this.email = email;
		this.department = department;
		this.room = room;
	}
	public void viewAppointments() {
		
	}
	
}
