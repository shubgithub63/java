class Pen{//class name start with capital
    String color;//properties DATA
    String type;//properties
    public void write(){//funtions members Method
        System.out.println("writing");
    }
    public void printColor(){//method
        System.out.println(this.color);//this indicate which function is calling this funtion
    }


}
public class oops {
    public static void main(String args[]){
        Pen pen1=new Pen();//object pen1
        pen1.color="blue";
        pen1.type="dot";
        pen1.write();//function called here,pen() is constructor here
        // if not defined by default jata create constructor by by own
        pen1.printColor();
    }

    
}
