package AllFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws IOException {

        String path =  "C:\\Users\\srini\\OneDrive\\Desktop\\TEXT FILES\\book.txt";

        FileReader fr = new FileReader(path);

        BufferedReader br = new BufferedReader(fr);

        String str;

        while ( (str = br.readLine()) != null){

            System.out.println(str);
        }

        br.close();

    }
}
