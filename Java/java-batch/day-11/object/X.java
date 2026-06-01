class N {
    int x; // data member 
    int display(){
        System.out.println("Hello World");
        return (x);
    }
    void GetOutM(){
        System.out.println("get out from here");
        // return "Done"; // void method don't have any return type
    }
}
class X {
    public static void main(String[] args) {
        N obj =new N();
        obj.display();
        obj.GetOutM();
    }
}
