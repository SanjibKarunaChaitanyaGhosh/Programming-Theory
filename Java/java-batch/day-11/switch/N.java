import java.util.Scanner;

public class N{
    public static void main(String[] args) {

        int num=10;

        switch (num) {
            case 10:
                if(num>5){
                    System.out.println("Number is greater than 10");
                }else{
                    System.out.println("number is 10");
                }
                    
                    
                break;

            case 20 :
                System.out.println("Number is "+num);
                break;
        
            default:
                System.out.println("you have enter other number :"+num);
        }
    }
}
