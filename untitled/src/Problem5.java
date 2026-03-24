import java.util.*;

public class Problem5 {

    public static void linear(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals(key))
                System.out.println("Found at " + i);
    }

    public static void binary(String[] arr, String key) {
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m].equals(key)) {
                System.out.println("Found at " + m);
                return;
            }
            if (arr[m].compareTo(key) < 0) l = m + 1;
            else r = m - 1;
        }
    }

    public static void main(String[] args) {
        String[] arr = {"accA", "accB", "accB", "accC"};

        linear(arr, "accB");
        binary(arr, "accB");
    }
}