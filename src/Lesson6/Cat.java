package Lesson6;

public class Cat extends Animal{

    private String color;

    public Cat(boolean vegetarian, String eats, int numberOfLegs, String color) {
        super(vegetarian, eats, numberOfLegs);
        this.color = color;
    }

    public Cat(boolean vegetarian, String eats, int numberOfLegs) {
        super(vegetarian, eats, numberOfLegs);
        this.color = "Red";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
