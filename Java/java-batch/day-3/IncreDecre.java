// Increment and Decrement
class IncreDecre
{
    public static void main(String args[]){
        int a , f;
        // int b , c, d ,e;
        a=1;

        // b= a-- + a--;
        // c= --a + --a;
        // d= --a + a--;
        // e= --a + a-- + --a;
        f= a-- + --a + a--;

        System.out.println("a="+a);
        // System.out.println("b="+b);
        // System.out.println("c="+c);
        // System.out.println("d="+d);
        // System.out.println("e="+e);
        System.out.println("f="+f);

    }
}