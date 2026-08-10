// // // import java.util.*;
// // // class Medium {
// // //     public int majorityElement(int[] nums) {
// // //         // int n = nums.length;
// // //         // for(int i = 0; i < n; i++){
// // //         //     int cnt = 0;
// // //         //     for(int j = 0; j < n; j++){
// // //         //         if(nums[j] == nums[i]){
// // //         //             cnt++;
// // //         //         }
// // //         //     }
// // //         //     if(cnt > n/2){
// // //         //         return nums[i];
// // //         //     }
// // //         // }
// // //         // return -1;

// // //         // int n = nums.length;
// // //         // HashMap<Integer, Integer> map = new HashMap<>();
// // //         // for(int num : nums){
// // //         //     map.put(num, map.getOrDefault(num, 0) + 1);
// // //         // }
// // //         // for(Map.Entry<Integer, Integer> entry : map.entrySet()){
// // //         //     if(entry.getValue() > n/2){
// // //         //         return entry.getKey();
// // //         //     }
// // //         // }
// // //         // return -1;

// // //         int n = nums.length;
// // //         int cnt = 0;
// // //         int el = 0;
// // //         for(int i= 0; i < n; i++){
// // //             if(cnt == 0){
// // //                 cnt = 1;
// // //                 el = nums[i];
// // //             }else if(el == nums[i]){
// // //                 cnt++;
// // //             }else{
// // //                 cnt++;
// // //             }
// // //         }
// // //         int cnt1 = 0;
// // //         for(int i = 0; i < n; i++){
// // //             cnt1++;
// // //         }
// // //         if(cnt > (n/2)){
// // //             return el;
// // //         }
// // //         return -1;
// // //     }

// // //     public static void main(String[] args) {
// // //         int[] arr = {2, 2, 1, 1, 1, 2, 2};
// // //         Medium sol = new Medium();
// // //         int ans = sol.majorityElement(arr);
// // //         System.out.println("The majority element is: " + ans);
// // //     }
// // // }


// // import java.util.*;

// // class Medium {
// //     public int maxSubArray(int[] nums) {
// //         int n = nums.length;
// //         int max = Integer.MIN_VALUE;
// //         int sum = 0;
// //         for(int i = 0; i < n; i++){
// //             sum += nums[i];
// //             if(sum > max){
// //                 max = sum;
// //             }
// //             if(sum < 0){
// //                 sum = 0;
// //             }
// //         }
// //         return (int) max;
// //     }

// //     public static void main(String[] args) {
// //         int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
// //         Medium sol = new Medium();
// //         int maxSum = sol.maxSubArray(arr);
// //         System.out.println("The maximum subarray sum is: " + maxSum);
// //     }
// // }



// // import java.util.*;
// // public class Medium {
// //     public int[] rearrangeArray(int[] nums) {
// //         int n = nums.length;
// //         int[] ans = new int[n];
// //         int posIndex = 0;
// //         int negIndex = 1;
// //         for(int i = 0; i < n; i++){
// //             if(nums[i] < 0){
// //                 ans[negIndex] = nums[i];
// //                 negIndex += 2;
// //             }else{
// //                 ans[posIndex] = nums[i];
// //                 posIndex += 2;
// //             }
// //         }
// //         return ans;
// //     }

// //     public static void main(String[] args) {
// //         int[] A = {1, 2, -4, -5};
// //         Medium obj = new Medium();
// //         int[] result = obj.rearrangeArray(A);
// //         for (int num : result) {
// //             System.out.print(num + " ");
// //         }
// //     }
// // }

// import java.util.HashSet;
// import java.util.Set;

// class Medium {
//    public int longestConsecutive(int[] nums) {
//         // int n = nums.length;
//         // if(n == 0) return 0;
//         // int longest = 1;
//         // for(int i = 0; i < n; i++){
//         //     int crnt = nums[i];
//         //     int cnt = 1;

//         //     while(true){
//         //         boolean found = false;

//         //         for(int j = 0; j < n; j++){
//         //             if(nums[j] == crnt + 1){
//         //                 found = true;
//         //                 crnt++;
//         //                 cnt++;
//         //                 break;
//         //             }
//         //         }
//         //         if(!found){
//         //             break;
//         //         }
//         //     }
//         //     longest = Math.max(longest, cnt);
//         // }
//         // return longest;

