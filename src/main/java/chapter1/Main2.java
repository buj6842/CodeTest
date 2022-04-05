package chapter1;

import java.util.Scanner;

public class Main2 {

    public String solution(String b){
        String[] a = b.split(" ");
        int length = 0;
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if(length < a[i].length()){
                length = a[i].length();
                index = i;
            }
        }
        return  a[index];
    }

    public static void main(String[] args) {
        Main2 main2 = new Main2();
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.print(main2.solution(a));
    }
}
