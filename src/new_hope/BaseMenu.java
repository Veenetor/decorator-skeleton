package new_hope;

public class BaseMenu implements Menu {

    @Override
    public String getReceipt() {
        return "Fried-Porg Wings";
    }

    @Override
    public double getCost() {
        return 05.00;
    }
}
