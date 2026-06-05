import java.util.Scanner;

class Prime1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any Number :");

        int num=sc.nextInt();
        int i=3;
        if(num==2 || num==3){
            System.out.println("Prime");
        }else if (num>2){
            while((i<=num) && (num%i!=0)){  // i=3, num=5
                i++;
            }
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
        sc.close();
    }
}