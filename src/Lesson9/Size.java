package Lesson9;

public enum Size {
    Small, Medium, Large, ExtraLarge;

    String shortName;
    double width;
    double length;

    Size(String shortName, int width, int length) {
        this.shortName = shortName;
        this.width = width;
        this.length = length;
    }
    public String getShortName() {
        return shortName;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Size{}";
    }
}
