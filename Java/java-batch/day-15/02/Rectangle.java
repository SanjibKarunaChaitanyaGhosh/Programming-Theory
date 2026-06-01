// length,breadth as a data member
// parametrized constructor
// method to caculate area

class Rectangle{
    int length, breadth; // data member

    // parametrized constructor
    Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    void area(){
        int AreaRectangle=length*breadth;
        System.out.println("Area of the rectangle is "+AreaRectangle);
    }
    public static void main(String[] args) {
        Rectangle rt=new Rectangle(19, 3);// parametrized constructor called
        rt.area();
    }
}