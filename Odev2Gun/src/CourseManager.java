public class CourseManager {

    public void addToCart(Course course) {
        System.out.println(course.name + " Kursunuz ba�ar�yla sepete eklendi!");
    }

    public void delete(Course course) {
        System.out.println(course.name + " isimli Kurs silindi!");
    }
}