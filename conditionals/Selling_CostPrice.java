package conditionals;
import java.util.Scanner;

public class Selling_CostPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  of selling price");
        int  selling_price = sc.nextInt();
        System.out.println("Enter the number of cost price");
        int  cost_price = sc.nextInt();
        if(selling_price> cost_price){
            int profit = selling_price - cost_price;
            System.out.println("They will give profit " +profit);
        }
        else{
            int loss = cost_price - selling_price;
            System.out.println("They will give loss " + loss);
        }

    }
}
