import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(Arrays.toString(incrementAndSlice(arr)));
    }

    public static int [] incrementAndSlice (int [] arr){
        int[] slice = new int[5];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] += 1;
            }
            if (i >= 2 && i <= 6) {
                slice[j] = arr[i];
                j++;
            }
        }
        return slice;
    }
    }
