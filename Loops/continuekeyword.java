package Loops;
import java.util.Scanner;

public class continuekeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num =1;
//        for( ; num <= 50; num++){
//            if(num%3 ==0){
//
//                continue;
//
//            }
//            System.out.println(num);
//        }
        int num =1;
        while(num <= 50){
            if(num % 3 == 0){
                num++;
                continue;
            }
            System.out.println(num);
            num++;
        }


    }
}
