package za.ac.cput.DependencyInversionPrinciple;


public class Html implements Programming {

    /*
This code violates the Dependency Inversion Principle.

*/
    public void writeJavascript()
    {

    }

    @Override
    public void develop() {

        writeJavascript();
    }
}
