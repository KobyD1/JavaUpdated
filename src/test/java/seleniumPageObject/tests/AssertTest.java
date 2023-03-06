package seleniumPageObject.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class AssertTest {

    @Before
    public void before() {
        ArrayList testList = new ArrayList();
        System.out.println("into before ");
    }


    @After

    public void after(){

    }

    @Test
    public void testFirst() {
        ArrayList<String> cities = new ArrayList<String>(
                Arrays.asList("Rome",
                        "London",
                        "Madrid"
                ));
        String city = cities.get(2);
        assertEquals(city, "London");
    }

    @Test
    public void testSecond() {
        ArrayList<String> cities = new ArrayList<String>(
                Arrays.asList(
                        "Rome",
                        "London",
                        "Madrid"
                ));
        String city = cities.get(1);
        assertEquals(city, "London");
    }
}
