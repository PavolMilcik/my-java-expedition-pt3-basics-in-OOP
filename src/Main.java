import CoursePackages.Chapter;
import CoursePackages.Course;
import CoursePackages.Video;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //
        // --------------- part 1. Video
        //
        // Create a new object using the 'Video' class,
        // which contains a 'String' parameter named videoLink'.
        Video video1 = new Video("videoLink1");
        Video video2 = new Video("videoLink2");
        Video video3 = new Video("videoLink3");
        Video video4 = new Video("videoLink4");


        //
        // --------------- part 2. Chapter
        //
        // Create an 'ArrayList<Video>' object, which contains objects created from the 'Video' class.
        ArrayList<Video> videosForChapter1 = new ArrayList<>(List.of(video1, video2));
        ArrayList<Video> videosForChapter2 = new ArrayList<>();
        videosForChapter2.add(video3);
        videosForChapter2.add(video4);

        // Create a new object using the 'Chapter' class,
        // which takes an 'ArrayList<Video>' object as a parameter.
        // The 'ArrayList<Video>' contains objects created from the 'Video' class.
        Chapter chapter1 = new Chapter(videosForChapter1);
        Chapter chapter2 = new Chapter(videosForChapter2);


        //
        // --------------- part 3. Course
        //
        String myCourseName = "OOP Basic Course";
        // Create an 'ArrayList<Chapter>' object, which contains objects created from the 'Chapter' class.
        ArrayList<Chapter> allChapters = new ArrayList<>();
        allChapters.add(chapter1);
        allChapters.add(chapter2);

        // Create a new object using the 'Course' class,
        // which takes an 'ArrayList<Chapter>' object as a parameter.
        // The 'ArrayList<Chapter>' contains objects created from the 'Chapter' class.
        Course myCourse = new Course(myCourseName, allChapters);


        // --------------- part 4. 'print'
        //
        // Print all videos.
        //
        System.out.println("\n\n" +
                "--- My '" + myCourse.getCourseName() + "' contains:");
        int i = 1;
        for (Chapter chapter : myCourse.getChapters()) {
            System.out.println("-- 'Chapter " + i + "', which contains:");
            i++;
            for (Video video : chapter.getVideos()) {
                System.out.println("- " + video.getVideoLink());
            }
        }


        // --------------- part 5. 'print'
        //
        // Print specific videos.
        //
        System.out.println("\n");
        // Print 'videoLink1' --->
        System.out.println(myCourse.getChapters().get(0).getVideos().get(0).getVideoLink());
        // Print 'videoLink3' --->
        System.out.println(myCourse.getChapters().get(1).getVideos().get(0).getVideoLink());
    }
}