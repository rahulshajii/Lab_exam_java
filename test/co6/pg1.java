//Write a program to write to a file, then read from the file and display the contents on the console.
import java.io.*;
public class pg1 {
    public static void main(String[] args) {

        String filename = "sample.txt";

        try {
            // 1. Writing to file
            FileWriter fw = new FileWriter(filename);
            fw.write("Hello, this is a file handling example.\n");
            fw.write("Java makes file operations easy!");
            fw.close();

            System.out.println("Data written to file successfully.\n");

            // 2. Reading from file
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("Reading from file:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}