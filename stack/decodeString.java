package stack;
import java.util.*;

public class decodeString {
    public static  String encodedString(String s){
        Stack <String> stringStack = new Stack<>();
        Stack <Integer> countStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int num = 0;
        for (char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num = num*10 + (ch - '0'); //3
            }
            else if (ch == '['){
                countStack.push(num);
                stringStack.push(current.toString());
                num = 0 ;
                current =  new StringBuilder();
            }
            else if (ch == ']'){
                int repeat = countStack.pop();
                String prev = stringStack.pop();
                StringBuilder temp = new StringBuilder(prev);
                for(int i=0; i<repeat; i++){
                    temp.append(current);
                }
                current = temp;
            }
            else{
                current.append(ch);
            }
        }
        return current.toString();


    }


    public static void main(String[] args) {

        System.out.println(encodedString("3[b2[v]]"));
    }
}
