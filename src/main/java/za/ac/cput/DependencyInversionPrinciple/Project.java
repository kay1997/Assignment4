package za.ac.cput.DependencyInversionPrinciple;


        import java.util.List;

public class Project {

    private List<Programming> programming;

    public Project(List<Programming> programming)
    {
        this.programming = programming;
    }
    public void implement()
    {
        programming.forEach(Programming::develop);
    }
}
