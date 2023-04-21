package Lesson7;

public class AutomationEngineer extends Employee {
    final String LastName;

    public AutomationEngineer(String name, String lastName) {
        super(name);
        LastName = lastName;
    }

    @Override
    public String getLastName() {
        return LastName;
    }

    @Override
    public String getPosition() {
        return "Automation Engineer";
    }

    @Override
    public String getSeniority() {
        return "Senior";
    }
}
