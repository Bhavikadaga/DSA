// package Arrays;

// // public class SecLargest {

// //     int[] nums = {8, 8, 7, 6, 5};

// //     void cal(){
// //         int largest = nums[0];
// //         int secLargest = nums[0];

// //         for(int i=0; i<nums.length; i++){
// //             if(nums[i] > largest){
// //                 secLargest = largest;
// //                 largest = nums[i];
// //             }
// //             else if(nums[i]>secLargest && nums[i] != largest){
// //                 secLargest = nums[i];
// //             }
// //         }

// //         System.out.println("Largest: " + largest);
// //         System.out.println("Second largest: " + secLargest);
// //     }
// //     public static void main(String[] args) {
// //         SecLargest sl = new SecLargest();
// //         sl.cal();
// //     }
// // }


// // class SecLargest {
// //     int[] nums = {12, 35, 1, 10, 34, 1};
// //     public int secondLargestElement() {
// //         int largest = nums[0];
// //         int secLargest = -1; 

// //         for(int i=1; i<nums.length; i++){
// //             if(nums[i] > largest){
// //                 secLargest = largest;  
// //                 largest = nums[i];     
// //             } else if(nums[i] > secLargest && nums[i] != largest){
// //             secLargest = nums[i];  
// //             }
// //         }
// //         return secLargest;
// //     }

// //     public static void main(String args[]){
// //         SecLargest sl = new SecLargest();
// //         int seclargest = sl.secondLargestElement();
// //         System.out.println("Second Largest Element is: " + seclargest);
// //     }
// // }


// class SecLargest {
//     int[] arr = {12, 35, 1, 10, 34, 1};
//     public int getSecondLargest(int[] arr) {  
//         int largest = arr[0];
//         int secLargest = -1; 
        
//         for(int i=1; i<arr.length; i++){
//             if(arr[i] > largest){
//                 secLargest = largest;  
//                 largest = arr[i];     
//             } else if(arr[i] > secLargest && arr[i] != largest){
//                 secLargest = arr[i];  
//             }
//         }
//         return secLargest;
//     }

//     public static void main(String args[]){
//         SecLargest sl = new SecLargest();
//         int seclargest = sl.getSecondLargest(sl.arr);
//         System.out.println("Second Largest Element is: " + seclargest);
//     }
// }