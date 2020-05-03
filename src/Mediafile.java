public abstract class Mediafile {
    private int id;
    private String filename;
    private String title;
    private String description;
    private float size;
    private String filetype;
    private boolean availability;


    public Mediafile(int id, String filename, String title, String description, float size, String filetype, boolean availability) {
        this.id = id;
        this.filename = filename;
        this.title = title;
        this.description = description;
        this.size = size;
        this.filetype = filetype;
        this.availability = availability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Mediafile{" +
                "id=" + id +
                ", filename='" + filename + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", size=" + size +
                ", filetype='" + filetype + '\'' +
                ", availability=" + availability +
                '}';


    }





    }

