public class Main {

    public static void main(String[] args) {

        Course course1 = new Course(1, "Programlamaya Giriş", "Engin Demirog");
        Course course2 = new Course(2, "C# + Angular", "Engin Demirog");
        Course course3 = new Course(3, "Java + React", "Engin Demirog");

        Course[] courses = { course1, course2, course3 };

        for (Course course : courses) {
            System.out.println("Kurs adı: " + course.name + " Eğitmen adı: " + course.instructorName);
        }

        CourseManager courseManager = new CourseManager();
        courseManager.addToCart(course3);
        courseManager.delete(course3);
    }

    }