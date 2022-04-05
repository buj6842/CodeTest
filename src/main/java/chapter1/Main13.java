package chapter1;

import java.util.Scanner;

public class Main13 {
    public String solution(String a){
        String answer="";
        a=a+" ";
        int cnt = 1;
        for (int i = 0; i < a.length()-1; i++) {
            if(a.charAt(i)==a.charAt(i+1)){
                cnt++;
            }else {
                answer+=a.charAt(i);
                if(cnt > 1){
                    answer+=String.valueOf(cnt);
                }
                cnt = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main13 main = new Main13();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(main.solution(a));
    }
}
