
package string;
public class compare{
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if(s1 == s2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(s1 == s3){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }

        String fruits[] = {"apple", "banana", "mango"};
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i]) <0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}