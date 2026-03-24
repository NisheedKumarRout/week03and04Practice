import java.util.*;

public class Problem6 {

    public static void main(String[] args) {
        int[] arr = {10, 25, 50, 100};
        int target = 30;

        int floor = -1, ceil = -1;

        for (int x : arr) {
            if (x <= target) floor = x;
            if (x >= target && ceil == -1) ceil = x;
        }

        System.out.println("Floor: " + floor);
        System.out.println("Ceil: " + ceil);
    }
}