package Lesson6;

public class Animal {
    public boolean vegetarian;
    public String eats;
    public int numberOfLegs;

    public Animal(boolean vegetarian, String eats, int numberOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.numberOfLegs = numberOfLegs;
    }

    public Animal() {
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}
