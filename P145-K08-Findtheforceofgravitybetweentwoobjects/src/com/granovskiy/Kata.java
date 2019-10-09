package com.granovskiy;

import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static double solution(double[] arrVal, String[] arrUnit) {
        java.util.HashMap<String, Double> unitCalculator = new java.util.HashMap<>();

        unitCalculator.put("kg", 1.);
        unitCalculator.put("g", .001);
        unitCalculator.put("mg", .000001);
        unitCalculator.put("μg", .000000001);
        unitCalculator.put("lb", 0.453592);
        unitCalculator.put("m", 1.);
        unitCalculator.put("cm", .01);
        unitCalculator.put("mm", .001);
        unitCalculator.put("μm", .000001);
        unitCalculator.put("ft", 0.3048);

        double m1 = arrVal[0] * unitCalculator.get(arrUnit[0]);
        double m2 = arrVal[1] * unitCalculator.get(arrUnit[1]);
        double r = arrVal[2] * unitCalculator.get(arrUnit[2]);

        return 6.67*java.lang.Math.pow(10,-11)*m1*m2/(r*r);
    }
}
