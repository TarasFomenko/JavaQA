package Lesson9;

public enum Size {
    Small("S", 11, 41),
    Medium ("M", 12, 42),
    Large ("L", 13, 43),
    ExtraLarge ("XL", 14, 44);

    private final String shortName;
    private final int width;
    private final int length;

    Size(String shortName, int width, int length) {
        this.shortName = shortName;
        this.width = width;
        this.length = length;
    }

    public String getShortName() {
        return shortName;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        System.out.println(getShortName() + " size, with width = " + getWidth() +  " and length = " + getLength());
        return null;
    }
}
