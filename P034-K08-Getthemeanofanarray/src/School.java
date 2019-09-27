public class School {
    public static int getAverage(int[] marks) {
        int result = 0;
        for (int e : marks) {
            result += e;
        }
        return result / marks.length;
        //
    }
}
