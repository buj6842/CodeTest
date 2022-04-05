package chapter1;

import java.util.Scanner;

public class Main10 {

    public int[] solution(String s, char t){

        int p = 1000;
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t){
                p=0;
                answer[i] = p;
            }else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for (int i = s.length() - 1 ; i >= 0; i--) {
            if(s.charAt(i) == t){
                p=0;
            }else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer ;
    }

    public static void main(String[] args) {
        Main10 main = new Main10();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for(int x : main.solution(str,c)){
            System.out.print(x+" ");
        }
    }
}
