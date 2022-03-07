// Mohamed Yasser Anwar Mahmoud AlKayd
// Inheritence & Polymorphism Small Economy Food Service Industry Program - Check -

// - Start of the Program

public class Check {
	private double menuPrice;
	private double salesTax;
	private double tip;

// - Check Constructor -
	public Check(double menuPrice) {
		this.menuPrice = menuPrice;
		salesTax = (0.15 * menuPrice);
	}

	public static void main(String[] args){

		Check check = new Check(100);
		System.out.println(check.getSalesTax());
	}

// - Function to get the menu price -
	public double getMenuPrice() {
		return this.menuPrice;
	}

// - Function to get the sales tax -
	public double getSalesTax() {
		return this.salesTax;
	}

// - Function to get the tip -
	public double getTip() {
		return this.tip;
	}

// - Function to get the tip percentage -

	public void setTipByPct(double tipPct ) {
		this.tip=(tipPct)*(0.01*menuPrice);
	}
}

// - End of the Program -