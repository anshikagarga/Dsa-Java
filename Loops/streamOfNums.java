package Loops;
import java.util.Scanner;

public class streamOfNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 15
        int sum = 0; //0
        while(num != -1){ //15 !=0 yes
            sum += num; //0+15=15
            num = sc.nextInt(); //20

        }
        System.out.println(sum);



    }
}
