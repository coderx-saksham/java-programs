package arrays;
import java.util.*;

/*

 */
public class reverseArrayAfterMBit {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        reverse(arr, 4);
    }

    public static void reverse(ArrayList<Integer> arr, int m) {
        for(int i = m+1, j = arr.size()-1; i < j; i++, j--) {
            int temp = arr.get(j);
            arr.set(j, arr.get(i));
            arr.set(i, temp);
        }

        System.out.println(arr);
    }
}
