package Ex_15_OOPS_Concepts.Accessmod.police;

public class cop {
    public int gun;
    String iCard;

    public cop(int gun) {
        this.gun = gun;
    }

    protected void canIShoot() {
        System.out.println("Yes you can shoot");
    }
}
