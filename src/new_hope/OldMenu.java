package new_hope;

public class OldMenu implements Menu {
    @Override
    public String getReceipt() {
        return "Ol' Ben's classic Porg";
    }

    @Override
    public double getCost() {
        return 6.00;
    }
}
