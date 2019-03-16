package za.ac.cput.UsingAnInterface;

/*
* Kaylen Abrahams
* Student Number: 216054664
* Group: 3G
 */

public class Bus implements Transport{

    private String company;
    private String location;

    public Bus(String company, String location)
    {
        this.company = company;
        this.location = location;
    }

    @Override
    public double total(double price, double km) {
        return price * km;
    }

    public static void main( String[] args )
    {
        Bus bus = new Bus("Golden Arrow", "Cape Town");
        double total = bus.total(8, 5);

        System.out.println("Company: " + bus.company + ", " + "Location: " + bus.location + ", " + "Total: R" + total);

    }
}
