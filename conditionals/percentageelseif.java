package conditionals;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class percentageelseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter percentage :");
        int n = sc.nextInt();
        if(n>90 && n<100 ){
            System.out.println("Excellent");
        }
        else if (n>80 && n<90) {
            System.out.println("very good");
        }
        else if (n>70 && n<80) {
            System.out.println("Good");

        }
        else if (n>60 && n<70) {
            System.out.println("Can do better");

        }
        else if (n>50 && n<60) {
            System.out.println("Average");

        }
        else if (n>40 && n<50) {
            System.out.println("Below Average");

        }
        else if (n<40) {
            System.out.println("Fail");

        }
        else{
            System.out.println("invalid");
        }


    }
}
