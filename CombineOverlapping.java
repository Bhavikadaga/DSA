import java.util.*;
public class CombineOverlapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[][] intervals = new int[n][2];
        for(int i=0; i<n; i++){
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=0; i<n; i++){
            if(intervals[i][0] <= end){
                end = Math.max(end, intervals[i][1]);
            }else{
                System.out.println(start + " " + end);
                start= intervals[i][0];
                end = intervals[i][1];
            }
        }
        System.out.println(start + " " + end);
        sc.close();
    }
}
