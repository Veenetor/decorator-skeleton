package new_hope;

public class Coke extends MenuDecorator {

    public Coke(Menu newMenu) {
        super(newMenu);
    }

    public String getReceipt () {
        return decoratedMenu.getReceipt() + ", Spice Coke";
    }

    public double getCost () {
        return decoratedMenu.getCost() + 1.0;
    }

}
