class Syntax4{
    static int x;
    static int display(){
        return(x+5);
    }
    public static void main(String arg[]){
       x=10;
       System.out.println(x);
       System.out.println(display());
    }
}