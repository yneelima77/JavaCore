package com.perscholas.GLAB303_13_1_Reading_aDelimitedFile;

public class Course {
    //model or POJO class
    private String CourseCode, CourseName, InstructorName;

    public Course(String courseCode, String courseName, String instructorName) {
        this.CourseCode = courseCode;
        this.CourseName = courseName;
        this.InstructorName = instructorName;
    }

    public Course(){

    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String courseCode) {
        CourseCode = courseCode;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getInstructorName() {
        return InstructorName;
    }

    public void setInstructorName(String instructorName) {
        InstructorName = instructorName;
    }
}
