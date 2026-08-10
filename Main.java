// // import java.util.*;

// // class Bubblesort {
// //     public int secondLargestElement(int[] nums) {
// //         int n = nums.length;
// //         if( n == 0 || n == 1) return -1;

// //         int small = Integer.MAX_VALUE;
// //         int secSmallest = Integer.MAX_VALUE;
// //         int large = Integer.MIN_VALUE;
// //         int secLarge = Integer.MIN_VALUE;

// //         for(int i = 0; i < n; i++){
// //             small = Math.min(small, nums[i]);
// //             large = Math.max(large, nums[i]);
// //         }

// //         for(int i = 0; i < n; i++){
// //             if(nums[i] < secSmallest && nums[i] != small){
// //                 secSmallest = nums[i]; 

// //             }
// //             if(nums[i] > secLarge && nums[i] != large){
// //                 secLarge = nums[i];
// //             }
// //         }
// //         return secLarge;
// //     }

// //     public static void main(String[] args) {
// //         Bubblesort obj = new Bubblesort();
// //         int[] nums = {5, 2, 9, 1, 7};
// //         int ans = obj.secondLargestElement(nums);
// //         System.out.println("Second Largest Element: " + ans);
// //     }
// // }

// import java.util.*;

// // Class containing the sliding window algorithm
// // class Bubblesort {
// //     public int longestSubarray(int[] nums, int k) {
// //         int n = nums.length;
// //        int maxlen = 0;
// //        int left = 0;
// //        int right = 0;
// //        int sum = nums[0];
// //        while(right < n){
// //           while(left <= right && sum > k){
// //             sum -= nums[left];
// //             left++;
// //           }
// //           if(sum == k){
// //             maxlen = Math.max(maxlen, right - left + 1);
// //           }
// //           right++;
// //           if(right < n){
// //             sum += nums[right];
// //           }
// //        }
// //        return maxlen;
// //     }
// // }

// // // Separate class containing only the main method
// // public class Main {
// //     public static void main(String[] args) {
// //         int[] nums = {10, 5, 2, 7, 1, 9};
// //         int k = 15;
// //         Bubblesort sol = new Bubblesort();
// //         int ans = sol.longestSubarray(nums, k);
// //         System.out.println("The length of longest subarray having sum k is: " + ans);
// //     }
// // }

// class Main {
//     // Function to find indices of two numbers whose sum is target
//     public int[] twoSumExists(int[] nums, int target) {
//         int n = nums.length;
//         int left = 0;
//         int right = n - 1;
//         while(left < right){
//           int sum = nums[left] + nums[right];
//           if(sum == target){
//             return new int[]{left, right};
//           }else if(sum < target){
//             left++;
//           }else{
//             right --;
//           }
//         }
//       return new  int[]{-1, -1};
//     }
//     public static void main(String[] args) {
//         Main sol = new Main();
//         int[] arr = {2, 6, 5, 8, 11};
//         int target = 14;
//         int[] res = sol.twoSumExists(arr, target);
//         System.out.println("[" + res[0] + ", " + res[1] + "]");
//     }
// }



class Main {
    // Function to sort the array containing only 0s, 1s and 2s
    public void sortZeroOneTwo(int[] nums) {
        int low = 0; 
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 1, 0};

        Main obj = new Main();
        obj.sortZeroOneTwo(nums);

        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}