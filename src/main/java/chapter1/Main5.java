package chapter1;

import java.util.Scanner;

public class Main5 {


    public int[] solution(String s , char t){
        int[] answer = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t){
                p = 0;
                answer[i] =p;
            }else {
                p++;
                answer[i] =p;
            }
        }
        p = 1000;
        for (int i = s.length()-1; i>=0; i--)
            if(s.charAt(i) == t){
                p = 0;
            }else {
                p++;
                answer[i] =Math.min(answer[i],p);
            }
        return answer;
    }

    public static void main(String[] args) {
        Main5 T = new Main5();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for (int x : T.solution(str , c)){
            System.out.println(x + " ");
        }
    }
}