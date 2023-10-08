abstract class Animal{//this info is not important hence abtract
    //public void walk(){

    //}
    abstract void walk();//every animal should walk not work of above walk function
    public void eat(){
        System.out.println("animal eats");
    }
}
class Horse extends Animal{
     public void walk(){
        System.out.println("walk on four legs");
     }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walk on two legs");
     }
}
public class abstractionOOPS {
    public static void main(String args[]){
        Horse horse=new Horse();
        horse.walk();
        //Animal animal =new Animal(); THIS CANT BE CRAETE HERE BEACUSE ANIMAL IS ABSTRAT HERE
        //THIS IS RUN TIME ERROR
        horse.eat();
    }
    
}
