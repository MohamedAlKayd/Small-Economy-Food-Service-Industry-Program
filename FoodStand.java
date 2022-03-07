// Mohamed Yasser Anwar Mahmoud AlKayd
// Inheritence & Polymorphism Small Economy Food Service Industry Program - Food Stand -

// - Start of the Program -

import java.util.LinkedList;
import java.util.List;

public class FoodStand extends FoodPlace {

    public FoodStand(String name, double fixedCosts, WorkingOwner owner) {
        // Calls the superclass
        super(name,fixedCosts,owner);
    }

    @Override
    public String toString() {
        return "Name of FoodStand: " + this.getName() +
                "\n" + "Owner: " + this.getOwner();
    }

    @Override
    public void workShift(int hours) {
        // There are no salaried workers, so do nothing
    }

    @Override
    public List<IncomeTaxPayer> getIncomeTaxPayers() {
        LinkedList<IncomeTaxPayer> list2  = new LinkedList<IncomeTaxPayer>();
        list2.add(this.getOwner());
        return (list2);
    }

    @Override
    public void distributeIncomeAndSalesTax(Check check) {
        getOwner().setIncome(getOwner().getIncome()+(check.getMenuPrice())+(check.getTip()));
        this.setTotalSalesTax(this.getTotalSalesTax()+check.getSalesTax());
    }

    @Override
    public double getTipPercentage() {
        return ((WorkingOwner) this.getOwner()).getTargetTipPct();
    }
}

// - End of the Program -