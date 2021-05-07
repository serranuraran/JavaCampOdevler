
public class StudentManager extends UserManager{
	

	public void add(Student student) {
		
		System.out.println("Öğrenci eklendi : " + student.getFirstName());
		
	}
	
	public void delete(Student student) {
		
		System.out.println("Öğrenci silindi : " + student.getFirstName());
		
	}

}