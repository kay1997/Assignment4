package za.ac.cput.InterfaceSegregationPrinciple;

    /*
This code violates the Dependency Inversion Principle
because not all people would invoke these methods as some might only swim
or just do field events.

 */

public interface Athletics {

    void track();
    void field();
    void aquatics();

}
