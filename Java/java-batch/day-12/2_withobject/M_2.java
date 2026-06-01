class M_2 
{
    int salary;
    int display(){
        // System.out.println(salary);
        return salary;
    }
    
    public static void main(String[] args) {
        M_2 ArunanghsuBabu = new M_2();
        ArunanghsuBabu.salary=45000;
        
        int r=ArunanghsuBabu.display();

        System.out.println(r);
    }
}