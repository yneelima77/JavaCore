package com.perscholas.GLAB303_13_1_Reading_aDelimitedFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyRunner {
    public static void main(String[] args) {
        try {
            String path = "C:\\Users\\yneel\\IdeaProjects\\HelloWorld\\src\\com\\perscholas\\CourseData.csv";
            File file = new File(path);
            Scanner sc = new Scanner(file);
            ArrayList<Course> courseList = new ArrayList<Course>();
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                String[] courseData = data.split(",");
                Course cObj = new Course();

                cObj.setCourseCode(courseData[0]);
                cObj.setCourseName(courseData[1]);
                cObj.setInstructorName(courseData[2]);

                courseList.add(cObj);
               }
            for (Course course : courseList) {
                System.out.println(course.getCourseCode() + " | " + course.getCourseName() + " | " + course.getInstructorName());
                System.out.println("===============================");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found! ");
            e.printStackTrace();
        }

    }
}