//         // int n = nums.length;
//         // if(n == 0) return 0;
//         // Arrays.sort(nums);
//         // int lastSmallest = nums[0];
//         // int cnt = 1;
//         // int longest = 1;
//         // for(int i = 0; i < n; i++){
//         //     if(nums[i] == lastSmallest + 1){
//         //         cnt++;
//         //         lastSmallest = nums[i];
//         //     }else if(nums[i] != lastSmallest){
//         //         cnt = 1;
//         //         lastSmallest = nums[i];
//         //     }
//         //     longest = Math.max(longest, cnt);
//         // }
//         // return longest;

//         int n = nums.length;
//         if(n == 0) return 0;
//         int longest = 1;
//         Set<Integer> set = new HashSet<>();
//         for(int num : nums){
//             set.add(num);
//         }
//         for(int it : set){
//             if(!set.contains(it - 1)){
//                 int cnt = 1;
//                 int crnt = it;

//                 while(set.contains(crnt + 1)){
//                     crnt += 1;
//                     cnt += 1;

//                 }
//                 longest = Math.max(longest, cnt);
//             }
//         }
//         return longest;
//     }

//     public static void main(String[] args) {
//         int[] a = {100, 4, 200, 1, 3, 2};
//         Medium solution = new Medium();
//         int ans = solution.longestConsecutive(a);
//         System.out.println("The longest consecutive sequence is " + ans);
//     }
// }



// class Medium {
//     // Function to set entire row and column to 0 if an element in the matrix is 0
//     public void setZeroes(int[][] matrix) {
//         // int m = matrix.length;
//         // int n = matrix[0].length;
//         // for(int i = 0; i < m; i++){
//         //     for(int j = 0; j < n; j++){
//         //         if(matrix[i][j] == 0){
//         //             for(int col = 0; col < n; col++){
//         //                 if(matrix[i][col] != 0)
//         //                     matrix[i][col] = -1;
//         //             }
//         //             for(int row = 0; row < m; row++){
//         //                 if(matrix[row][j] != 0)
//         //                     matrix[row][j] = -1;  
//         //             }
//         //         }
//         //     }
//         // }
//         // for (int i = 0; i < m; i++) {
//         //     for (int j = 0; j < n; j++) {
//         //         if (matrix[i][j] == -1)
//         //             matrix[i][j] = 0;
//         //     }
//         // }


//         // boolean[] row = new boolean[m];
//         // boolean[] col = new boolean[n];
//         // for(int i = 0; i < n; i ++){
//         //     for(int j = 0; j < m; j++){
//         //         if(matrix[i][j] == 0){
//         //             row[i] = true;
//         //             col[j] = true;
//         //         }
//         //     }
//         // }
//         // for(int i = 0; i < n; i ++){
//         //     for(int j = 0; j < m; j++){
//         //         if(row[i] || col[j]){
//         //             matrix[i][j] = 0;
//         //         }
//         //     }
//         // }
        
//         int n = matrix.length;
//         int m = matrix[0].length;
//         boolean firstrowzero = false;
//         boolean firstcolzero = false;
//         for(int i = 0; i < m; i++){
//             if(matrix[0][i] == 0){
//                 firstrowzero = true;
//                 break;
//             }
//         }
//         for(int j = 0; j < n; j++){
//             if(matrix[j][0] == 0){
//                 firstcolzero = true;
//                 break;
//             }
//         }
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < m; j++){
//                 if(matrix[i][j] == 0){
//                     matrix[i][0] = 0;
//                     matrix[0][j] = 0;
//                 }
//             }
//         }
//         for(int i = 1; i < n; i++){
//             for(int j = 1; j < m; j++){
//                 if (matrix[i][0] == 0 || matrix[0][j] == 0) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//         if(firstrowzero){
//             for(int i = 0; i < m; i++){
//                 matrix[0][i] = 0;
//             }
//         }
//         if(firstcolzero){
//             for(int j = 0; j < n; j++){
//                 matrix[j][0] = 0;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         // Example matrix
//         int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        
//         // Create Solution object
//         Medium sol = new Medium();
//         // Modify matrix
//         sol.setZeroes(matrix);
        
//         // Print result
//         for (int[] row : matrix) {
//             for (int val : row) {
//                 System.out.print(val + " ");
//             }
//             System.out.println();
//         }
//     }
// }



class Medium {
    public void rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i < n; i++){
            int left = 0;
            int right = n - 1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    
    public static void main(String[] args) {

    int[][] mat = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    Medium obj = new Medium();

    obj.rotateMatrix(mat);

    for (int[] row : mat) {
        for (int val : row) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    }
}