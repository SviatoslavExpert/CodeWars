import java.util.List;

public class Kata {
    public static int sum(List<?> mixed) {
        String s;
        int sum = 0;
        for (Object i : mixed) {
            s = "" + i;
            sum = sum + Integer.valueOf(s);
        }
        return sum;
        //  return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
    }
}
