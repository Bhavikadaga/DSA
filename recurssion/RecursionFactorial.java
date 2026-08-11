package recurssion;

public class RecursionFactorial {
    static int factorial(int n){
        if(n == 0 || n == 1) return 1;
        else return n * factorial(n-1);
    }
    public static void main(String[] args) {
        int res = factorial(5);
        System.out.println(res);
    }
}