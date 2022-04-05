package chapter1;

import java.util.Scanner;

public class Main6 {
    public String solution(String a){
        String answer = "";
        for (int i = 0; i < a.length() ; i++) {
            if(a.indexOf(a.charAt(i))==i){
                answer+=a.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main6 main = new Main6();
        Scanner sc = new Scanner(System.in);
        String b = sc.next();
        System.out.println(main.solution(b));
    }
}
