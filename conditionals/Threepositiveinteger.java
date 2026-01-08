package conditionals;


import java.util.Scanner;

public class Threepositiveinteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x = sc.nextInt();
        System.out.println("Enter the number");
        int y = sc.nextInt();
        System.out.println("Enter the number");
        int z = sc.nextInt();
        if(x>=y && x>=z){
            System.out.println("x is the greatest number");
        }
        else if (y>=x && y>=z) {
            System.out.println("y is the greatest number");

        }
        else{
            System.out.println("z is the greatest number");
        }


    }
}
