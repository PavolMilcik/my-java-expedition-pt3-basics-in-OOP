package CoursePackages;

import java.util.ArrayList;


// Using this class, we will create a new 'Course' object,
// which contains objects created from the 'Chapter' class.

public class Course {
    private String courseName;
    private ArrayList<Chapter> chapters;

    public Course(String courseName, ArrayList<Chapter> chapters) {
        this.courseName = courseName;
        this.chapters = chapters;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public ArrayList<Chapter> getChapters() {
        return this.chapters;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
