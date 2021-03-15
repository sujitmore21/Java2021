package OOPsConcepts;

public class Student {

    int rollnumber;
    String name;

    void insertRecord(int r,String n){
        rollnumber = r;
        name = n;
    }
    void displayInformation(){
        System.out.println(rollnumber+" "+name);
    }
}
