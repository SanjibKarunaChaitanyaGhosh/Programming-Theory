import java.util.Scanner;

class InputTest
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your age : ");

        int age=sc.nextInt();

        System.out.print("\nYour age is "+age+"\n");

    }
}