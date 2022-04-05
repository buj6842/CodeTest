package chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Nifa {

    public static void main(String[] args) {
        String[] Nifa = { "니" , "파" };

        Random random = new Random();
        for(int i = 0 ;i<6 ; i++) {
            System.out.println(Nifa[random.nextInt(2)]);
        }
    }
}
