class A{
    int a; double b; String c;
    private A(){
        a=10;
        b=30.6;
        c="Jublee";

        System.out.println("the value of a "+a+" the value of b "+b+" the value of c "+c);
    }
    public static void main(String args[]){
        A r=new A();
    }
}

