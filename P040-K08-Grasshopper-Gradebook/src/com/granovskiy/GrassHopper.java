package com.granovskiy;

public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {
        int score = (s1 + s2 + s3) / 3;
        char result = 'A';
        if (90 <= score && score <= 100) result = 'A';
        if (80 <= score && score < 90) result = 'B';
        if (70 <= score && score < 80) result = 'C';
        if (60 <= score && score < 70) result = 'D';
        if (0 <= score && score < 60) result = 'F';
        return result;
/*
        int mean = (s1 + s2 + s3) / 3;
        if (mean >= 90) return 'A';
        if (mean >= 80) return 'B';
        if (mean >= 70) return 'C';
        if (mean >= 60) return 'D';
        return 'F';
        */
    }
}
