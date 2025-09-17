package com.tnsif.inheritance;

public class HierarchicalIn {

	public static void main(String[] args) {
        
        Starters s = new Starters();
        MainMenu m = new MainMenu();
        Desserts d = new Desserts();

        
        s.takeCustomerDetails();

        
        s.showStarters();
        m.showMainMenu();
        d.showDesserts();

	}
}
