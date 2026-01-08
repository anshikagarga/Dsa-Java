package conditionals;
import java.util.Scanner;

public class Area_perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        int l = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle");
        int b = sc.nextInt();
        int aor = l*b;
        int por = 2*( l + b);
        if(aor>por){
            System.out.println("Area of rectangle is greater than its perimeter " +aor);
        } else if (aor<por) {
            System.out.println("Perimeter of rectangle is greater than its area " +por);

        } else{
            System.out.println("Perimeter and area of Rectangle are equal " +(por & aor));
        }



    }
}
