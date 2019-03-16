package za.ac.cput.LiskovSubstitutionPrinciple;

import za.ac.cput.LiskovSubstitutionPrinciple.Employee1;

public class EmployeeOnVacation extends Employee1 {

    @Override
    public void work()
    {
        throw new IllegalArgumentException("Employees on vacation should not work");

    }


}
