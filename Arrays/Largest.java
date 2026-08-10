// package Arrays;

// // public class InnerLargest {
// //     int[] nums = {2, 5, 7, 9, 6, 3};

// //     void cal(){

// //         int max = nums[0];

// //         // for(int i=0; i<nums.length; i++){
// //         //     for(int j=i+1; j<nums.length; j++){
// //         //         if(nums[i]<nums[j]){
// //         //             max = nums[j];
// //         //         }
// //         //     }
// //         //     if(nums[i]>max){
// //         //         max = nums[i];
// //         //     }
// //         // }
// //         // System.out.println("Max num is: " + max);

// //         for (int i=1; i<nums.length; i++){
// //             if(nums[i] > max){
// //                 max = nums[i];
// //             }
// //         }
// //         System.out.println("Max num is: "+ max);
// //     }

// //     public static void main(String[] args) {
// //         InnerLargest num = new InnerLargest();
// //         num.cal();
// //     }
// // }



// class Largest {
//     int[] nums = {3, 3, 6, 1};
//     public int largestElement() {
//         int max = nums[0];
//         for(int i=1; i<nums.length; i++){
//             if(nums[i] > max){
//                 max = nums[i];
//             }
//         }
//         return max;
//     }

//     public static void main(String args[]){
//         Largest sl = new Largest();
//         int max = sl.largestElement();
//         System.out.println("Largest Element is: " + max);
//     }
// }
