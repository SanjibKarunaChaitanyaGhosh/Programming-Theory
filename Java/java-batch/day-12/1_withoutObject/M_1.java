class M_1 
{
    static int x; 
    static int display(){
        return x;
    }
    // Static methods can be called without creating objects.This means that you can call a static method using the class name directly, without needing to create an object of the class. static methods are often used for utility functions, helper methods, or operations that don't require any instance-specific data.
    
    // satic method only directly accessed static members
    public static void main(String[] args) {
        x=10;
        int r;
        r=display();

        System.out.println(r);

    }
}