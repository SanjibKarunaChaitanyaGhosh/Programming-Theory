class M
{
	int x; // Non Static Data Member
	int display() // Non Static Method
	{
		return(x);
	}
	public static void main(String args[])
	{
		M obj = new M();
		obj.x=10;
		int y = obj.display();
		System.out.println(y);
	}
}
