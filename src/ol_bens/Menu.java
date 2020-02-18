package ol_bens;

public class Menu extends AbstractMenu {

    /*
     this forces me to override the methods
    with the information I need for the menu!
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


