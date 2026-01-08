package pattern;
import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sp = n/2;
        int st = 1;
        for(int i =1 ; i <= n; i++){
            for(int j =1; j <= i ; j++){
                System.out.print("* \t");
            }
            if(i <= n/2){
                sp--;
                st += 2;
            }
            else{
                sp++;
                st -= 2;
            }
            System.out.println();
        }


    }
}
