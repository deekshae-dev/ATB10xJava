package Ex_15_OOPS_Concepts.Superkeyword;

public class Lab152 {
    public static void main(String[] args) {
        TestCase1 t1 = new TestCase1("Chrome");
        // this value will be passed to the parent constructor
        t1.openBrowser();
        System.out.println("Test case T1 is running");
        t1.closeBrowser();
        System.out.println(t1.getBrowser());

        TestCase1 t2 = new TestCase1("Firefox");
        System.out.println(t2.getBrowser());
    }
}

class BaseClass {
    private String browser;

    public BaseClass(String browser) {
        this.browser = browser;
        // the value of chrome is passed here and is set to chrome
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAdmin) {
        if (isAdmin) {
            this.browser = browser;
        } else {
            System.out.println("You are not allowed to change the browser");
        }
    }
        void openBrowser() {
            System.out.println("Opening the browser");
        }

        void openBrowser(String browser) {
            System.out.println("Opening the browser" + browser);
        }

        void closeBrowser() {
            System.out.println("Closing the browser");
        }
    }

class TestCase1 extends BaseClass {

    //calling parent constructor
    public TestCase1(String browser) {
        super(browser); //calling
    }

    @Override
    public void setBrowser(String browser, boolean isAdmin) {
        System.out.println("override the parent set browser");
    }

}
