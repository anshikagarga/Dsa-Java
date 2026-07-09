package stack;
import java.util.*;

public class duplicateParentheses {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            //Opening
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }else {
                //Closing )))))
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek() == '(' &&  ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')){
                    s.pop();

                }else{
                    return false;
                }

            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isDuplicate(String str){
          Stack<Character> s = new Stack<>();
          for(int i=0; i<str.length(); i++){
              char ch = str.charAt(i);

              // closing
              if(ch == ')' ){
                  int count = 0;
                  while(!s.isEmpty() && s.peek() != '('){
                           s.pop();
                           count++;
                  }
                  if(count < 1){
                      return true; // duplicate exist
                  } else{
                      s.pop(); // opening pair
                  }
              }else{
                  //opening
                  s.push(ch);
              }
          }
          return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))"; //true
        String str2 = "(a+b)"; //false
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));

    }
}
