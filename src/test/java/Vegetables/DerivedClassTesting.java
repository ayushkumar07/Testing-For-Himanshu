package Vegetables;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DerivedClassTesting {
    @Test(expected = Exception.class)
    public void addVegetableForNegativeValue() throws Exception {
        Vegetable vegetable = new OrganicVegetables(5000, (float)0.10, (float)0.10);
        vegetable.addVegetables(-20);
    }
    @Test
    public void addVegetableForZeroValue() throws Exception {
        Vegetable vegetable = new OrganicVegetables(5000, (float)0.10, (float)0.10);
        vegetable.addVegetables(0);
        assertEquals(0, vegetable.getVegetablesAvailable());
    }
    @Test
    public void addVegetableFor1Value() throws Exception {
        Vegetable vegetable = new OrganicVegetables(5000, (float)0.10, (float)0.10);
        vegetable.addVegetables(1);
        assertEquals(1, vegetable.getVegetablesAvailable());
    }
    @Test
    public void addVegetableForPositiveValue() throws Exception {
        Vegetable vegetable = new OrganicVegetables(5000, (float)0.10, (float)0.10);
        vegetable.addVegetables(20);
        vegetable.addVegetables(25);
        assertEquals(45, vegetable.getVegetablesAvailable());
    }
    @Test(expected = Exception.class)
    public void buyVegetablesForNegativeValue() throws Exception {
        Vegetable vegetable = new OrganicVegetables(5000, (float)0.10, (float)0.10);
        vegetable.addVegetables(10);
        vegetable.buyVegetables(-1);
        assertEquals(10, vegetable.getVegetablesAvailable());
    }
    @Test(expected = Exception.class)
    public void buyVegetablesForZeroValue() throws Exception {
        Vegetable vegetable = new OrganicVegetables(5000, (float)0.10, (float)0.10);
        vegetable.addVegetables(10);
        vegetable.buyVegetables(0);
        assertEquals(10, vegetable.getVegetablesAvailable());
    }

    @Test
    public void buyVegetablesFor1Value() throws Exception {
        Vegetable vegetable = new OrganicVegetables(5000, (float)0.10, (float)0.10);
        vegetable.addVegetables(10);
        assertEquals((float)5000, vegetable.buyVegetables(1), (float)0.00);
        assertEquals(9, vegetable.getVegetablesAvailable());

    }
    @Test
    public void buyVegetableForMaxMinus1Value() throws Exception {
        Vegetable vegetable = new OrganicVegetables(5000, (float)0.10, (float)0.10);
        vegetable.addVegetables(5);
        assertEquals((float)20000, vegetable.buyVegetables(4), (float)0.00);
        assertEquals(1, vegetable.getVegetablesAvailable());

    }
    @Test
    public void buyVegetablesForMaxValue() throws Exception {
        Vegetable vegetable = new OrganicVegetables(5000, (float)0.10, (float)0.10);
        vegetable.addVegetables(5);
        assertEquals((float)25000, vegetable.buyVegetables(5), (float)0.00);
        assertEquals(0, vegetable.getVegetablesAvailable());
    }
    @Test(expected = Exception.class)
    public void buyVegetablesForMaxPlus1Value() throws Exception {
        Vegetable vegetable = new OrganicVegetables(5000, (float)0.10, (float)0.10);
        vegetable.addVegetables(5);
        float cost = vegetable.buyVegetables(6);
    }
}
