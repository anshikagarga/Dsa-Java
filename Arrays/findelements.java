package Arrays;
import java.util.Scanner;

public class findelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i = 0; i< arr.length; i++){
             arr[i] = sc.nextInt();


        }
        System.out.println("Enter the element which belongs to array");
        int x = sc.nextInt();
        int idx = -1;
        for(int i = 0; i< arr.length; i++) {
            if (x == arr[i]) {
                idx = i;
                break;
            }
            }
        System.out.println(idx);
        }


    }
