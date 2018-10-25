package edu.ucsb.cs56.pconrad.menuitem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

public class MenuTest {

    private Menu m = new Menu();
    private String nl = System.lineSeparator();

    @Before
    public void setUp() {
        m.add(new MenuItem("Small Poke Bowl", 1049, "Poke Bowls"));
        m.add(new MenuItem("Medium Poke Bowl", 1249, "Poke Bowls"));
        m.add(new MenuItem("Large Poke Bowl", 1449, "Poke Bowls"));
        m.add(new MenuItem("Milk Tea", 249, "Beverage"));
        m.add(new MenuItem("Boba Tea", 249, "Beverage"));
        m.add(new MenuItem("Green Tea", 149, "Beverage"));
    }
	
	@Test
    public void test_csvSortedByName() {
        String expected =
                "Boba Tea,249,Beverage" + nl +
                        "Green Tea,149,Beverage" + nl +
                        "Large Poke Bowl,1449,Poke Bowls" + nl +
                        "Medium Poke Bowl,1249,Poke Bowls" + nl +
                        "Milk Tea,249,Beverage" + nl +
                        "Small Poke Bowl,1049,Poke Bowls" + nl +
                        "";
        assertEquals(expected,m.csvSortedByName());
    }

    @Test
    public void test_csvSortedByPriceThenName() {
        String expected =
                "Green Tea,149,Beverage" + nl +
                        "Boba Tea,249,Beverage" + nl +
                        "Milk Tea,249,Beverage" + nl +
                        "Small Poke Bowl,1049,Poke Bowls" + nl +
                        "Medium Poke Bowl,1249,Poke Bowls" + nl +
                        "Large Poke Bowl,1449,Poke Bowls" + nl +
                        "";
        assertEquals(expected,m.csvSortedByPriceThenName());
    }

}
