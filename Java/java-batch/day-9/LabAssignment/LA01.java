import java.util.Scanner;

class LA01
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int roll;
        String course;
        float marks;

        // Input
        System.out.println("Enter your name :");
        name =sc.nextLine();

        System.out.println("Enter your Roll No :");
        roll =sc.nextInt();

        // clear buffer
        sc.nextLine();


        System.out.println("Enter your course :");
        course =sc.nextLine();

        System.out.println("Enter your marks :");
        marks =sc.nextInt();


        // output 

        System.out.println("=======================================");
        System.out.println("Enter your name :"+name);
        System.out.println("Enter your roll :"+roll);
        System.out.println("Enter your course :"+course);
        System.out.println("Enter your marks :"+marks);

        sc.close();

    }
}