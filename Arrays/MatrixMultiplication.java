package Arrays;
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        for first row and first column
        System.out.println("enter the first row");
        int r1 = sc.nextInt(); // 3
        System.out.println("enter the first column");
        int c1 = sc.nextInt(); //4
        int [][] one = new int[r1][c1];
        for(int i=0; i< one.length; i++) {
            for (int j = 0; j < one[0].length; j++) {
                one[i][j] = sc.nextInt();
            }
        }
//        for second row  and second column
        System.out.println("enter the second row");
        int r2 = sc.nextInt(); // 4
        System.out.println("enter the second column");
        int c2 = sc.nextInt(); //3
        int [][] two = new int[r2][c2];
        for(int i=0; i< two.length; i++){
            for(int j=0; j< two[0].length; j++){
                two[i][j] = sc.nextInt();
            }
        }
        if(c1 != r2){
            System.out.println("invalid!");
            return;
        }
        int[][] prod = new int[r1][c2];
        for(int i=0; i< prod.length; i++){
            for(int j=0; j< prod[0].length; j++){
                for(int k=0; k< c1 ; k++){
                    prod[i][j] += one[i][k] * two[k][j];
                }
            }
        }

        for(int i=0; i< prod.length; i++){
            for(int j=0; j< prod[0].length; j++){
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        }



    }
}
