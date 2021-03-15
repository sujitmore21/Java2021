package OOPsConcepts;

import java.util.Scanner;

public class oops {
//
//    int id = 10;
//    String name = "Rohan";
    public static void main(String[] args) {

        Account acc1 = new Account();
        acc1.insert(2134567,"rohan",2000);
        acc1.accountinformation();
        acc1.deposit(3000);
        acc1.withdraw(300);
        acc1.checkBalance();






      /*  rectangle object1 = new rectangle();
        object1.insert(10,40);
        object1.calculateArea();

        rectangle object2 = new rectangle();
        object2.insert(100,4032);
        object2.calculateArea();*/




/*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your roll number and Name");
        int rollnumber = input.nextInt();
        System.out.println("Enter your name");
        String name = input.next();

        Student object1 = new Student();
        object1.insertRecord(object1.rollnumber, object1.name);
        Student object2 = new Student();
        object2.insertRecord(2,"rohan");

        object1.displayInformation();
        object2.displayInformation();*/




        // Java OOPs Concepts
     /*   oops object1 = new oops();
        System.out.println(object1.id);
        System.out.println(object1.name);

        oops object2 = new oops();
        object2.id=12;
        object2.name= "sam";
        System.out.println(object2.id);
        System.out.println(object2.name);*/

    }
}
