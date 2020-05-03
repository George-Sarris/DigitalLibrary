import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class File_Manager {


        private ArrayList<Mediafile> media_files = new ArrayList<>();


        public void addmediafile(Mediafile mediafiles){
            media_files.add(mediafiles);
        }

        public void  displayMediaFiles (){

        media_files.forEach(System.out::println);
    }

        public void removeMediafile(int index){
        if (index>=0 && index < media_files.size()){
            media_files.remove(index);
        }
    }

         public void clearMediaProducts () {
        media_files.clear();
    }




    public void saveMediaFile(String filename)   {

        try {
            PrintWriter printWriter = new PrintWriter(new File(filename));
            for (Mediafile m: media_files) {
                printWriter.println( m.getId() + "," + m.getFilename() + "," + m.getTitle() + ',' + m.getDescription() + "," + m.getSize() + ","+
                        m.getFiletype() + ',' + m.getAvailability()   );
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file cannot be saved");
        }

    }


    public void loadBasket(String filename){
        clearMediaProducts();
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] words = line.split(",");
                Mediafile mediafile = new Audio(
                        Integer.parseInt(words[0]),
                        words[1], words[2],words[3],
                        Float.parseFloat(words[4]),
                        words[5],true,words[7]);
                media_files.add(mediafile);
            }
        } catch (Exception e) {
        }
    }






    }

