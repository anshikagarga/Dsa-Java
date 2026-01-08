package Arrays;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class sumOfarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element which you want to sized");
        int n =  sc.nextInt(); //3
        int []arr = new int[n]; //
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();// 1 2 1
        }
        int m = sc.nextInt(); //3
        int []arr1 = new int[m];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt(); //2 2 1
        }
        int[] sum = new int[n > m? n : m]; // 3>3 -> m =3
        int c = 0;
        int i = arr.length - 1; //2
        int j = arr1.length - 1; //2
        int k = sum.length  - 1; //2
        while( k >= 0){ //2>=0
            int d = c; // d=0
            if(i >= 0){ //2>=0
                d += arr[i];// 0+1 = 1
            }
            if(j >= 0){
                d += arr1[j]; // 3
            }
            c =d/10; //
            d =d%10;
            sum[k] = d;
            i--;
            j--;
            k--;
        }
        if(c != 0){
            System.out.print(c);
        }
        for(int val : sum){
            System.out.print(val);
        }



    }
}
