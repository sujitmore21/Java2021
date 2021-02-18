package basicjava;

public class javaString {
    public static void main(String[] args) {

        // Java String

  /*      char[] ch = {'r','o','h','a','n'};
        String s = new String(ch);
        System.out.println(s);*/

        // Java String provides a lot of methods to perform operations on strings such as
        // compare(), concat(), equals(), split(), replace(), compareTo(), intern(), substring() etc



   /*     String name = "rohan";

        System.out.println(name.substring(0,4));
        System.out.println(name.substring(2));*/



        //int length = name.length();

        //System.out.println(length);

       // System.out.println(name.charAt(length-1));

//        char ch = name.charAt(0);
//        System.out.println(ch);

/*
        String sen = "hello rohan kumar mumbai";
        boolean check = sen.contains("rohan");
        System.out.println(check);
        System.out.println(sen.contains("kumar"));*/

     /*   String name = "rohan";
        String name2 = "kumar";

        System.out.println(name.equals(name2));*/


      /*  String name = "rohan";

        String full_name = name.concat(" kumar");
        System.out.println(full_name);
        System.out.println(name);*/

       /* String name = "rohan";
        String srname = "kumar";
        String middle = "dev";

        String fullname = name.concat(" ").concat(srname).concat(" ").concat(middle);
        System.out.println(fullname);*/

     /*   String sen = "java is a very good lag ";
        System.out.println(sen); //replaces

        String replaces = sen.replace("good","better");
        System.out.println(replaces);*/

/*
        String name = "rohan";
        String name2 = "ROHAN";

        boolean check = name.equalsIgnoreCase(name2);
        System.out.println(check);*/


      /*  String sen = "msword is a very good website";

        String[] word = sen.split("\\s");

        for (String i:word){
            System.out.println(i);
        }*/

        // Java String Indexof method

        /*String sen = "msword is a very good website";

        System.out.println(sen.indexOf("good",8));//position of word
        //System.out.println(sen.indexOf("very"));//position of word
        */

        // LowerCase

       /* String name = "ROAHAN";

        String namelowercase = name.toLowerCase();
        System.out.println(namelowercase);*/

        // UpperCase
/*
        String name2 = "rohan";

        String name2uppercase = name2.toUpperCase();
        System.out.println(name2uppercase);*/

        // Java String valueOf()

     /*   int number = 10;

        String no = Integer.toString(number);
        System.out.println(no+10);*/

      /*  String no = String.valueOf(number);
        System.out.println(no);//10 string number

        System.out.println(no+10);*/

       /* boolean check = false;
        String check2 = String.valueOf(check);
        System.out.println(check2);*/

        // Java StringBuffer class

        String name = "rohan";

       /* name.concat("kumar");
        System.out.println(name);*/

      /*  StringBuffer name2 = new StringBuffer(" rohan");

       name2.reverse();
       System.out.println(name2);*/

        /* name2.delete(0,3);
        System.out.println(name2);*/

        /*name2.replace(0,3,"hello");
        System.out.println(name2);*/

       /* name2.insert(0,"rahul");
        System.out.println(name2);*/
//        name2.append(" dev");
//        System.out.println(name2);

        // Reverse code

       /* String surnam = "kumar";

        StringBuffer ex = new StringBuffer(surnam);
        ex.reverse();
        String revs = ex.toString();
        System.out.println(revs);*/

        // Java StringBuilder class
        // StringBuffer is less efficient than StringBuilder.
        // StringBuilder is more efficient than StringBuffer.

   /*     StringBuilder ns = new StringBuilder("rohan");
        System.out.println(ns);*/

        // how to calculate time both

        long starttime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("java");
        for (int i = 0;i<=100000;i++){
            sb.append("hello");
        }
        System.out.println("this taken to excute stringbuffer" +(System.currentTimeMillis()-starttime)+"ms");

        starttime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("java");
        for (int i = 0;i<=100000;i++){
            sb2.append("hello");
        }
        System.out.println("this taken to excute stringbuilder" +(System.currentTimeMillis()-starttime)+"ms");


    }
}
