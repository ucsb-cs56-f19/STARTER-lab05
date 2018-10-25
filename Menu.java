package edu.ucsb.cs56.pconrad.menuitem;
import java.util.ArrayList;

public class Menu {
	
    private ArrayList<MenuItem> menuitems;

    public Menu() {
        menuitems = new ArrayList<MenuItem>();
    }

    public void add(MenuItem mi) {
		// stub
    }

    public String csv() {
        return "stub";
    }


    public String csvSortedByPriceThenName() {
       return "stub";
    }

    public String csvSortedByName() {
        return "stub";
    }

    public String csvSortedByCategoryThenName() {
        return "stub";

    }

    public String csvSortedByCategoryThenPriceDescendingThenByName() {
        return "stub";
    }
}
