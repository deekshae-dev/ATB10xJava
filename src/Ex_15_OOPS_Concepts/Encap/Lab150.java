package Ex_15_OOPS_Concepts.Encap;

public class Lab150 {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin", "123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "345";
        System.out.println(vwoLogin.password);

        GoodEcapVWOLogin vwoLogin1 = new GoodEcapVWOLogin("admin1", "123456");
        vwoLogin1.setUsername("sushma");
        System.out.println(vwoLogin1.getUsername());

        boolean isAdmin = true;
        vwoLogin1.setPassword("123", false);
        vwoLogin1.getPassword();
    }
}



class VWOLogin {
   public String username;
   public String password;

    public VWOLogin(String user, String  pwd) {
        this.username = user;
        this.password = pwd;
    }
}

class GoodEcapVWOLogin {
    private String username;
    private String password;
    //when we add private no one will be able to access the variable directly

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if(isAdmin) {
            this.password = password;
        }else{
            System.out.println("Not allowed to change the password");
        }
    }

    public GoodEcapVWOLogin(String user , String pwd) {
        this.username = user;
        this.password = pwd;

    }
}

