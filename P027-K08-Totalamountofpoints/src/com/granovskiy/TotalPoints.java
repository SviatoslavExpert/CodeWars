package com.granovskiy;

public class TotalPoints {
    public static int points(String[] games) {
        int score = 0;
        for (int i = 0; i < games.length; i++) {
            if (Character.getNumericValue(games[i].charAt(0))
                    > Character.getNumericValue(games[i].charAt(2))) {
                score += 3;
            }
            if (Character.getNumericValue(games[i].charAt(0))
                    < Character.getNumericValue(games[i].charAt(2))) {
                score += 0;
            }
            if (Character.getNumericValue(games[i].charAt(0))
                    == Character.getNumericValue(games[i].charAt(2))) {
                score += 1;
            }
        }
        return score;
    }
}
