public class CourseManager {

    public void addToCart(Course course) {
        System.out.println(course.name + " Kursunuz başarıyla sepete eklendi!");
    }

    public void delete(Course course) {
        System.out.println(course.name + " isimli Kurs silindi!");
    }
}