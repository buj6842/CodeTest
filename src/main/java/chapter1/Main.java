package chapter1;

import java.util.Scanner;

public class Main {
    public String solution(String a){
        String answer = "";
        char[] aws = a.toCharArray();
        for (int i = 0; i < a.toCharArray().length; i++) {
            if(Character.isUpperCase(a.toCharArray()[i])){
                aws[i] = Character.toLowerCase(a.toCharArray()[i]);
            }else {
                aws[i] = Character.toUpperCase(a.toCharArray()[i]);
            }
        }
        answer = String.valueOf(aws);
        return answer;
    }

    public static void main(String[] args){
        Main t = new Main();
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        System.out.println(t.solution(input1));
    }
}
