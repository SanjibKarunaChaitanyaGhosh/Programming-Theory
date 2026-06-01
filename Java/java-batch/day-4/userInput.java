import java.util.Scanner;

class userinput
{
    public static void main(String args[]){
        Scanner object =new Scanner(System.in);

        System.out.println("Enter your name here");
        // String input = object.nextLine(); 
                // nextLine() - Full Sentence

        // String input = object.next();
                // next() - Single Word

        // int input = object.nextInt();
                // integer

        //nextDouble() -Decimal Number

        //nextFloat() - Float number

        //nextBoolean() -  True/ False

        char ch=object.nextLine().charAt(7);

        System.out.println("My name is "+ ch);


        }
}