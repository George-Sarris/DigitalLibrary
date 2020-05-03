public class Audio extends Mediafile {
        private String Singer_Band;



    public Audio(int id, String filename, String title, String description, float size, String filetype, boolean availability, String band) {
        super(id, filename, title, description, size, filetype, availability);
        Singer_Band=band;
    }


    public String getSinger_Band() {
        return Singer_Band;
    }


    public void setSinger_Band(String band) {
        Singer_Band = band;
    }


    @Override
    public String toString() {
        return "Audio{" +
                "Artist='" + Singer_Band + '\'' +
                '}';
    }


}
