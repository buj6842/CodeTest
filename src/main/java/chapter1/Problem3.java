package chapter1;

import java.util.Scanner;

class Problem3 {
    public String solution(String a){
        String answer = "";
        String[] array = a.split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i].length();
        }
        return answer;
    }

    public static void main(String[] args){
        Problem3 t = new Problem3();
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        System.out.println(t.solution(input1));
    }
}
