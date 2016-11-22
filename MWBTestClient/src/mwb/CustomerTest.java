package mwb;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.rpc.ServiceException;

import ch.fhnw.www.wi.eai.mwb.MWBProxy;

public class CustomerTest {

	public static void main(String[] args) throws RemoteException, ServiceException {
		
			ArrayList<MWBCustomer> customers = MWBCustomer.createMWBCustomers();
			
			System.out.println(customers);
			
			
			
			
			
		
			
			
		

	}

}
