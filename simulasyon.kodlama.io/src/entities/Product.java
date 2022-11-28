package entities;

public class Product {
    private String courseName;
    private Instructor teacherName;
    private int courseUnitPrice;
    private String courseDetails;
    private int percentOfComplate;


    private Category categoryName;

    public Product(String courseName, Instructor teacherName, int courseUnitPrice, String courseDetails, int percentOfComplate, Category categoryName) {
        this.courseDetails = courseDetails;
        this.percentOfComplate = percentOfComplate;
        this.teacherName = teacherName;
        this.courseUnitPrice = courseUnitPrice;
        this.courseName = courseName;
        this.categoryName=categoryName;
    }
    public Category getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(Category categoryName) {
        this.categoryName = categoryName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Instructor getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(Instructor teacherName) {
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