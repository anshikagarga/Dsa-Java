package pattern;
import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("enter the number");
        int n = sc.nextInt();
        for(i = n ; i>=1 ;i--){
            for(j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
