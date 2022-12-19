package GameType;

import java.io.File;
import java.io.IOException;

public class Game {
    public enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static int writeNumOfPlayersPerTeam(GameType type) {
        int result = 0;

        switch (type) {
            case SOCCER:
                result = 11;
                break;
            case HOCKEY:
                result = 6;
                break;
            case RUGBY:
                result = 15;
                break;
        }
        return result;
    }


}




