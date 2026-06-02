import java.util.Scanner;

class ReverseNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter a number: "); 

        int x = sc.nextInt(); // 123

        int rev = 0;     // 0, 

        while(x>0){
            
            int digit = x%10;  // 3, 2 , 1

            rev = rev*10 + digit; // 3 , 3*10+2 , 32*10+1

            x=x/10; // 12 , 1 , 0

    }     System.out.println("Reversed number: " + rev);  // 3, 32, 321

        sc.close();
    }
}