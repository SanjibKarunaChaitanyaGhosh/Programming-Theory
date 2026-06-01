class A {
    int a;
    String Name;
    // A(){ // code } this is Constructor
    A(){
        a=100;
        Name="Arunangshu";
    }
    void display(){
        System.out.println("the value of a "+a+", the Name is "+Name);
    }
}
class A1{
    public static void main(String[] args) {
        A obj=new A();
        obj.display();
        
    }
}
