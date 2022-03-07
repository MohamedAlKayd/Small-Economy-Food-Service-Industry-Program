// Mohamed Yasser Anwar Mahmoud AlKayd
// Inheritence & Polymorphism Small Economy Food Service Industry Program - Customer -

// - Start of the Program -

public class Customer  {
	private String name;
	private int  targetTipPct;
	public Customer(String name, int targetTipPct) {
		this.name = name;
		this.targetTipPct = targetTipPct;
	}

// - Function to get the name -
	public String getName() {
		return name;
	}

// - Function to get the target tip percentage -
	public int getTargetTipPct() {
		return targetTipPct;
	}

// - Function to get the foodplace dined in
	public String getDescriptiveMessage(FoodPlace foodPlace) {
		return this.name + " dined in " + foodPlace.getName();
	}
 
	public void dineAndPayCheck(FoodPlace foodPlace, double menuPrice ) {
		Check newCheck = new Check(menuPrice);
		double x = ((this.targetTipPct+(foodPlace.getTipPercentage()))/200.0);
		newCheck.setTipByPct(x);
		foodPlace.distributeIncomeAndSalesTax(newCheck);
	}
}

// - End of the Program -