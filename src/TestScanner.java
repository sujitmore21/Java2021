import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {

        // Java User Input (Scanner)

        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Enter Your Name");
        name = input.nextLine();
        System.out.println(name);

        int number;
        System.out.println("Enter any number");
        number = input.nextInt();
        System.out.println("You enter this number"+number);
    }
}
