package conditionals;
import java.util.Scanner;

public class twoDigitNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two digit no");
        int t = sc.nextInt();
        if(t>9 && t<100){
            System.out.println("its only two digit");
        }
        else{
            System.out.println("its not only two digit");
        }


    }
}
