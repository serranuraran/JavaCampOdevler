
public class InstructorManager extends UserManager{

public void add(Instructor instructor) {
		
		System.out.println("E�itmen eklendi : " + instructor.getFirstName() + " " + instructor.getLastName());
		
	}
	
	public void delete(Instructor instructor) {
		
		System.out.println("E�itmen silindi : " + instructor.getFirstName() + " " + instructor.getLastName());
		
	}

}