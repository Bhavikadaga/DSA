package recurssion;
class Factorial {
    public int factorial(int num){
        if(num <= 1) return 1;
        else return num * factorial(num - 1);
    }
    public static void main(String[] args) {
        Factorial ft = new Factorial();
        System.out.println(ft.factorial(3));
    }
}