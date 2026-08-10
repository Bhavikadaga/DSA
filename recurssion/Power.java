package recurssion;

class Power {
    public int power(int base, int exponent){
        if(exponent == 0) return 1;
        else return base * power(base, exponent - 1);
    }
    public static void main(String[] args) {
        Power pw = new Power();
        System.out.println(pw.power(2, 0));
        System.out.println(pw.power(2, 2));
        System.out.println(pw.power(2, 4));
        
    }
}
