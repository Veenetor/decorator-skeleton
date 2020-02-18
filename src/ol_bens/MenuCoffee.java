package ol_bens;

public class MenuCoffee extends AbstractMenu {


    @Override
    public double getCost() {
        return 5.50;
    }

    @Override
    public String getReceipt() {
        return "Ol' Ben's Roasted Porg, Coffee";
    }
}
