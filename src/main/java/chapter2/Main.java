package chapter2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            if(i!=0){
                if(b[i]<b[i+1]){
                    answer.add(b[i+1]);
                }
            } else answer.add(b[i]);
        }

     return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        for(int i =0; i<a ; i++){
            b[i] = sc.nextInt();
        }
        for(int x : main.solution(a,b)){
            System.out.print(x +" ");
        }
    }
}
