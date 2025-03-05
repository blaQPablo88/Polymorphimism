
package FileHandling;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        if (creatFile()) {
            try {
                FileWriter myWriter = new FileWriter("filename.txt");
                myWriter.write("I don't know Java, I barely talk proper.");
                myWriter.close();
                System.out.println("Was a success");
            }
            catch (IOException e) {
                System.out.println("something went wrong");
                e.printStackTrace();
            }
        }

    }

    public static boolean creatFile() {

        File file = new File("filename.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("created " + file.getName());
            } else {
                System.out.println("file " + file.getName() + " alreadt exists.");
            }
            return true;
        } catch (IOException e) {
            System.out.println("an error occured.");
            e.printStackTrace();
            return false;
        }


    }
}