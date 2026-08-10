class Inversion {
    static int numberOfInversions(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        for(int i = 0; i < n; i ++){
            for(int j = i+1; j < n; j++){
                if(nums[i] > nums[j]) cnt ++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int inversions = numberOfInversions(arr);
        System.out.println("The number of inversions is: " + inversions);
    }
}