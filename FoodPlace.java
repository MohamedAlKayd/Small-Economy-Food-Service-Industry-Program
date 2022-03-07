// Mohamed Yasser Anwar Mahmoud AlKayd
// Inheritence & Polymorphism Small Economy Food Service Industry Program - Food Place -

// - Start of the Program -

import java.util.List;

public abstract class FoodPlace {

    private static int currentMaxFoodPlaceID;
    private int foodPlaceID;
    private String name;
    private double fixedCosts;
    private double totalSalesTax;
    private Owner owner;

// - Food place constructor
    public FoodPlace(String name, double fixedCosts, Owner owner){
        this.name = name;
        this.fixedCosts =fixedCosts;
        this.owner =owner;
        foodPlaceID = currentMaxFoodPlaceID;
        // Sets the owner's FoodPlace field
        this.owner.setFoodPlace(this);
        currentMaxFoodPlaceID++;
    }

// - Function to get the maximum food place ID -

    public static int getCurrentMaxFoodPlaceID() {
        return currentMaxFoodPlaceID;
    }

// - Function to get the food place ID -

    public int getFoodPlaceID() {
        return foodPlaceID;
    }
    
// - Function to get the name of the food place -

    public String getName() {
        return this.name;
    }

// - Function to get the fixed costs of the food place -

    public double getFixedCosts() {
        return this.fixedCosts;
    }

// - Function to get the total sales tax of the food place -

    public double getTotalSalesTax() {
        return this.totalSalesTax;
    }

// - Function to set the total sales tax of the food place -

    public void setTotalSalesTax(double totalSalesTax) {
        this.totalSalesTax = totalSalesTax;
    }

// - Function to get the owner of the food place -

    public Owner getOwner() {
        return this.owner;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof FoodPlace) && (this.foodPlaceID == ((FoodPlace) obj).foodPlaceID)) {
        return true;
    }
        return false;
    }

    abstract void workShift(int hours);

    abstract List<IncomeTaxPayer> getIncomeTaxPayers();

    abstract void distributeIncomeAndSalesTax(Check check);

    abstract double getTipPercentage();
}

// - End of the Program -