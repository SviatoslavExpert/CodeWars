public class Kata {
    public static int[] reverse(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = n - i;
        }
        return array;
        //  return IntStream.range(-n, 0).map(Math::abs).toArray();
    }
}
