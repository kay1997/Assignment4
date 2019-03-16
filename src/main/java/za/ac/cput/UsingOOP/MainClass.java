package za.ac.cput.UsingOOP;

/*
* Kaylen Abrahams
* Student Number: 216054664
* Group: 3G
 */

public class MainClass {

    public static void main( String[] args )
    {
        ModesOfTransport mot = new Bus("Golden Arrow", "Cape Town", 10, 5);
        Bus bus = new Bus("MyCity", "Cape Town", 8, 5);

        System.out.println("Company: " + mot.getCompany() + ", " + "Location: " + mot.getLocation());
        System.out.println("Company: " + bus.getCompany() + ", " + "Location: " + bus.getLocation() + ", " + "Total: " +  bus.total(bus.getPrice(), bus.getKm()));

    }
}


