package chapter1;

import java.util.Scanner;

class Main4 {
    public int solution (String s) {
        String answer = "";
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)) answer +=x;
        }
        return Integer.parseInt(answer);
    }

    public static void main (String[] args){
        Main4 T = new Main4();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
