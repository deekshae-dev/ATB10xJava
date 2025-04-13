package Ex_15_OOPS_Concepts.Encap;

public class RealExample {

    public static void main(String[] args) {

        ICICIBank Naina = new ICICIBank("Naina", 1000);
        System.out.println(Naina.getBal());

        boolean isCashier = false;
        Naina.setBal(3000,isCashier);
        System.out.println(Naina.getBal());


    }
}

    class ICICIBank {
    private String name;
    private long bal;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getBal() {
            return bal;
        }

        public void setBal(long bal, boolean isCashier) {
            if(isCashier) {
                this.bal = bal;
            }
            else {
                System.out.println("You are not allowed to set the balance");
            }
        }

        public ICICIBank(String name, long bal) {
            this.name = name;
            this.bal = bal;
        }
    }