class LowerBound {
    public int lowerBound(int[] nums, int x) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= x) {
                return i;  
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};  
        int x = 9;                      
        LowerBound finder = new LowerBound();   
        int ind = finder.lowerBound(arr, x);                 

        System.out.println("The lower bound is the index: " + ind); 
    }
}