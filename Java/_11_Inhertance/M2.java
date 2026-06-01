// Type 2, Multilevel Inheritance

class A 
{
    void fa() //Method of A
    {
        System.out.println("Grand Parent");
    }
}
class B extends A
{
    void fb() // Method of class B
    {
        System.out.println("Parent");
    }
}
class C extends B
{
    void fc() //Method of C
    {
        System.out.println("Child");
    }
}
class M2
{
    public static void main(String args[])
    {
        C obj=new C();
        obj.fb();
        obj.fc();
        obj.fa();
    }
}