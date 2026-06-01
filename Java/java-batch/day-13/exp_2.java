// Calculate Salary of the employee

import java.util.Scanner;

class exp_2{

    static double cal_Salary(double basic){
        double hra,da;
        hra=basic*0.20;
        da=basic*0.50;

        return basic+hra+da;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your basic Salary : ");

        double basic=sc.nextDouble();

        double total=cal_Salary(basic);

        System.out.println("Total Salary is : "+total);
        
        sc.close();
    }
}