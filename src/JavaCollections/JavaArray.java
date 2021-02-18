package JavaCollections;

public class JavaArray {
    public static void main(String[] args) {

        // Java Collections

        // Java Array

        // Normally, an array is a collection of similar type of element which has contiguous memory location.
        // Java array is an object which contains of a similar data type.

     /*   int[] number = new int[5];
        number[0] = 2000;
        number[1] = 3000;
        number[2] = 4000;
//        number[3] = 26000;
//        number[4] = 200;

        for (int i=0;i<number.length;i++){
            System.out.println(number[i]);
        }

        int number2[] = {10,20,30,40};
        for (int i:number2){
            System.out.println(i);//number[i]*/

      /*  String[] name = {"rohan","rahul","aakash"};

        for (String i:name){
            System.out.println(i);

        }
        */

        // Multidimensional java Array

        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(arr[i][j]);

            }
            System.out.println();
        }

    }
}
