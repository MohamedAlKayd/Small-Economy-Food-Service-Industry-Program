// Mohamed Yasser Anwar Mahmoud AlKayd
// Inheritence & Polymorphism Small Economy Food Service Industry Program - The Income Tax Payer -

// - Start of the Program -

public abstract class IncomeTaxPayer {
	private static int currentMaxTaxID;
	private int  taxID;
	private String  name;
	private double  income;

// - Income Tax Payer Constructor -

	public IncomeTaxPayer(String name){
		this.name = name;
		this.taxID=++currentMaxTaxID;
	}

// - Function to get the current max Tax ID -

	public static int getCurrentMaxTaxID() {
		return currentMaxTaxID;
	}

// - Function to get the Tax ID of the Income Tax Payer -

	public int getTaxID() {
		return taxID;
	}

// - Function to get the name of the Income Tax Payer - 

	public String getName() {
		return name;
	}

// - Function to get the income of the Income Tax Payer -

	public double getIncome() {
		return this.income;
	}

// - Function to set the income of the Income Tax Payer -

	public void setIncome( double income) {
		this.income = income;
	}

	public String toString() {
		return "  " + taxID + " " + name + " income " + income ;
	}

public boolean equals(Object obj) {
	if ((obj instanceof IncomeTaxPayer) && (this.taxID == ((IncomeTaxPayer) obj).taxID)) {
		return true;
	} else {
		return false;
	}}

	public abstract double calculateIncomeTax();
	}

// - End of the Program -