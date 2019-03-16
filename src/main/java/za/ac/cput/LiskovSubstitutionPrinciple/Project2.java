package za.ac.cput.LiskovSubstitutionPrinciple;


import java.util.List;

public class Project2 {

    public void start(List<WorkEmployee> workEmployeea)
    {
        for(WorkEmployee workEmployee: workEmployeea)
        {
            workEmployee.work();
        }
    }
}
