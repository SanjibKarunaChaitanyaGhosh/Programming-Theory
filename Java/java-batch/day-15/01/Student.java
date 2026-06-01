// data member: name, roll
// a default or Non Parametrized constructor that assin values
// display the details using a method

class Student{
    String name; // data member
    int roll; // data member

    Student(){
        name="Arunanghsu";
        roll=1098;
    }
    void display(){
        System.out.println("my name is "+name+"and my roll is "+roll);
    }
    public static void main(String args[]){
        Student st=new Student(); // constructor caled here,at the time of object creation

        st.display();
    }
}