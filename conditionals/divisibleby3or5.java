package conditionals;

import java.util.Scanner;

public class divisibleby3or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x = sc.nextInt();
//        System.out.println("Enter the number:");
//        int y = sc.nextInt();
        if(x%3==0 || x%5==0){
            System.out.println("this number is divisible by 3 or 5");
        }
        else{
            System.out.println("this number is not divisible by 3 or 5");
        }



    }
}
