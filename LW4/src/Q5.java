public class Q5 {
    public static void main(String[] args) {

        Student student = new Student();
        student.setStudentName("Sashan");
        student.setDegreeName("BICT");
        student.setCourseFollowing("OOP");

        Course course = new Course();
        course.setCourseCode("CTEC22043");
        course.setCourseName("Object Oriented Programming");

        Lecturer lecturer = new Lecturer();
        lecturer.setLectureName("Dr.Lalitha");
        lecturer.setCourseTeaching("OOP");


        System.out.println("Summery of the student Registration  Systrem\n\n\n");
        System.out.println("\nName: " + student.getStudentName());
        System.out.println("\nDegree Name: " + student.getDegreeName());
        System.out.println("\nCourse Name: " + student.getCourseFollowing());
        System.out.println("\nCourseCode " + course.getCourseCode());
        System.out.println("\nCourseName " + course.getCourseName());
        System.out.println("\nLecturer Name " + lecturer.getLectureName());
        System.out.println("\nCourse Teaching " + lecturer.getCourseTeaching());





    }

}
