package AllFiles;

import java.io.File;
import java.io.IOException;

public class AllFiles {

    public static void main(String[] args) throws IOException {

       String path = "C:\\Users\\srini\\OneDrive\\Desktop\\TEXT FILES\\book.txt";

       File f = new File(path);

       try {
           f.createNewFile();
       }
       catch (IOException e){
           e.printStackTrace();
       }

    }
}
