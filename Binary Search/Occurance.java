class Occurance{
    public int search(int[] nums, int k) {
       int low = 0;
       int high = nums.length-1;
       int ans = -1;
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
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int k = 0;
        Occurance sol = new Occurance();
        int ans = sol.search(nums, k);
        System.out.println(ans);
    }
}