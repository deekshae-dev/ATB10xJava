package Ex_16_Constructors_OOPS;

public class CarCC {
    String model;
    int year;

    CarCC(String m, int y){
       model = m;
       year = y;
    }

    CarCC(CarCC c){
        model = c.model;
        year = c.year;
    }

    void display(){
        System.out.println("model: " + model +", Year: "+year);
    }

    public static void main(String[] args) {
        CarCC c1 = new CarCC("Audi", 2020);
        CarCC c2 = new CarCC(c1);
        c1.display();
        c2.display();
    }
}
