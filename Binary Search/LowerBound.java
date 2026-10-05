class LowerBound {
    public int lowerbound(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] >= target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] num = {1, 3, 5, 7, 9, 11, 13, 15};
        int x = 11;
        LowerBound lb = new LowerBound();
        System.out.println(lb.lowerbound(num, x));
    }
}