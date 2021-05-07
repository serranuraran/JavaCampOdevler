
public class Instructor extends User {

	private int instructorNumber;
	private String firstName;
	private String lastName;

	public Instructor() {

	}

	public Instructor(int instructorNumber, String firstName, String lastName) {
		this.instructorNumber = instructorNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(int instructorNumber) {
		this.instructorNumber = instructorNumber;
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

}