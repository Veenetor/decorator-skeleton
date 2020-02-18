package ol_bens;

import ol_bens.Menu;
import ol_bens.MenuCoffee;
import ol_bens.MenuSodaCoffee;

public class Main {

    public static void main(String[] args) {

    // OL' BEN'S HUT

        MenuCoffee menuCoffee = new MenuCoffee();
        MenuSodaCoffee menuSodaCoffee = new MenuSodaCoffee();

        System.out.println("Menu: " + menuCoffee.getReceipt() + ", priced at " + menuCoffee.getCost() + " credits");
        System.out.println("Menu: " + menuSodaCoffee.getReceipt() + ", priced at " + menuSodaCoffee.getCost() + " credits");


        // PSV END
    }
    // CLASS END
}
