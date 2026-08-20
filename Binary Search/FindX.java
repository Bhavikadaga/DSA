// Input: nums = [-1,0,3,5,9,12], target = 9
// Output: 4
// Explanation: The target integer 9 exists in nums and its index is 4


// Through iteration
// public class FindX {
//     public static int SearchX(int[] nums, int target) {
//         int low = 0;
//         int high = nums.length - 1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (nums[mid] == target) {
//                 return mid;
//             } 
//             else if (nums[mid] > target) {
//                 high = mid - 1;
//             } 
//             else {
//                 low = mid + 1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int[] a = {-1, 0, 3, 5, 9, 12};
//         int target = 9;
//         int ind = SearchX(a, target);
//         if (ind == -1)
//             System.out.println("The target is not present.");
//         else
//             System.out.println("The target is at index: " + ind);
//     }
// }



// through recursion 
public class FindX {
    public static int Search(int[] nums, int low, int high,  int target) {
        if(low > high) return -1;
        int mid = (low + high) / 2;
        if(nums[mid] == target) return mid;
        else if(nums[mid] > target) return Search(nums, low, mid-1, target);
        else return Search(nums, mid+1, high, target);
    }
    public static int search(int[] nums, int target){
        return Search(nums, 0, nums.length - 1, target);
    }
    public static void main(String[] args) {
        int[] a = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int ind = search(a, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);
    }
}