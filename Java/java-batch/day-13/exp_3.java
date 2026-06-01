import java.util.Scanner;

class exp_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("--------------------MENU--------------------");

        System.out.println("1. ADD \n2. Substract \n3. Multiply \n4. Division");

        System.out.println("==============================");

        System.out.println("Enter your choice");
        int ch=sc.nextInt();

        System.out.println("Enter first Number");
        int a =sc.nextInt();

        System.out.println("Enter second Number");
        int b =sc.nextInt();

        System.out.println("==============================");

        sc.close();

        switch (ch) {
            case 1:
                System.out.println("ADDITION IS : "+(a+b));
                break;
            case 2:
                System.out.println("Substraction is : "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication is : "+(a*b));
                break;
            case 4:
                System.out.println("Division is : "+(a/b));
                break;
        
            default:
                break;
        }
    }
}
