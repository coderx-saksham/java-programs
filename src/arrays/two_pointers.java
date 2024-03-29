package arrays;
import java.io.*;
import java.util.*;

public class two_pointers {
    public static void main(String[] args) {
        int arr[] = {3, 5, 9, 2, 8, 10, 11};
        int val = 17;

        System.out.println(isPairSum(arr, arr.length, val));
    }

    private static int isPairSum(int A[], int N, int X) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // Skip the same element (i and j are equal)
                if (i == j)
                    continue;

                // Check if the sum of the pair equals X
                if (A[i] + A[j] == X)
                    return 1; // Pair exists

                // Since the array is sorted, if the sum exceeds X, break the inner loop
                if (A[i] + A[j] > X)
                    break;
            }
        }

        // No pair found with the given sum
        return 0;
    }
}
