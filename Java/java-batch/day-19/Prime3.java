import java.util.Scanner;

class Prime3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a Number : ");

        int n=sc.nextInt();

        boolean isPrime=true;

        int  m= (int) Math.sqrt(n);

        if(n<=1){                      
            isPrime=false;
        }else{
            for(int i=2;i<=m;i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }

        sc.close();
    }
}