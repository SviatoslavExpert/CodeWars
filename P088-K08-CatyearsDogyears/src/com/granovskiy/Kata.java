package com.granovskiy;

public class Kata {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        if (humanYears == 1) return new int[]{humanYears, 15, 15};
        if (humanYears == 2) return new int[]{humanYears, 24, 24};
        return new int[]{humanYears, 24 + (humanYears - 2) * 4, 24 + (humanYears - 2) * 5};
        //  return new int[]{y, y == 1 ? 15 : 16 + 4 * y, y == 1 ? 15 : 14 + 5 * y};
    }
}
