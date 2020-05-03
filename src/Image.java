public class Image extends Mediafile {
    private String model_camera;

    public Image(int id, String filename, String title, String description, float size, String filetype, boolean availability, String camera) {
        super(id, filename, title, description, size, filetype, availability);
        model_camera = camera;
    }


    public String getModel_camera() {
        return model_camera;
    }

    public void setModel_camera(String model_camera) {
        this.model_camera = model_camera;
    }

    @Override
    public String toString() {
        return "Image{" +
                "model_camera='" + model_camera + '\'' +
                '}';
    }


}
