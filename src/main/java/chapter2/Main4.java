package chapter2;

import java.util.Scanner;

public class Main4 {
    public int[] solution(int a){
        int [] answer = new int[a];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < a; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Main4 main = new Main4();
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print(main.solution(a)[i] +" ");
        }
    }
}
