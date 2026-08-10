// package Arrays;
// import java.util.HashMap;
// import java.util.Map;

// // public class union {
// //     public int[] unionarray(int[] nums1, int[] nums2) {
// //         ArrayList<Integer> res = new ArrayList<Integer>();
// //         int i=0, j=0;

// //         while(i<nums1.length && j<nums2.length){
// //             if(nums1[i] <= nums2[j]){
// //                 if(res.isEmpty() || res.get(res.size() -1) != nums1[i]){
// //                     res.add(nums1[i]);
// //                 }
// //                 i++;
// //             }else{
// //                 if(res.isEmpty() || res.get(res.size()) -1 != nums2[j]){
// //                 res.add(nums2[j]);
// //                 }
// //                 j++;
// //             }

// //             while(j<nums2.length){
// //                 if(res.get(res.size() -1) != nums2[j]){
// //                     res.add(nums2[j]);
// //                 }
// //                 j++;
// //             }
// //         }

// //         int[] unionarray = new int[res.size()];
// //         for(int k=0; k<res.size(); k++){
// //             unionarray[k] = res.get(k);
// //         }
        
// //         return unionarray;
// //     }
// // }



// // public class union{

// //     public int[] twoSum(int[] nums, int target) {
// //         Map<Integer, Integer> map = new HashMap<>();
// //         int n = nums.length;
// //         for(int i=0; i<n; i++){
// //             int complementNo = target - nums[i];

// //             if(map.containsKey(complementNo)){
// //                 return new int[]{map.get(complementNo), i};
// //             }
// //             map.put(nums[i], i);
// //         }
// //         return new int[]{};
// //     }
// //         public static void main(String[] args) {
        
// //     }
// // }

// class union {
//     public void sortZeroOneTwo(int[] nums) {
//         int low=0, mid=0, high = nums.length-1;
//         while(mid<=high){
//             if(nums[mid]==0){
//                 int temp = nums[low];
//                 nums[low] = nums[mid];
//                 nums[mid] = nums[temp];
//                 low++;
//                 mid++;
//             }else if(nums[mid]==1){
//                 mid++;
//             }else{
//                 int temp = nums[mid];
//                 nums[mid] = nums[high];
//                 nums[high] = temp;
//                 high--;
//             }
//         }
//     }
// }