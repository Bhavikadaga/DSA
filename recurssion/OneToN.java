package recurssion;

// public class OneToN {
//     public void OnetoN(int n){
//         int crnt = 0;
//         if(crnt>n){
//             return;
//         }else{
//             crnt = crnt + 1;
//             System.out.println(crnt);
//             crnt++;
//         }
//     }
//     public static void main(String[] args) {
//         OneToN obj = new OneToN();
//         obj.OnetoN(5);
//     }
// }

class OneToN {
    public static int fib(int n) {
        if(n <= 1) return n;

        int last = fib(n-1);
        int slast = fib(n-2);

        return last + slast; 
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));
    }
}
