package new_hope;

public class Main {

    public static void main(String[] args) {

        Menu noCoffeeMenu = new BaseMenu();
        System.out.println("Menu: " + noCoffeeMenu.getReceipt() + ", priced at " + noCoffeeMenu.getCost() + " credits");
        // this will print * Menu: Fried-Porg Wings, priced at 5.0 credits *

        Menu coffeeMenu = new Coffee(new BaseMenu());
        System.out.println("Menu: " + coffeeMenu.getReceipt() + ", priced at " + coffeeMenu.getCost() + " credits");
        // This will print * Menu: Fried-Porg Wings, Coffee, priced at 5.5 credits *

        Menu newMenu = new Dessert(new BaseMenu());
        System.out.println("Menu: " + newMenu.getReceipt() + ", priced at " + newMenu.getCost() + " credits");
        // this will print * Menu: Fried-Porg Wings, Bantha's Drool, priced at 6.5 credits *

        Menu altMenu = new Soda(new Dessert(new Coffee(new BaseMenu())));
        System.out.println("Menu: " + altMenu.getReceipt() + ", priced at " + altMenu.getCost() + " credits");
        // this will print * Menu: Fried-Porg Wings, Coffee, Bantha's Drool, Blue milk Juice, priced at 8.0 credits *

        Menu classic = new Coke(new OldMenu());
        System.out.println("Menu: " + classic.getReceipt() + ", priced at " + classic.getCost() + " credits");
        // this will print * Menu: Ol' Ben's classic Porg, Spice Coke, priced at 7.0 credits *


        // PVM END
    }
    // CLASS END
}
