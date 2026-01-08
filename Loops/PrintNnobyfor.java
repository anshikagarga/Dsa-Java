package Loops;


import java.util.Scanner;

public class PrintNnobyfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();
//        int sum = 0;
        int num =n;
        //for loop -> for(init-statement;condition;final-expression){//code}
        for(;num>=1;num--){
            System.out.println(num);
//            sum = sum + num;
        }


    }
}
