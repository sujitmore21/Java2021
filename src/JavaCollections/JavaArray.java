package JavaCollections;

import java.util.*;

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
/*
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(arr[i][j]);

            }
            System.out.println();
        }*/

        // Copying an Array in Java

      /*  char[] copyFrom = {'a','s','d','f','g','h','j','k','l'};

        char[] copyTo = new char[5];
        System.arraycopy(copyFrom,0,copyTo,0,5);

        for (char i:copyTo) {
            System.out.println(i);
        }
        //System.out.println(String.valueOf(copyTo));*/

        // Cloning an Array in Java

       /* int arr[]={22,3,4,5};

        int newarr[] = arr.clone();
        for (int i:newarr) {
            System.out.println(i);

        }*/

        // Java ArrayList

        // Java ArrayList class user a dynamic array for storing the elements. It is like
        // an array, but there is no size limit. We Can add or remove elements anytime. So,
        // it is much more flexible then the traditional array.

      /*  ArrayList<String> name = new ArrayList<String>();

        name.add("rohan");
        name.add("aatish");
        name.add("golu");
        name.add("rahul");
        name.add("don");

        ArrayList numbername = new ArrayList();
        numbername.addAll(name);
        numbername.add(20);
        numbername.add(50);
        numbername.add(260);
        numbername.add(207);
        numbername.add(20);

        System.out.println(numbername);*/



        /*  ArrayList<String> ns = new ArrayList<>();
        ns.add("rahu");
        ns.add("raman");

        name.addAll(ns);
        System.out.println(name);*/



        /*  Collections.sort(name);
        for (String i:name) {
            System.out.println(i);

        }*/

        /* name.set(0,"manu");
        System.out.println(name);*/

       /* name.remove(0);
        System.out.println(name);
        System.out.println(name.size());*/

      /*  String name2 = name.get(1);
        System.out.println(name2);*/

       /* for (String i: name) {
            System.out.println(i);
        }*/

      /*  Iterator itr = name.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }*/

       // System.out.println(name);


        // Java LinkedList

        // Java LinkedList class user a doubly linked list to store the elements.

   /*     LinkedList<String> al = new LinkedList<String>();
        al.add("rohan");
        al.add("rakesh");
        al.add("sharma");
        al.add("varma");
        al.add("karna");
        al.add("dharma");*/

     /*   String name = al.get(1);
        System.out.println(name);*/

        //System.out.println(al);

      /*  LinkedList news = new LinkedList();
        news.add("rihan");
        news.add(10);
        news.add(19.0);
        news.add(true);

        System.out.println(news);*/

        // Java List Interface

       /* List<String> name = new ArrayList<>();
        name.add("rohan");
        name.add("rohan");
        name.add("rohan");
        name.add("rohan");*/

      /*  System.out.println(name);
        name.add(4,"golu");*/

      /*  System.out.println(name.contains("rohan"));
        System.out.println(name.indexOf("rohan"));*/

      /*  List name = new ArrayList<>();
        name.add("rohan");
        name.add(12);
        name.add(12.33);
        name.add(12.3);
        name.add(true);

        System.out.println(name);*/

       /* String[] name = {"rohan","roshan","mohan"};

        List<String> name2 = new ArrayList<>();
        for (String i:name) {
            name2.add(i);
        }
        System.out.println(name2);*/

        // Java HashSet

      /*  HashSet<String> ns = new HashSet<String>();
        ns.add("rohan");
        ns.add("rajesh");
        ns.add("raju");
        ns.add("nilesh");


        HashSet<String> nss = new HashSet<String>();
        nss.add("Sam");
        nss.add("ram");
        nss.add("om");

        ns.addAll(nss);
       // ns.remove("rajesh");
        System.out.println(ns);

        //System.out.println(ns);*/

        // Java LinkedHashSet class
/*
        LinkedHashSet ns = new LinkedHashSet();
        ns.add("rohan");
        ns.add(23);
        ns.add(10.5f);
        ns.add(123456);
        ns.add(12.5344);
        ns.add(true);

        Iterator irt = ns.iterator();
      //  System.out.println(irt.next());

        while (irt.hasNext()){
            System.out.println(irt.next());
        }

        //System.out.println(ns);*/

        // Java TreeSet class

       /* TreeSet<String> ns = new TreeSet<>();

        ns.add("rohan");
        ns.add("nilesh");
        ns.add("soman");
        ns.add("salman");

        System.out.println(ns);
*/

       /* TreeSet<Integer> ns = new TreeSet<Integer>();
        ns.add(12);
        ns.add(125);
        ns.add(1442);
        ns.add(152);
        ns.add(1276);*/

      /*  TreeSet<String> ns = new TreeSet<String>();

        ns.add("rohan");
        ns.add("nilesh");
        ns.add("soman");
        ns.add("salman");

        Iterator itr = ns.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }*/

       /* int number = ns.pollFirst();
        System.out.println(number);*/


        // Java Queue Interface

       /* Queue<Integer> ns = new LinkedList<Integer>();
        ns.add(5);
        ns.add(54);
        ns.add(53);
        ns.add(523);
        ns.add(5123);
        ns.add(50);

        System.out.println(ns.size());
        System.out.println(ns);
        ns.remove();
        System.out.println(ns);*/


        // Java Map Interface

        // A map contains values on the basis of key, i.e. key and value pair.
        // Each key and value pair is known as entry. A Map contains unique keys.

      /*  Map<Integer,String> ns = new HashMap<>();
        ns.put(1,"rohan");
        ns.put(2,"roshan");
        ns.put(3,"rajesh");
        ns.put(4,"don");
        System.out.println(ns);

        for (Map.Entry nss: ns.entrySet()) {
            System.out.println("Your roll number and name"+nss.getKey()+" = "+nss.getValue());

        }*/

        // Java HashMap

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"rohan");
        map.put(2,"raja");
        map.put(3,"tushar");

      /*  System.out.println(map);
        for (Map.Entry nss:map.entrySet()) {
            System.out.println(nss.getKey()+" "+nss.getValue());


        }*/

        map.putIfAbsent(4,"raju");
        System.out.println(map);

    }
}
