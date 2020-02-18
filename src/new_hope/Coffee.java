package new_hope;

public class Coffee extends MenuDecorator {

    public Coffee(Menu newMenu) {
        super(newMenu);
    }

    public String getReceipt () {
        return super.getReceipt() + ", Coffee";
    }

    public double getCost () {
        return super.getCost() + 0.50;
    }

}
