public class RegistrationSystemTest {
    public static void main(String[] args) {
        Student student1 = new Student("Husky1", 1);
        Student student2 = new Student("Husky2", 2);
        Student student3 = new Student("Husky3", 3);
        Student student4 = new Student("Husky4", 4);
        Student student5 = new Student("Husky5", 5);
        Student student6 = new Student("Husky6", 6);
        Student student7 = new Student("Husky7", 7);
        Student student8 = new Student("Husky8", 8);
        Student student9 = new Student("Husky9", 9);
        Student student10 = new Student("Husky10", 10);
        Student student11 = new Student("Husky11", 10);

        Course course = new Course("INFO 5100");
        course.registerStudent(student1);
        course.registerStudent(student2);
        course.registerStudent(student3);
        course.registerStudent(student4);
        course.registerStudent(student5);
        course.registerStudent(student6);
        course.registerStudent(student7);
        course.registerStudent(student8);
        course.registerStudent(student9);
        course.registerStudent(student10);

//        course.registerStudent(student11);

        if (course.isFull() == true) {
            System.out.println("This course is full.");
        } else {
            System.out.println("This course still have seats.");
        }

    }
}
