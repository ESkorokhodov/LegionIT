package GameType;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        String file = "SOCCER.txt";
//        String file1 = "RUGBY.txt";
//        String file3 = "HOCKEY.txt";
        FileManager fileManager = new FileManager();
//        fileManager.createFile(file);
//        fileManager.createFile(file1);
//        fileManager.createFile(file3);
        fileManager.writeToFile(Game.GameType.SOCCER, "   11");
        fileManager.writeToFile(Game.GameType.HOCKEY, "   6");
        fileManager.writeToFile(Game.GameType.RUGBY, "   15");
//        fileManager.writeToFile(file1, "  15");
//        fileManager.writeToFile(file3, "   6");

    }


}

