import java.util.Scanner;

public class M {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER ANY VALUE FROM 1 TO 7 : ");

        int day= sc.nextInt();
        
        sc.close();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        
            default:
                System.out.println("you have entered "+day+" so please Enter values from 1 to 7 only");
                break;
        }
    }
}
