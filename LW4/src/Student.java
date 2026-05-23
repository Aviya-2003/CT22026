public class Student {
    private String studentName;
    private String degreeName;
    private String courseFollowing;


    public Student(String studentName, String degreeName, String courseFollowing) {
        this.studentName = studentName;
        this.degreeName = degreeName;
        this.courseFollowing = courseFollowing;
    }

    public Student(){
        this.studentName = "Unknown";
        this.degreeName = "Unknown";
        this.courseFollowing = "Unknown";
    }

    public String getStudentName(){
        return studentName ;
    }
    public String getDegreeName(){
        return degreeName;
    }
    public String getCourseFollowing(){
        return courseFollowing;
    }

    public void setStudentName(String studentName){
        this.studentName=studentName;
    }

    public void setDegreeName(String degreeName){
            this.degreeName=degreeName;
    }
    public void setCourseFollowing(String courseFollowing){
        this.courseFollowing=courseFollowing;
    }


}
