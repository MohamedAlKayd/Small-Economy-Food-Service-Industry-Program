// Mohamed Yasser Anwar Mahmoud AlKayd
// Inheritence & Polymorphism Small Economy Food Service Industry Program - Fast food -

// - Start of the Program -

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FastFood extends FoodPlace {
    private List<Staff> staff = new ArrayList<>();

    public FastFood(String name, double fixedCosts, Owner owner, List<Staff> staff1) {
        super(name,fixedCosts,owner);
      
        for (int i = 0; i<staff1.size(); i++){
            staff.add(staff1.get(i));
        }
    }

// - Function to get the staff -

    public List<Staff> getStaff() {
        return staff;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name of FastFood: " + this.getName() +
                "\n" + "Owner: " + this.getOwner());
        int index = 1;
        for (Staff staff: staff) {
            builder.append("\n" + "Staff " + index++ + " : " + staff );
        }
        return builder.toString();
    }

    @Override
    public void workShift(int hours) {
        for (int i=0; i<staff.size(); i++) {
            int f =((hours) * (this.staff.get(i).getSalaryPerHour()));
            this.staff.get(i).setIncome(this.staff.get(i).getIncome()+(f));
            this.getOwner().setSalaryExpenses(this.getOwner().getSalaryExpenses()+(f));
        }
    }

    @Override
    public LinkedList<IncomeTaxPayer> getIncomeTaxPayers() {
        LinkedList<IncomeTaxPayer> list3  = new LinkedList<IncomeTaxPayer>();
        list3.add(this.getOwner());
        list3.addAll(this.staff);
        return (list3);
    }

    @Override
    public void distributeIncomeAndSalesTax(Check check) {
       for (Staff staff : this.staff){
            staff.setIncome(staff.getIncome()+(check.getTip())/this.staff.size());
       }

       getOwner().setIncome(getOwner().getIncome()+(check.getMenuPrice()));
       this.setTotalSalesTax(this.getTotalSalesTax()+check.getSalesTax());
    }
    @Override
    public double getTipPercentage() {
        return 0;
    }
}

// - End of the Program -