public class Video extends Mediafile {
    private String duration;


    public Video(int id, String filename, String title, String description, float size, String filetype, boolean availability, String duration) {
        super(id, filename, title, description, size, filetype, availability);
        this.duration= duration;
    }



    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Video{" +
                "duration='" + duration + '\'' +
                '}';
    }


}
