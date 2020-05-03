import java.util.Scanner;

public class UI {


    public Choice menu(){
        Choice returnChoice;
        System.out.println("1. Add MediaFile   2. Remove MediaFile" +
                "    3. Display Mediafile     4.  Clear Mediafiles " + ',' + " 5.Save file 6. Load File 0. Exit" );

        int choice;
        Scanner scanner = new Scanner(System.in);
        try {
            choice = scanner.nextInt();
            switch(choice){
                case 1: return Choice.ADD;
                case 2: return Choice.REMOVE;
                case 3: return Choice.DISPLAY;
                case 4: return Choice.CLEAR;
                case 5: return Choice.SAVE;
                case 6: return Choice.LOAD;
                case 0: return Choice.EXIT;
                default:return Choice.ERROR;
            }
        }
        catch(Exception e){
            return Choice.ERROR;
        }

    }


    //factory method design pattern
    public Mediafile createMediaFile() {
        int code;
        String filename;
        String title;
        String description;
        String filetype;
        String singer_band, duration, model_camera;
        boolean availability;
        float size;
        int MediaType;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Create Audio 2. Create Video 3. Create Image");
        MediaType = scanner.nextInt();


        System.out.println("Give the mediafile code in Integer");
        code = scanner.nextInt();

        System.out.println("Give the mediafile name");
        filename = scanner.next();

        System.out.println("Give the mediafile title ");
        title = scanner.next();

        System.out.println("Give the mediafile description ");
        description = scanner.next();

        System.out.println("Give the mediafile size ");
        size = scanner.nextFloat();

        System.out.println("Give the mediafile filetype ");
        filetype = scanner.next();

        System.out.println("Give the mediafile availability with ''true'' or ''false ");
        availability = scanner.nextBoolean();


        Mediafile mediafile;
        switch (MediaType) {
            case 1:
                System.out.println("Give Singer or Band Name ");
                singer_band = scanner.next();
                mediafile = new Audio(code, filename, title, description, size, filetype, availability, singer_band);
                return mediafile;
            case 2:
                System.out.println("Give duration ");
                duration = scanner.next();
                mediafile = new Video(code, filename, title, description, size, filetype, availability, duration);
                return mediafile;
            case 3:
                System.out.println("Give model of camera ");
                model_camera = scanner.next();
                mediafile = new Image(code, filename, title, description, size, filetype, availability, model_camera);
                return mediafile;
            default:
                return null;
        }

    }

        public void manageFiles (File_Manager manage){
            Choice choice;
            do {
                choice = menu();

                switch (choice) {
                    case ADD:
                        Mediafile media_file = createMediaFile();
                        manage.addmediafile(media_file);
                        break;
                    case REMOVE:
                        System.out.println("Give an index to remove");
                        Scanner scanner = new Scanner(System.in);
                        int index = scanner.nextInt();
                        manage.removeMediafile(index);
                        break;
                    case DISPLAY:
                        manage.displayMediaFiles();
                        break;
                    case CLEAR:
                        manage.clearMediaProducts();
                        break;
                    case EXIT:
                        break;
                    case SAVE:
                        manage.saveMediaFile("mediafile.txt");
                        break;
                    case LOAD:
                        manage.loadBasket("mediafile.txt");
                        break;
                    case ERROR:
                        System.out.println("You gave erroneous input");
                        break;

                }
            } while (choice != Choice.EXIT);


        }




}
