// package Arrays;
// import java.util.*;

// class SortArray{
//     public int removeDuplicates(int[] nums) {
//         if(nums.length == 0){
//             return 0;
//         }

//         int k = 1;

//         for(int i=1; i<nums.length; i++){
//             if(nums[i] != nums[i-1]){
//                 nums[k] = nums[i];
//                 k++;
//             }
//         }

//         return k;
//     }

//     public static void main(String[] args) {
//         SortArray arr = new SortArray();
//         int[] nums = {1, 2, 2, 4, 5, 7, 7, 9};
//         int n = arr.removeDuplicates(nums);

//         System.out.println(n);
//         for(int i=0; i<n; i++){
//             System.out.print(nums[i] + " ");
//         }
//     }
// }