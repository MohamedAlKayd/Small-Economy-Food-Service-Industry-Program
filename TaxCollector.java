// Mohamed Yasser Anwar Mahmoud AlKayd
// Inheritence & Polymorphism Small Economy Food Service Industry Program - Tax Collector -

// - Start of the Program -

import java.util.ArrayList;
import java.util.List;

public class TaxCollector {

	private List<FoodPlace> foodPlaces = new ArrayList<>();

	private double incomeTaxCollected;
	private double salesTaxCollected;

	public TaxCollector(List<FoodPlace> foodPlaces) {
		/* TODO: Add your code here */
		this.foodPlaces = foodPlaces;
	}

	public List<FoodPlace> getFoodPlaces() {
		return foodPlaces;
	}

	public double getIncomeTaxCollected() {
		return incomeTaxCollected;
	}

	public double getSalesTaxCollected() {
		return salesTaxCollected;
	}

	public void collectTax() {
		for (int x=0 ; x< foodPlaces.size();x++) {
			double j = foodPlaces.get(x).getTotalSalesTax();
			salesTaxCollected = salesTaxCollected + j;

		for (int y=0 ; y<(foodPlaces.get(x).getIncomeTaxPayers()).size();y++) {
			double h = foodPlaces.get(x).getIncomeTaxPayers().get(y).calculateIncomeTax();
			incomeTaxCollected = incomeTaxCollected+h;
		}
		}
	}
	
	public String toString() {
		return "TaxCollector: income tax collected: " + incomeTaxCollected + ", sales tax collected: " + salesTaxCollected;
	}
	
}

// - End of the Program -
