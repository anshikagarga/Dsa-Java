package Recursion;

public class printDecreaseNumber {

//    decreasing order
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+ " ");
        printDec(n-1);
    }

//    increasing order
    public static void printInc(int n){
        if(n==1){
            System.out.println(1);
            return;

        }

        printInc(n-1);
        System.out.println(n);
    }


//    factorial
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n*fact(n-1);
        return fn;
    }

//    for occurance
    public static int occurenceIndex(int arr[] , int key , int i){
//        Base case
        if(i==arr.length){
            return i;
        }
        if(arr[i] == key){
            System.out.print(i + " ");
        }
        return occurenceIndex(arr, key, i+1);
    }



    public static void main(String args[]) {

        int arr[] = {3,2,5,4,6,2,7,2,2};
        int key = 2;
        occurenceIndex(arr, key, 0);
//        int n = 10;
//        printDec(n);
//        printInc(n);

//        System.out.println(fact(5));
    }
}
