package za.ac.cput.UsingAnInterfaceTesting;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.UsingAnInterface.Bus;

/*
* Kaylen Abrahams
* Student Number: 216054664
* Group: 3G
 */

public class BusTestWithInterface {

    private Bus bus;
    @Before
    public void setUp() throws Exception {

        bus = new Bus("MyCity", "Cape Town");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void total() throws Exception {

        double total =  bus.total(10, 5);
        Assert.assertEquals(50, total, 0);
    }

}