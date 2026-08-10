// package Hard;
// // import java.util.*;
// // class Hard {
// //     public List<List<Integer>> threeSum(int[] nums) {
// //         int n = nums.length;
// //         Arrays.sort(nums);
// //         List<List<Integer>> ans = new ArrayList<>();
// //         for(int i = 0; i < n; i++){
// //             if(i > 0 && nums[i] == nums[i - 1]) continue;
// //             int left = i+1;
// //             int right = n - 1;
// //             while(left < right){
// //                 int sum = nums[i] + nums[left] + nums[right];
// //                 if(sum == 0){
// //                     ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
// //                     left++;
// //                     right--;

// //                     while(left < right && nums[left] == nums[left - 1]) left++;
// //                     while(left < right && nums[right] == nums[right + 1]) right--;
// //                 }else if (sum < 0) left++;
// //                 else right--;
// //             }
// //         }
// //         return ans;
// //     }
// //     public static void main(String[] args) {
// //         int[] arr = {-1, 0, 1, 2, -1, -4};
// //         Hard obj = new Hard();
// //         List<List<Integer>> res = obj.threeSum(arr);
// //         for (List<Integer> triplet : res) {
// //             System.out.println(triplet);
// //         }
// //     }
// // }


// import java.util.*;

// class FourSum {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         // int n = nums.length;
//         // Set<List<Integer>> set = new HashSet<>();
//         // for (int i = 0; i < n; i++) {
//         //     for (int j = i + 1; j < n; j++) {
//         //         HashSet<Long> seen = new HashSet<>();
//         //         for (int k = j + 1; k < n; k++) {
//         //             long req = (long) target - nums[i] - nums[j] - nums[k];
//         //             if (seen.contains(req)) {
//         //                 List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], (int) req);
//         //                 Collections.sort(temp);
//         //                 set.add(temp);
//         //             }
//         //             seen.add((long) nums[k]);
//         //         }
//         //     }
//         // }
//         // return new ArrayList<>(set);

//         int n = nums.length;
//         List<List<Integer>> ans = new ArrayList<>();
//         Arrays.sort(nums);
//         for(int i = 0; i < n; i++){
//             if(i > 0 && nums[i] == nums[i-1]) continue;
//             for(int j = i+1; j < n; j++){
//                 if(j > i && nums[j] == nums[j-1]) continue;
//                 int left = j+1; 
//                 int right = n-1;
//                 while(left < right){
//                     int sum = nums[i] + nums[j] + nums[left] + nums[right];
//                     if(sum == target){
//                         ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
//                         while(left < right && nums[left] == nums[left+1]) left++;
//                         while(left < right && nums[right] == nums[right-1]) right--;
//                         left++;
//                         right--; 
//                     }else if(sum < target) left++;
//                     else right--;
//                 }
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {

//         int[] arr = {1, 0, -1, 0, -2, 2};
//         int target = 0;

//         FourSum obj = new FourSum();

//         List<List<Integer>> ans = obj.fourSum(arr, target);

//         for (List<Integer> quad : ans) {
//             System.out.println(quad);
//         }
//     }
// }