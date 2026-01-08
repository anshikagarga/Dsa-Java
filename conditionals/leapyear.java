package conditionals;
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int n = sc.nextInt();
        if (n%4==0){
            System.out.println("This is a leap year");
        }
        else{
            System.out.println("This is not a leap year");
        }
    }
}
