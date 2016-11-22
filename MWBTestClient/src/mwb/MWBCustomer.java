package mwb;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.holders.IntegerWrapperHolder;
import javax.xml.rpc.holders.StringHolder;

import ch.fhnw.www.wi.eai.mwb.MWBProxy;


public class MWBCustomer {


	     private String queryFirstName;
	     private String queryLastName;
	     private IntegerWrapperHolder cid = new IntegerWrapperHolder();
	     private StringHolder firstName = new StringHolder();
	     private StringHolder lastName = new StringHolder();
	     private StringHolder street = new StringHolder();
	     private StringHolder zip_town = new StringHolder();
	     private StringHolder customerSeg = new StringHolder();
	     private static ArrayList<MWBCustomer> customers = new ArrayList<MWBCustomer>();
	     private ArrayList<MWBMeasureDevice> mwbCMDList;
	        
	     private MWBCustomer(String queryLastName) throws ServiceException, RemoteException { //, ArrayList<MWBMessung> messungen

	         this.queryFirstName = queryFirstName;
	         this.queryLastName = queryLastName;
	         this.cid = cid;
	         this.firstName = firstName;
	         this.lastName = lastName;
	         this.street = street;
	         this.zip_town = zip_town;
	         this.customerSeg = customerSeg;
	         this.mwbCMDList=null;
	         
	         
	         getCustomer(queryFirstName, queryLastName, cid, firstName, lastName, street, zip_town, customerSeg);
	  
	     }
	     
	    

		public String getQueryFirstName() {
			return queryFirstName;
		}

		public void setQueryFirstName(String queryFirstName) {
			this.queryFirstName = queryFirstName;
		}

		public String getQueryLastName() {
			return queryLastName;
		}

		public void setQueryLastName(String queryLastName) {
			this.queryLastName = queryLastName;
		}

		public IntegerWrapperHolder getCid() {
			return cid;
		}

		public void setCid(IntegerWrapperHolder cid) {
			this.cid = cid;
		}

		public StringHolder getFirstName() {
			return firstName;
		}

		public void setFirstName(StringHolder firstName) {
			this.firstName = firstName;
		}

		public StringHolder getLastName() {
			return lastName;
		}

		public void setLastName(StringHolder lastName) {
			this.lastName = lastName;
		}

		public StringHolder getStreet() {
			return street;
		}

		public void setStreet(StringHolder street) {
			this.street = street;
		}

		public StringHolder getZip_town() {
			return zip_town;
		}

		public void setZip_town(StringHolder zip_town) {
			this.zip_town = zip_town;
		}

		public StringHolder getCustomerSeg() {
			return customerSeg;
		}

		public void setCustomerSeg(StringHolder customerSeg) {
			this.customerSeg = customerSeg;
		}
		
		private void setMWBCMDList(ArrayList<MWBMeasureDevice> mwbCMDList){
			this.mwbCMDList = mwbCMDList;
		}
		
		public ArrayList<MWBMeasureDevice> getMWBCMDList(){
			return mwbCMDList;
		}


		private static void getCustomer(java.lang.String queryVorname, java.lang.String queryNachname, javax.xml.rpc.holders.IntegerWrapperHolder kid, javax.xml.rpc.holders.StringHolder vorname, javax.xml.rpc.holders.StringHolder nachname, javax.xml.rpc.holders.StringHolder strasse, javax.xml.rpc.holders.StringHolder plzStadt, javax.xml.rpc.holders.StringHolder kundenart) throws ServiceException, RemoteException {
			ch.fhnw.www.wi.eai.mwb.MWBProxy service = new ch.fhnw.www.wi.eai.mwb.MWBProxy();
			service.getCustomer(queryVorname, queryNachname, kid, vorname, nachname, strasse, plzStadt, kundenart);
		}


		public static ArrayList<MWBCustomer> createMWBCustomers() {
			MWBProxy test = new MWBProxy();
			String[] test1;
			try {
				test1 = test.listCustomerLastNames();
				ArrayList<String> test2 =new ArrayList<String>(Arrays.asList(test1));
				for(String i:test2){
					try {
						MWBCustomer z = new MWBCustomer(i);
						z.setMWBCMDList(getMeasureDevice(z.getCid().value));
						customers.add(z);
					} catch (ServiceException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				} catch (RemoteException e1) {
				// TODO Auto-generated catch block
						e1.printStackTrace();
				}
		
				return customers;
    	 
   
			}
		
		private static ArrayList<MWBMeasureDevice> getMeasureDevice(int i){
			ArrayList<MWBMeasureDevice> k = new ArrayList<MWBMeasureDevice>();
			for (int f = 1; f <= 10;f++){
				MWBMeasureDevice mwbMD = new MWBMeasureDevice(f);
				if(mwbMD.getCid().value==i){
					k.add(mwbMD);
				}
			}
			return k;
		}

		@Override
	     public String toString() {
	         return "cid =" + cid.value + "\n" + "firstname =" + firstName.value + "\n" + "lastname =" + lastName.value + "\n" + "street =" + street.value + "\n" + "zip_town =" + zip_town.value + "\n" + "customerseg =" + customerSeg.value + "\n" + "Measures = "+mwbCMDList;  
	     }
		

	 }
