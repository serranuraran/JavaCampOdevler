
public class Main {

	public static void main(String[] args) {
		 
StudentManager studentManager = new StudentManager();
		
		Student student = new Student(2021, "Serranur", "Aran");
		student.setId(1);
		student.setEmail("serranuraran12@gmail.com");
		student.setPassword("12345");
		
		studentManager.add(student);
		studentManager.delete(student);
		
		InstructorManager instructorManager = new InstructorManager();
		
		Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
		instructor.setId(2);
		instructor.setEmail("engindemirog@mail.com");
		instructor.setPassword("67890");
		
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		
		UserManager userManager1 = new InstructorManager();
		userManager1.userDetail(instructor);
		
		UserManager userManager2 = new StudentManager();
		userManager2.userDetail(student);

	}

}