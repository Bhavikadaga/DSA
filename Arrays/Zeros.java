// // class Zeros{
// //     public void moveZeroes(int[] nums) {
// //         int[] temp = new int[nums.length];
// //         int index = 0;

// //         for(int i=0; i<nums.length; i++){
// //             if(nums[i] != 0){
// //                 temp[index] = nums[i];
// //                 index++;
// //             }
// //         }
// //         for(int i=0; i<index; i++){
// //             nums[i] = temp[i];
// //         }
// //         int nz = index;

// //         for(int i=nz; i<nums.length; i++){
// //             nums[i] = 0;
// //         }
// //     }
// // }

// class Zeros{
//     public void movezeros(int[] nums){
//         int j=-1;
//         for(int i=0; i<nums.length; i++){
//             if(nums[i] != 0){
//                 j++;
//                 int temp = nums[j];
//                 nums[j] = nums[i];
//                 nums[i] = temp;
//             }
//         }
//     }
// }