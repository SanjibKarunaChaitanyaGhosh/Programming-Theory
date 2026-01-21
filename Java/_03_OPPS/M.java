class X
{
	int x;
	int  display(){
		System.out.println(x);
		return(x);
	}
}
class M{
	public static void main(String args[]){
		X a= new X(); // object Creation, new create memory space
		a.x=10;
		a.display();
	}
}

