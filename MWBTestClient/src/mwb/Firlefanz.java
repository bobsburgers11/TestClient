package mwb;

import java.util.ArrayList;

public class Firlefanz {

	public static void main(String[] args) {
		ArrayList<MWBCustomer> list = MWBCustomer.createMWBCustomers();
		for(MWBCustomer i : list){
			System.out.println(i.getStreet().value);
		}

	}

}
