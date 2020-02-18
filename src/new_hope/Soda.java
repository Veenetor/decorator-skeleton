package new_hope;

public class Soda extends MenuDecorator {

    public Soda (Menu newMenu) {
        super(newMenu);
    }

    public String getReceipt () {
        return decoratedMenu.getReceipt() + ", Blue milk Juice";
    }

    public double getCost () {
        return decoratedMenu.getCost() + 1.00;
    }

}

