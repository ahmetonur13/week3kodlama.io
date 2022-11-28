package entities;

public class Product {
    private String courseName;
    private String teacherName;
    private int courseUnitPrice;
    private String courseDetails;
    private int percentOfComplate;

    public Product(String courseName,String teacherName,int courseUnitPrice,String courseDetails,int percentOfComplate) {
        this.courseDetails=courseDetails;
        this.percentOfComplate=percentOfComplate;
        this.teacherName=teacherName;
        this.courseUnitPrice=courseUnitPrice;
        this.courseName=courseName;

    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getCourseUnitPrice() {
        return courseUnitPrice;
    }

    public void setCourseUnitPrice(int courseUnitPrice) {
        this.courseUnitPrice = courseUnitPrice;
    }

    public String getCourseDetails() {
        return courseDetails;
    }

    public void setCourseDetails(String courseDetails) {
        this.courseDetails = courseDetails;
    }

    public int getPercentOfComplate() {
        return percentOfComplate;
    }

    public void setPercentOfComplate(int percentOfComplate) {
        this.percentOfComplate = percentOfComplate;
    }
}
