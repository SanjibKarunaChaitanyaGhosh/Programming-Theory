class X
{
	static int x;// Data member
	static int display(){
		return(x);
	}
}
class M
{
	public static void main(String args[])
	{
		int r;
		X.x=10; // Accessing without creating OBJECT
		r=X.display();
		System.out.println(r);
	}
}
