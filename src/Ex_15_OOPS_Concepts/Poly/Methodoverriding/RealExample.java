package Ex_15_OOPS_Concepts.Poly.Methodoverriding;

public class RealExample {
    public static void main(String[] args) {
        TC t1 = new TC();
        t1.openBrowser();

        TC2 t2 = new TC2();
        t2.openBrowser();

    }
}

class CommonToAllTC {
    void openBrowser() {
        System.out.println("Open the browser in 5 sec.");
    }
}

class TC extends CommonToAllTC {
    void startTC() {
        openBrowser(); // we are using openBrowser() from CommonToAllTC class
    }
}
class TC2 extends CommonToAllTC {
    @Override
    void openBrowser() {
            //we are overriding the parent and change the time to 2 sec
        System.out.println("Open the browser in 2 sec.");
        }
    }