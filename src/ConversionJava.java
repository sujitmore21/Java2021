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
/*
        Date date = Calendar.getInstance().getTime();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String strdate = dateFormat.format(date);
        System.out.println(strdate);*/

        // Java Convert String to char

    /*    String name = "rohan";

     *//*   char c = name.charAt(0);
        System.out.println(c);*//*

        char[] ch = name.toCharArray();
        for (int i =0; i<name.length();i++){
            System.out.println(i+"-"+ch[i]);
        }
        System.out.println(ch);*/

        // Java Convert char to String

 /*       char c= 'r';

        //String ns = String.valueOf(c);
        String na = Character.toString(c);
        System.out.println(na+"ahan");*/

        // Java Convert int to long

      /*  int number = 10;
        long num = number;
        System.out.println(num);

        Long ns = new Long(number);
        System.out.println(ns);

        Long ls = Long.valueOf(number);
        System.out.println(ls);*/


        // Java Convert long to int

        /*long number = 123490;
        int i = (int) number;
        System.out.println(i);*/

      /*  Long number = 123432l;
        int i = number.intValue();
        System.out.println(i);*/

        // Java Convert char to int

        /*char c = 'i';

        //int a = Integer.parseInt(String.valueOf(c));

        int i = Character.getNumericValue(c);
    //    int i = r;

        System.out.println(i);*/

        // Java Convert Binary to Decimal

       /* String binarynumber = "1001";

        int decimal = Integer.parseInt(binarynumber,2);
        System.out.println(decimal);*/

        // Java Convert Decimal to Binary

        /*int number = 10;
        System.out.println(Integer.toBinaryString(number));
*/
        // Java Convert binary to hexnumber

        String binarynumber = "1010";
        int decimal = Integer.parseInt(binarynumber,2);

        //System.out.println(Integer.toHexString(decimal));
        System.out.println(Integer.toOctalString(decimal));

    }
}
