package za.ac.cput.LiskovSubstitutionPrinciple;

/*
This code violates the Liskov Substitution Principle.

 */

import za.ac.cput.LiskovSubstitutionPrinciple.Employee1;

import java.util.List;

public class Project {

    public void start(List<Employee1> employees)
    {
        for(Employee1 employee: employees)
        {
            employee.work();
        }
    }


}
