package chapter2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public int solution(int a ,int[] b){
        int answer = 1;
        int def = b[0];
        for (int i = 1; i < a; i++) {
            if(b[i]>def){
                answer++;
                def=b[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main2 main = new Main2();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(main.solution(a,b));
    }
}
