package arrays;

public class KadaneAlgo {

        public static int kadaneAlgorithm(int[] arr) {
            int max_so_far = 0;
            int max_ending_here = 0;

            for (int num : arr) {
                max_ending_here = Math.max(num, max_ending_here + num);
                max_so_far = Math.max(max_so_far, max_ending_here);
            }

            return max_so_far;
        }

        public static void main(String[] args) {
            int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            System.out.println("Maximum subarray sum: " + kadaneAlgorithm(arr));
        }
    }


