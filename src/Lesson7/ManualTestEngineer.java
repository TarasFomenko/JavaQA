package Lesson7;

public class ManualTestEngineer extends Employee {
    final String LastName;

    public ManualTestEngineer(String name, String lastName) {
        super(name);
        LastName = lastName;
    }

    @Override
    public String getLastName() {
        return LastName;
    }

    @Override
    public String getPosition() {
        return "Manual Test Engineer";
    }

    @Override
    public String getSeniority() {
        return "Junior";
    }
}
