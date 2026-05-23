public class Lecturer {

    private String lectureName;
    private String courseTeaching;

    public Lecturer(){
        this.lectureName="Unknown";
        this.courseTeaching="Unknown";
    }

    public Lecturer( String lecturname,String Course){
        this.lectureName=lecturname;
        this.courseTeaching=Course;
    }

    public String getLectureName(){
        return this.lectureName;
    }
    public String getCourseTeaching(){
        return this.courseTeaching;
    }

    public void setLectureName(String lectureName){
        this.lectureName=lectureName;
    }

    public void setCourseTeaching(String couseTeaching){
        this.courseTeaching=couseTeaching;

    }

}
