package new_hope;

public abstract class MenuDecorator implements Menu {

    Menu decoratedMenu;

    public MenuDecorator (Menu newMenu) {
        decoratedMenu = newMenu;
    }


    public String getReceipt () {
        return decoratedMenu.getReceipt();
    }

    public double getCost () {
        return decoratedMenu.getCost();
    }

}
