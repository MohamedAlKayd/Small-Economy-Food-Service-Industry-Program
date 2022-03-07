// Mohamed Yasser Anwar Mahmoud AlKayd
// Inheritence & Polymorphism Small Economy Food Service Industry Program - Staff -

// - Start of the Program -

public class Staff extends IncomeTaxPayer {
	private int salaryPerHour;
	final private int incomeTaxPercentage = 25;

	public Staff(String name, boolean isCook) {
		super(name);
		if (isCook){
			this.salaryPerHour = 20;
		}else{
			this.salaryPerHour = 10;
		}
	}

// - Function to get the salary per hour for the staff -

	public int getSalaryPerHour() {
		return salaryPerHour;
	}

// - Function to get the income tax percentage for the staff -

	public int getIncomeTaxPercentage() {
		return incomeTaxPercentage;
	}

// - Function to get the work hours for the staff -

	public double workHours(int numHours) {
		setIncome(getIncome()+(salaryPerHour*numHours));
		return (salaryPerHour*numHours);
	}
	@Override
	public double calculateIncomeTax() {
		return (incomeTaxPercentage*0.01*getIncome());
	}
}
// - End of the Program -