package chapter2;

import java.util.Scanner;

public class Main6 {

    public int solution(int a, int[] b){
        int answer = 0;
        int score = 0;
        int bonus = 0;
        for (int i = 0; i < a; i++) {
            if(b[i] == 0){
                bonus = 0;
            }else {

                bonus++;

                score += bonus;

            }
        }
        answer = score;

        return answer;
    }

    public static void main(String[] args) {
        Main6 main = new Main6();
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(main.solution(a,b));
    }
}
