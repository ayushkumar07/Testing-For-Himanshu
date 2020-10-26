package Vegetables;

public class OrganicVegetables extends Vegetable {
    float govtSubsidy;
    public OrganicVegetables(int price, float tax, float govtSubsidy){
        super(price,tax);
        this.govtSubsidy = govtSubsidy;
    }

    @Override
    public float buyVegetables(int quantity) throws Exception {
        return super.buyVegetables(quantity) - (float) price*govtSubsidy*quantity;
    }

}
