package BasicOfJava.inputJava;
import java.util.Scanner;




public class squareofno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the number");
        int x = sc.nextInt();
        int square = x*x;
        System.out.println(square);
    }
}
