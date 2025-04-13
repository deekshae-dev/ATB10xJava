package ex_18_Static_Keyword;

public class StaticEx4 {
}

class ATB1{
    {
        System.out.println("IIB-this is called when object is created");
        //
    }

    static {
        System.out.println("Load the class? , I will execute");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    static String courseName = "ATB10x";

    void readDocuments() {
        System.out.println("This is a non-static method");
        System.out.println(courseName);
    }

    static void doAssignment() {
        System.out.println("Do assignment");
        //System.out.println(phone);
        //static methods can only access static variables they
        //can't access non-static variables
    }
}