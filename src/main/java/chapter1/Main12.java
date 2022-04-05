package chapter1;

import java.util.Scanner;

public class Main12 {
    public String solution(int a, String b){
        String answer = "";
        for (int i = 0; i < a ; i++) {
            String tmp =  b.substring(0,7).replace("*","0").replace("#","1");
            int num =  Integer.parseInt(tmp,2);
            answer+= (char) num;
            b = b.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main12 main12 = new Main12();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        System.out.println(main12.solution(a,b));
    }
}
