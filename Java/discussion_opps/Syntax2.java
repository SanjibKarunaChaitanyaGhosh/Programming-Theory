class Gargi{
    int age; // age=65
    
    int brainware(){
        return age;
        
    }
}
class Syntax2{

    
    public static void main(String args[]){
        int debayan;

        System.out.println("Debayn told me");

        Gargi buri = new Gargi(); // object create

        buri.age=65;

        debayan = buri.brainware();

        System.out.println(debayan);

    }
}