package GameType;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    public static void main(String[] args) {
//        String file = "SOCCER.txt";
//        String file1 = "RUGBY.txt";
//        String file3 = "HOCKEY.txt";
//        FileManager fileManager = new FileManager();
//        fileManager.createFile(file);
//        fileManager.createFile(file1);
//        fileManager.createFile(file3);
//        fileManager.writeToFile(file, "   11");
//        fileManager.writeToFile(file1, "  15");
//        fileManager.writeToFile(file3, "   6");
    }

    public void createFile(String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void writeToFile(Game.GameType fileName, String text) {
        try {
            System.out.println("The result for  " + fileName + " is:  " + text);
            FileWriter fileWriter = new FileWriter(fileName.toString() + ".txt");
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error ....");
            throw new RuntimeException(e);
        }
    }
}

