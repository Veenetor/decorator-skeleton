package new_hope;

public class Main {

    public static void main(String[] args) {


        Menu newMenu = new Dessert(new BaseMenu());
        System.out.println("Menu: " + newMenu.getReceipt() + ", priced at " + newMenu.getCost() + " credits");

        Menu altMenu = new Soda(new Dessert(new Coffee(new BaseMenu())));
        System.out.println("Menu: " + altMenu.getReceipt() + ", priced at " + altMenu.getCost() + " credits");


        Menu classic = new Coke(new OldMenu());
        System.out.println("Menu: " + classic.getReceipt() + ", priced at " + classic.getCost() + " credits");

        // PVM END
    }
    // CLASS END
}
