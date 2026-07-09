package stack;
import java.util.*;
// next Greater Right
//next greater left
//next smaller right
// next smaller left

public class greaterElement {
    public static void main(String[] args) {//o(n
        int arr[] = {5,8,0,1,3};
        Stack <Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];
        for(int i=arr.length-1; i>=0 ; i--){
            //1 while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            //2 if-else
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[s.peek()];
            }

            //3 push
            s.push(i);
        }
        for(int i=0; i<nextGreater.length; i++){
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();

    }
}
