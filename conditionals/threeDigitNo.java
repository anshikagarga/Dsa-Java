package conditionals;
import java.util.Scanner;

public class threeDigitNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three digit: ");
        int n = sc.nextInt();
        if(n>99 && n<1000){
            System.out.println("executes only three digit");
        }
        else{
            System.out.println("its not three digit");
        }


    }
}
