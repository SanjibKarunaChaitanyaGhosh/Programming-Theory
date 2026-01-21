class X{
	int x;
	void display(){
		System.out.println(x);
	}
}
class M
{
	public static void main(String args[]){
		X a=new X();
		a.x=10;
		a.display();
	}
}
