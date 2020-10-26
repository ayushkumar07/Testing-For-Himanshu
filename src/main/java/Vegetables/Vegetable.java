package Vegetables;

public class Vegetable {
    int price;
    int available;
    float tax;

    public Vegetable(int price, float tax){
        this.price = price;
        this.tax = tax;
        this.available = 0;
    }
    public int getVegetablesAvailable(){
        return available;
    }
    public void addVegetables(int quantity) throws Exception{
        if(quantity < 0){
            throw new Exception();
        }
        available += quantity;
    }

    public float buyVegetables(int quantity) throws Exception {
        if (quantity <= 0 || quantity > available) {
            throw new Exception();
        }
        available -= quantity;
        return (float) ((float) price + (float)price* tax)*quantity;
    }
}
