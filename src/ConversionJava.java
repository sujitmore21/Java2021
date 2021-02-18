import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class ConversionJava {
    public static void main(String[] args) throws Exception{

        // Java Conversion
        // Java Convert String to int

   /*     Scanner ns = new Scanner(System.in);
        String number;
        System.out.println("Enter the number");
        number = ns.nextLine();
        System.out.println(number+10);*/

       /* Scanner ns = new Scanner(System.in);
        String numberstring;
        System.out.println("Enter the number");
        numberstring = ns.nextLine();

        int number = Integer.parseInt(numberstring);
        System.out.println(number+10);*/

       /* String numberstring = "10";

        int number = Integer.parseInt(numberstring);
        System.out.println(number+10);*/

        // Java Convert String to double
/*
        String number = "656656.5534";
        double num = Double.parseDouble(number);
        System.out.println(num+5);

        Double nums = Double.parseDouble(number);
        System.out.println(nums+5);*/

        // Java Convert String to Float

        /*String number = "123.45";
        float num = Float.parseFloat(number);
        System.out.println(num+10);

        Float nums = Float.parseFloat(number);
        System.out.println(nums+12);*/

        // Java Convert double to String

      /*  double number = 12345.434d;
       // String num = String.valueOf(number);
        String num = Double.toString(number);
        System.out.println(num+" rohan");*/

        // Java String to Date

     /*   String sDate1 = "20/09/1990";

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        System.out.println(date1);*/

        // Java Date to String

        Date date = Calendar.getInstance().getTime();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String strdate = dateFormat.format(date);
        System.out.println(strdate);


    }
}
