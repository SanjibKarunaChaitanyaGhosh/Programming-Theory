class M
{
	static int x;
	static int display(){
		return(x);
	}
	public static void main(String args[])
	{
		x=10;
		int r=display();
		System.out.println(r);
	}
}
