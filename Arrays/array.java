package Arrays;




public class array {
    public static void main(String[] args) {
//        syntax
//        datatype[] variable_name = new datatype[size];
//        store 5 roll numbers;
        int[] rnos = new int[5];
        rnos[0] = 1;
        rnos[1] = 2;
        rnos[2] = 3;
        rnos[3] = 4;
        rnos[4] = 5;
        System.out.println(rnos);


//        second method
//        int[] rnos2 = {23,43,56,10};
//        int [] ros3;// declaration of array.
        int [] marks;
        marks = new int[5];
        marks[0] = 51;
        marks[1] = 33;
        marks[2] = 44;
        marks[3] = 67;
        marks[4] = 98;
        for(int i=0 ; i< marks.length ; i++){
            System.out.println(marks[i]);

        }

        

    }
}
