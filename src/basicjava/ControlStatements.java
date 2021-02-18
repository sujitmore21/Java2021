package basicjava;

public class ControlStatements {

    public static void main(String[] args) {

        //if Statement

       /* int age = 23;
        if (age>=18)
            System.out.println("You can apply for driving licence");
        else
            System.out.println("You can not apply for driving licence");
*/

       /* int marks = 65;

        if (marks<50){
            System.out.println("fail");
        }
        else if (marks>=50 && marks<60){
            System.out.println("D grade");
        }
        else if (marks>=60 && marks<70){
            System.out.println("C grade");
        }
        else if (marks>=70 && marks<80){
            System.out.println("B grade");
        }
        else if (marks>=80 && marks<90){
            System.out.println("A grade");
        }
        else if (marks>=90 && marks<100){
            System.out.println("A+ grade");
        }
        else {
            System.out.println("Invalid!");
        }*/


    /*    int number = -13;
        if (number>0){
            System.out.println("Positive");
        }
        else if (number<0){
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }*/

        // Nested if Statement

       /* int age = 25;
        int weight = 51;
        // applying condition on age and weight
        if (age>=18){
            if (weight>50){
                System.out.println("You are eligible to donate blood");
            }else {
                System.out.println("You are not eligible to donate blood");
            }
        }else {
            System.out.println("Age must be greater than 18");
        }*/

        // Java Switch Statement

 /*       int number = 20;

        switch (number){
            case 10:
                System.out.println("this number is available 10");
                break;
            case 30:
                System.out.println("this number is available 30");
                break;
            case 20:
                System.out.println("this number is available 20");
                break;
            default:
                System.out.println("this given number is invalid");

        }*/

        // Java Switch Statement with String

     /*   String levelstring = "Expert";
                int level = 0;
        switch (levelstring){
            case "Beginner":
                level = 1;
                break;
            case "Intermediate":
                level = 2;
                break;
            case "Expert":
                level=3;
                break;
            default:
                level=0;
                break;
        }
        System.out.println(level);*/

        // Java Nested Switch Statement
/*
        char branch = 'c';
        int collegeYear = 4;
        switch (collegeYear){
            case 1:
                System.out.println("English, Maths, Science");
                break;
            case 2:
                switch (branch)
                {
                    case 'c':
                        System.out.println("Operating System, Java, Data Structure");
                        break;
                    case 'E':
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                }
            case 3:
                switch (branch)
                {
                    case 'c':
                        System.out.println("Operating System, Java, Data Structure");
                        break;
                    case 'E':
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                }
            case 4:
                switch (branch)
                {
                    case 'c':
                        System.out.println("Operating System, Java, Data Structure");
                        break;
                    case 'E':
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                }
        }*/

    }
}
