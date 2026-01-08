package conditionals;
import java.util.Scanner;

public class recatngle_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length ");
        int l = sc.nextInt();
        System.out.println("Enter the breadth");
        int b = sc.nextInt();
        if(l != b){
            System.out.println("Rectangle is not a square");
        }
        else{
            System.out.println("Rectangle is also a square");
        }


    }
}
