package recurssion;

import java.util.Scanner;

public class CapitalizeFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        for(int i = 0; i < words.length; i++){
            words[i] = words[i].substring(0,1).toUpperCase()+words[i].substring(1);
        }
        for(String word: words){
            System.out.println(word + " ");
        }
        sc.close();
    }
}