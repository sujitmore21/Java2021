public class Operators {
    public static void main(String[] args) {

        //Unary Operators Example : ++ and --
/*
        int x=10;
        System.out.println(x++);//10(11)
        System.out.println(++x);//12
        System.out.println(x--);//12(11)
        System.out.println(--x);//10*/

        //Unary Operators Example : ~ and !

      /*  int a=10;
        int b=-10;
        boolean c=true;
        boolean d=false;
        System.out.println(~a);//-11 (Value start from 0)
        System.out.println(~b);//9
        System.out.println(!c);//false
        System.out.println(!d);//true*/

        // Java Left Shift Operators <<

     /*   System.out.println(10<<2);//10*2^2-10*4=40
        System.out.println(18<<3);//18*2^3-18*8=144

        // Java Right Shift Operators <<

        System.out.println(10>>2);//10/2^2-10/4=2
        System.out.println(18>>3);//18/2^3-18/8=2
*/
        // Java AND Operators Logical && and Bitwise &

       /* int a=10;
        int b=5;
        int c=28;

        System.out.println(a<b&&a++<c);
        System.out.println(a);

        System.out.println(a<b&a++<c);
        System.out.println(a);*/

        // Java OR Operators Logical || and Bitwise |

        int a=10;
        int b=5;
        int c=28;

        System.out.println(a>b||a++<c);// true || true = true
        System.out.println(a);

        System.out.println(a>b|a++<c);// true | true = true
        System.out.println(a);




    }
}
