// Mohamed Yasser Anwar Mahmoud AlKayd
// Inheritence & Polymorphism Small Economy Food Service Industry Program - The Owner -

// - Start of the Program -

public class Owner extends IncomeTaxPayer {

	final private int incomeTaxPct = 10;
	private double salaryExpenses;

	private FoodPlace foodPlace;

// - Onwer Constructor -
	public Owner(String name) {
		super(name);
	}

// - Function to get the Income Tax Percentage of the Owner -
	public int getIncomeTaxPct() {
		return incomeTaxPct;
	}

// - Function to get the salary expenses of the Owner -

	public double getSalaryExpenses() {
		return salaryExpenses;
	}

// - Function to set the salary expenses of the Owner -

	public void setSalaryExpenses(double salaryExpenses) {
		this.salaryExpenses = salaryExpenses;
	}

// - Function to set the food place of the Owner -

	public void setFoodPlace(FoodPlace foodPlace) {
		this.foodPlace = foodPlace;
	}

// - Function to get the food place of the Owner -
	public FoodPlace getFoodPlace(){
		return foodPlace;
	}

	@Override
	public double calculateIncomeTax() {

		double x = (double) ((getIncome()-((foodPlace.getFixedCosts())+(this.salaryExpenses)))*(incomeTaxPct*0.01));
		return x < 0 ? 0 : x;
	}
}

// - End of the Program -