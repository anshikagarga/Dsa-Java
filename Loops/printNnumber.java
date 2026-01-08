package Loops;
import java.util.Scanner;
//while loop -> while(condition){//code}

public class printNnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        int num =1;
        //while loop -> while(condition){//code}
        while(num <= n){
            System.out.println( sum);
            sum = sum + num;
            num++;
        }


    }
}
