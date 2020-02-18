package new_hope;

public class Dessert extends MenuDecorator {


    public Dessert(Menu newMenu) {
        super(newMenu);
    }

    public String getReceipt () {
        return decoratedMenu.getReceipt() + ", Bantha's Drool";
    }

    public double getCost () {
        return decoratedMenu.getCost() + 1.50;
    }

}

