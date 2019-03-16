package za.ac.cput.UsingOOP;

/*
* Kaylen Abrahams
* Student Number: 216054664
* Group: 3G
 */

public class Bus extends ModesOfTransport {

    private double price;
    private double km;

    public Bus(String company, String location, double price, int km)
    {
        super(company, location);
        this.price = price;
        this.km = km;



    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getKm()
    {
        return km;
    }

    public void setKm(double km)
    {
        this.km = km;
    }

    public double total(double price, double km)
    {
         return price * km;
    }





}


