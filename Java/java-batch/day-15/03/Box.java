// Constructor OVerloading

class Box{
    int length,breadth,height;

    //non parametrized constructor
    Box(){
        length=1;
        breadth=1;
        height=1;
    }
    Box(int l,int b, int h){
        length=l;
        breadth=b;
        height=h;        
    }
    Box(int m,int n){
        length=m;
        breadth=n;
    }
    void Volume(){
        int volumeRect=length*breadth*height;
        System.out.println("Volume : "+volumeRect);
        
    }
    void area(){
        int areaRect=length*breadth;
        System.out.println("Area : "+areaRect);
    }

    public static void main(String[] args) {
        Box bv=new Box();
        bv.Volume();

        Box bv3=new Box(2,3,2);
        bv3.Volume();

        Box a=new Box(2,3);
        a.area();
    }
}