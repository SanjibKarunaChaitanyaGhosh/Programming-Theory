using System;
class Add{
    static void Main(){
        object o;
        int b,a=10;

        o=a; // int to object
        b=(int)o; // obj to int

        Console.WriteLine("Object o is "+o+" and Integer b is"+b);
    }
}