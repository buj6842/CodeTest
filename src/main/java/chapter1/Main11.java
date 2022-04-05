package chapter1;

import java.util.Scanner;

public class Main11 {
    public String solution(String a){
        String answer = "";
        StringBuilder sb = new StringBuilder();
        answer = sb.reverse().toString();
        return answer;
    }

    public static void main(String[] args) {
        Main11 main = new Main11();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        for (int i = 0 ; i< a; i++){
            System.out.println(main.solution(b));
        }
    }
}
