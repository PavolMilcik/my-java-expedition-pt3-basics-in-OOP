package CoursePackages;


// Using this class, we will create a new 'Video' object,
// that contains a String 'videoLink'.

public class Video {
    private String videoLink;

    public Video(String videoLink) {
        this.videoLink = videoLink;
    }

    public String getVideoLink() {
        return this.videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }
}
