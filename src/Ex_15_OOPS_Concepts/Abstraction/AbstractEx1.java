package Ex_15_OOPS_Concepts.Abstraction;

public class AbstractEx1 {
//we are displaying only these details
    public static void main(String[] args) {
        WagonR w1 = new WagonR();
        w1.drive();
    }
}

//we are hiding all the implementation details
class WagonR extends Engine {
  @Override
  void startEngine() {
      System.out.println("Starts");
  }

  @Override
  void stopEngine() {
      System.out.println("Stops");
  }

  void drive() {
      startEngine();
      System.out.println("I am driving");
      stopEngine();
  }
}

abstract class Engine {
    abstract void startEngine();
    abstract void stopEngine();
}
