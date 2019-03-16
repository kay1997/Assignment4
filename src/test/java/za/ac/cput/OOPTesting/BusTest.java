package za.ac.cput.OOPTesting;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.UsingOOP.Bus;

/*
* Kaylen Abrahams
* Student Number: 216054664
* Group: 3G
 */

public class BusTest {

    private Bus bus;
    @Before
    public void setUp() throws Exception {

        bus = new Bus("MyCity", "Cape Town", 8, 5);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getPrice() throws Exception {


        Assert.assertEquals(8, bus.getPrice(), 0);
    }

    @Test
    public void getKm() throws Exception {

        Assert.assertEquals(5, bus.getKm(), 0);
    }

    @Test
    public void total() throws Exception {

        double price = bus.getPrice();
        double km = bus.getKm();
        Assert.assertEquals(40, bus.total(price, km), 0);
    }

}