package Arrays2;
import java.util.*;


public class matrices {
    public static boolean search(int matrix[][],int  key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("found at all (" + i +"," + j +" )");
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;
    }

    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        while(startRow <= endRow && startCol <= endCol){
            // top
            for(int j= startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }
            // right
            for(int i = startRow+1; i<= endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }
            // bottom
            for(int j=endCol-1; j>= startCol; j--){
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            //left
            for(int i=endRow-1; i>=startRow; i--){
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int [3][3];
        int m = matrix.length, n = matrix[0].length;
        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] =sc.nextInt();
            }
        }
        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix,5);
        printSpiral(matrix);

    }

}
