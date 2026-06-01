import java.util.Scanner;

class exp_6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter any number : ");
        int n=sc.nextInt();

        System.out.println("you have given input that is "+n);

        for(int i=1;i<=n;i++)
            System.out.println(i);
    }
}
