// Mohamed Yasser Anwar Mahmoud AlKayd
// Inheritence & Polymorphism Small Economy Food Service Industry Program - The Restaurant -

// - Start of the Program -

import java.util.LinkedList;
import java.util.List;

public class Restaurant extends FoodPlace {

	private Staff cook;
	private Server server;

// - Restuarant Constructor -
	public Restaurant(String name, double fixedCosts, Owner owner, Staff cook, Server server) {
		super(name, fixedCosts, owner);
		this.cook=cook;
		this.server=server;
	}

// - Function to get the cook of the Restuarant -
	public Staff getCook() {
		return cook;
	}

// - Function to get the server of the Restuarant -
	public Server getServer() {
		return server;
	}

	@Override
	public String toString() {
		return "Name of restaurant: " + this.getName() +
				"\n" + "Owner: " + this.getOwner() +
				"\n" + "Cook: " + cook +
				"\n" + "Server: " + server;
	}

	@Override
	public void workShift(int hours) {
		double a = this.cook.getIncome()+(hours*this.cook.getSalaryPerHour());
		double b = this.server.getIncome()+(hours*this.server.getSalaryPerHour());
		this.cook.setIncome(a);
		this.server.setIncome(b);
		this.getOwner().setSalaryExpenses(this.getOwner().getSalaryExpenses()+(a+b));
	}

	@Override
	public List<IncomeTaxPayer> getIncomeTaxPayers() {
		LinkedList<IncomeTaxPayer> list=new LinkedList<IncomeTaxPayer>();
		list.add(this.getOwner());
		list.add(this.cook);
		list.add(this.server);
		return (list) ;
	}

	@Override
	public void distributeIncomeAndSalesTax(Check check) {
		getOwner().setIncome(getOwner().getIncome()+(check.getMenuPrice()));
		getCook().setIncome(getCook().getIncome()+(check.getTip()*0.2));
		getServer().setIncome(getServer().getIncome()+(check.getTip()*0.8));
		this.setTotalSalesTax(this.getTotalSalesTax()+check.getSalesTax());
	}

	@Override
	public double getTipPercentage() {
		return server.getTargetTipPct();
	}

}

// - End of the Program -