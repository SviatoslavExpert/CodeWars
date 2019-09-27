public class Kata {
    public static int makeNegative(final int x) {
        if (x < 0) return x;
        return x == 0 ? 0 : -x;
        //  return -abs(x);
    }
}
