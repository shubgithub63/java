abstract class Animal{//this info is not important hence abtract
    //public void walk(){

    //}
    abstract void walk();//every animal should walk not work of above walk function
    Animal(){
        System.out.println("you are creating a amimal");
    }
    
}
class Horse extends Animal{
    Horse(){
        System.out.println("horse crated");
    }
     public void walk(){
        System.out.println("walk on four legs");
     }
}

public class constructorChaining {
    public static void main(String args[]){
        Horse horse = new Horse();
    }
    
}


