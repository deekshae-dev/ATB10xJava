package Ex_16_Constructors_OOPS;

public class Car2 {
    String model;
    int year;

    Car2(){
        model = "XXX";
        year = 2020;
        System.out.println("Default constructor");
    }

    Car2(String model_name, int year_created){
        this.model = model_name;
        this.year = year_created;
    }
}
