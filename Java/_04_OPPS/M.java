class X
{	int x;
	int display()
	{
	System.out.println(x);
	return(x);
	}
}
class M
{
	public static void main(String args[])
	{
	 X a=new X();
	a.x=10;
	int r;
	r=a.display();
	System.out.println(r);
	}
}
