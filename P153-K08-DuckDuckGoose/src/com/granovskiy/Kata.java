package com.granovskiy;

public class Kata {
    public static String duckDuckGoose(Player[] players, int goose) {
        return players[(goose - 1) % players.length].name;
    }

/*    public static String duckDuckGoose(Player[] players, int goose) {
        // Note: Player objects have a String field called 'name'.
        if (goose<players.length){
            return players[goose-1].name;
        }
        if (goose%players.length == 0){
            return players[players.length-1].name;
        }
        return players[goose%players.length-1].name;

    }*/
}
