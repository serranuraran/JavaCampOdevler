
public class StudentManager extends UserManager{
	

	public void add(Student student) {
		
		System.out.println("��renci eklendi : " + student.getFirstName());
		
	}
	
	public void delete(Student student) {
		
		System.out.println("��renci silindi : " + student.getFirstName());
		
	}

}