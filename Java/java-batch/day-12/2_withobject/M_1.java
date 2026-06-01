class M {
    int m,x=15; // non-static data
    void display(){ // non-static method
        System.out.println(x);
    }
    void sum(){
        System.out.println(x+m);
    }
}
class M_1 
{
    public static void main(String[] args) {
        M obj;  // Object declaration

        obj=new M(); // object initailization

        obj.m=18;
        obj.display();
        obj.sum();
    }
}
