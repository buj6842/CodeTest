package chapter2;

import java.util.Scanner;

public class Main5 {
    public int solution(int a){
        int answer = 0;
        int[] arr = new int[a];
        for (int i = 2; i < a; i++) {
            if(a%i == 0){
                answer ++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main5 main = new Main5();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(main.solution(a));
    }
}
