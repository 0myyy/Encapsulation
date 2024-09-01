package Arrayprog;



public class Classes {

    public static class Course {
        // Private fields to encapsulate the data
        private String courseName;
        private int courseId;

        // Constructor to initialize the course
        public Course(String courseName, int courseId) {
            this.courseName = courseName;
            this.courseId = courseId;
        }

        // Public getter for courseName
        public String getCourseName() {
            return courseName;
        }

        // Public getter for courseId
        public int getCourseId() {
            return courseId;
        }

        // Method to display course info
        public void displayCourseInfo() {
            System.out.println("Course Name: " + courseName);
            System.out.println("Course ID: " + courseId);
        }
    }

    public static class Batch {
        // Private fields to encapsulate the data
        private String batchName;
        private int batchId;

        // Constructor to initialize the batch
        public Batch(String batchName, int batchId) {
            this.batchName = batchName;
            this.batchId = batchId;
        }

        // Public getter for batchName
        public String getBatchName() {
            return batchName;
        }

        // Public getter for batchId
        public int getBatchId() {
            return batchId;
        }

        // Method to display batch info
        public void displayBatchInfo() {
            System.out.println("Batch Name: " + batchName);
            System.out.println("Batch ID: " + batchId);
        }
    }

    public static class Faculty {
        // Private fields to encapsulate the data
        private String facultyName;
        private int facultyId;

        // Constructor to initialize the faculty
        public Faculty(String facultyName, int facultyId) {
            this.facultyName = facultyName;
            this.facultyId = facultyId;
        }

        // Public getter for facultyName
        public String getFacultyName() {
            return facultyName;
        }

        // Public getter for facultyId
        public int getFacultyId() {
            return facultyId;
        }

        // Method to display faculty info
        public void displayFacultyInfo() {
            System.out.println("Faculty Name: " + facultyName);
            System.out.println("Faculty ID: " + facultyId);
        }
    }

    public static class Student {
        // Private fields to encapsulate the data
        private String studentName;
        private int studentId;
        private Batch batch;
        private Faculty faculty;
        private Course course;

        // Constructor to initialize the student
        public Student(String studentName, int studentId, Batch batch, Faculty faculty, Course course) {
            this.studentName = studentName;
            this.studentId = studentId;
            this.batch = batch;
            this.faculty = faculty;
            this.course = course;
        }

        // Public getter for studentName
        public String getStudentName() {
            return studentName;
        }

        // Public getter for studentId
        public int getStudentId() {
            return studentId;
        }

        // Method to display student info
        public void displayStudentInfo() {
            System.out.println("Student Name: " + studentName);
            System.out.println("Student ID: " + studentId);
            if (batch != null) {
                System.out.println("Batch Name: " + batch.getBatchName());
                System.out.println("Batch ID: " + batch.getBatchId());
            }
            if (faculty != null) {
                System.out.println("Faculty Name: " + faculty.getFacultyName());
                System.out.println("Faculty ID: " + faculty.getFacultyId());
            }
            if (course != null) {
                System.out.println("Course Name: " + course.getCourseName());
                System.out.println("Course ID: " + course.getCourseId());
            }
        }
    }

        public static void main(String[] args) {
            // Create instances of each class
            Course course = new Course("Mathematics", 101);
            Batch batch = new Batch("Batch A", 202);
            Faculty faculty = new Faculty("Krishna", 303);
            Student student = new Student("Om", 404, batch, faculty, course);

            // Display student and related information
            student.displayStudentInfo();
        }
    }

