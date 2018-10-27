public class Course {
    // variables
    private String title;
    private int numberOfStudent;

    // constructor
    Course(String title) {
        this.title = title;
    }

    // store the registered students in an array
    int maxCapacity = 10;
    Student[] studentsRegistered = new Student[maxCapacity];

    // accessor methods
    public String getTitle() {
        return title;
    }
    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    // methods
    public Student[] getStudent() {
        return studentsRegistered;
    }
    public boolean isFull() {
        if (numberOfStudent == maxCapacity) {
            return true;
        }
        return false;
    }
    public void registerStudent(Student student) {
        if (numberOfStudent < maxCapacity) {
            studentsRegistered[numberOfStudent] = student;
            numberOfStudent++;
        } else if (numberOfStudent == maxCapacity) {
            throw new RuntimeException("You can't register this course because it is full.");
        }
    }
}
