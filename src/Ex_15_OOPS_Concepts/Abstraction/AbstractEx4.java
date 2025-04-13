package Ex_15_OOPS_Concepts.Abstraction;

public class AbstractEx4 {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.drive();
        //we have successfully hidden how we have implemented
        //engine,breaks also
        //our concern is only how we are driving
    }
}

//creating interface
//we are hiding all the details
//we are only showing the functionality
class Car implements Engine1, Breaks {

    void drive() {
        startEngine();
        applyBreaks();
        stopEngine();
    }
    @Override
    public void applyBreaks() {
        System.out.println("Applying breaks");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping engine");
    }
}
interface Engine1 {
    void startEngine();
    void stopEngine();
}

interface Breaks{
    void applyBreaks();
}
