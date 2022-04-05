package chapter1;

import java.util.Scanner;

public class Main8 {
    public String solution(String a){
        String answer = "NO";
        a = a.toUpperCase().replaceAll("[^A-Z]", "");
        String b = new StringBuilder(a).reverse().toString();
        if(a.equals(b)) answer ="YES";

        return answer;
    }

    public static void main(String[] args) {
        Main8 main = new Main8();
        Scanner sc = new Scanner(System.in);
        String b= sc.nextLine();
        System.out.println(main.solution(b));
    }
}
