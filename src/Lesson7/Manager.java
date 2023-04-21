package Lesson7;

import java.util.Arrays;

public class Manager extends Employee{
    final String LastName;
    Employee[] team;

    public Manager(String name, String lastName) {
        super(name);
        LastName = lastName;
    }

    @Override
    public String getLastName() {
        return LastName;
    }


    @Override
    public String getPosition() {
        return "Manager and has a team of " + team.length +" members: " + Arrays.toString(team);
    }

    @Override
    public String getSeniority() {
        return "Senior";
    }
    public void setTeamMembers(Employee... employees){
        team = employees;
    }

    public String getInfo(){
        return getName();
    }
}
