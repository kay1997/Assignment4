package za.ac.cput.UsingOOP;

/*
* Kaylen Abrahams
* Student Number: 216054664
* Group: 3G
 */

public class ModesOfTransport {

    private String company;
    private String location;

    public ModesOfTransport(String company, String location) {
        this.company = company;
        this.location = location;
    }


    public String getCompany()
    {
        return company;
    }

    public String getLocation()
    {
        return location;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }


}
