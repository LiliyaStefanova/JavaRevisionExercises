package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;

public class Cat {

    public void showFiles() {

        System.out.print("Enter file name: ");
        Scanner sc = new Scanner(System.in);
        String inputFile = sc.next();

        BufferedReader in = null;
        try {
            File file = new File(inputFile);
            in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            closeReader(in);
        }

    }

    private void closeReader(Reader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.showFiles();
    }
}

