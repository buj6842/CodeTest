package chapter2;

import java.util.Scanner;

public class Main3 {
    public String solution(int a, int[] b, int[] c){
        String answer = "";



        return answer;
    }

    public static void main(String[] args) {
        Main3 main = new Main3();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        int[] c = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < a; i++) {
            c[i] = sc.nextInt();
        }
        System.out.println(main.solution(a,b,c));
    }
}
