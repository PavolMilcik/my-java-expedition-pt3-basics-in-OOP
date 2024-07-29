package CoursePackages;

import java.util.ArrayList;


// Using this class, we will create a new 'Chapter' object,
// which contains objects created from the 'Video' class.

public class Chapter {
    private ArrayList<Video> videos;

    public Chapter(ArrayList<Video> videos) {
        this.videos = videos;
    }

    public ArrayList<Video> getVideos() {
        return this.videos;
    }
}
