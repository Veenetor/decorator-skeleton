package ol_bens;

public abstract class AbstractMenu {

    /*
    to print an invoice, all menus will need to return a
    cost and item description(receipt)!
     */

    public abstract double getCost ();
    public abstract String getReceipt ();

}
