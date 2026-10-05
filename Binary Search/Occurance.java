// Given a sorted array of nums consisting of distinct integers and a target value, return the index if the target is found. If not,
// return the index where it would be if it were inserted in order.

// Example 1:
// Input: nums = [1, 3, 5, 6], target = 5

// Output: 2
// Explanation: The target value 5 is found at index 2 in the sorted array. Hence, the function returns 2.

class Occurance{
    public int search(int[] nums, int k) {
       int low = 0;
       int high = nums.length-1;
       int ans = nums.length;
       while(low <= high){
        int mid = (low+high)/2;
        if(nums[mid] == k){
            ans = mid;
            return ans;
        }
        else if(nums[mid] > k){
            high = mid-1;
        }else{
            low = mid+1;
        }
       }
       return ans;
    }
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 4, 5, 6, 7};
        int k = 8;
        Occurance sol = new Occurance();
        int ans = sol.search(nums, k);
        System.out.println(ans);
    }
}