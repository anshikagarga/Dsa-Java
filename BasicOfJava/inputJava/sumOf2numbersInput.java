package BasicOfJava.inputJava;
import java.util.Scanner;

public class sumOf2numbersInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The first number");
        int x = sc.nextInt();
        System.out.println("The second number");
        int y = sc.nextInt();
        int sum = x + y;
        System.out.println("the sum is : " +sum);
    }
}
