
public class InstructorManager extends UserManager{

public void add(Instructor instructor) {
		
		System.out.println("Eðitmen eklendi : " + instructor.getFirstName() + " " + instructor.getLastName());
		
	}
	
	public void delete(Instructor instructor) {
		
		System.out.println("Eðitmen silindi : " + instructor.getFirstName() + " " + instructor.getLastName());
		
	}

}