class X{
    static int x;
    static int display(){
        return x;
    }
}

// if member of any class is "static" then without creation of object we can access them
class WXYZ{
    public static void main(String args[]){
        int r;
        X.x=10;
        r=X.display();
        System.out.println(r);
    }
}