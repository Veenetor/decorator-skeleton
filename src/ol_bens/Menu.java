package ol_bens;

public class Menu extends AbstractMenu {

    /*
     Easy! I will just return the cost and menu item!
      */

    @Override
    public double getCost() {
        return 05.00;
    }

    @Override
    public String getReceipt() {
        return "Ol' Ben's Roasted Porg";
    }
}


