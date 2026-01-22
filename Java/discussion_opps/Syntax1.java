class oppsOne
{
	int x;          // variable declaration, Data member
	void display(){
		System.out.println(x+5);
	}
	void Gargi(){
		System.out.println("My age is"+x);
	}
}
class Syntax1
{
	public static void main(String args[]){
		// creating Object
		oppsOne a=new oppsOne(); // a is known as Object Reference, oppsOne() - Call of Constructor
		// new - allocate memory

		a.x=10;
		a.display();
		a.Gargi();
	}
}
