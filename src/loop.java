public class loop {

    public static void main(String[] args) {

        // Loops in java

        // for loop

     /*   for (int i = 1; i<=10;i++){
           System.out.println(i);
            //System.out.println("rohan");

        }*/

        // Java Nested for loop
        //*
        //* *
        //* * *
        //* * * *
        //* * * * *

   /*     for (int i = 1; i<=5; i++){
            for (int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/



        // Java for-each loop

   /*     int number[] = {1,2,3,44,5,6,77,8,9};

        for (int i:number){
            System.out.println(i);
        }*/

        // Java Infinitive for loop
      /*  for (;;){
            System.out.println("rohan");
        }*/


        // JAVA While Loop

    /*    int i=1;
        while (i<=10){
            System.out.println(i);
            i++;
        }*/

        // Java Infinitive while loop

       /* while (true){
            System.out.println("hello");
        }*/

        // Java do- while loop

       /* int i =1;

        do {
            System.out.println("rohan");
            i++;
        }while (i<=10);
*/

        // Java Infinitive do- while loop

/*        do {
            System.out.println("hello");
        }while (true);*/


        // break

       /* int i=1;
        while (i<=10){
            if (i==5){
                break;
            }
            System.out.println(i);
            i++;
        }*/

      /*  int i=1;
        do {
            if (i==5){
                break;
            }
            System.out.println(i);
            i++;
        }while (i<=10);*/

        // Java Continue Statement

      /*  for(int i=1;i<=10;i++){
            if (i==5){
                continue; // it will skip the statement
            }
            System.out.println(i);
        }*/

      /*  int i = 1;
        while (i<=10){
            if (i==5){
                i++;
                continue; // it will skip the statement
            }
            System.out.println(i);
            i++;
        }*/


        int i=1;
        //do while loop
        do {
            if (i==5){
                //using continue statement
                i++;
                continue;// it will skip the statement
            }
            System.out.println(i);
            i++;
        }while (i<=10);

    }
}
