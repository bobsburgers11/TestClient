package af;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AFMeasure {
	
	private int mID;
	private String customer;
	private String mesThing;
	private float readingValue;
	private String mesDate;
	private String mesDevice;
	private String PricePlan;
	
	private AFMeasure(ArrayList<String> afAttributes){
		
		
		if(afAttributes.size() == 7){
			this.mID = Integer.parseInt(afAttributes.get(0));
			this.customer = afAttributes.get(1);
			this.mesThing = afAttributes.get(2);
			this.readingValue = Float.parseFloat(afAttributes.get(3));
			this.mesDate = afAttributes.get(4);
			this.mesDevice = afAttributes.get(5);
			this.PricePlan = afAttributes.get(6);
			
		}else if (afAttributes.size() == 8){
			this.mID = Integer.parseInt(afAttributes.get(0));
			this.customer = afAttributes.get(1)+" "+afAttributes.get(2);
			this.mesThing = afAttributes.get(3);
			this.readingValue = Float.parseFloat(afAttributes.get(4));
			this.mesDate = afAttributes.get(5);
			this.mesDevice = afAttributes.get(6);
			this.PricePlan = afAttributes.get(7);
		}else if(afAttributes.size() == 9){
			this.mID = Integer.parseInt(afAttributes.get(0));
			this.customer = afAttributes.get(1)+" "+afAttributes.get(2)+" "+afAttributes.get(3);
			this.mesThing = afAttributes.get(4);
			this.readingValue = Float.parseFloat(afAttributes.get(5));
			this.mesDate = afAttributes.get(6);
			this.mesDevice = afAttributes.get(7);
			this.PricePlan = afAttributes.get(8);
		}
	}
	
	
	private int getmID() {
		return mID;
	}
	private void setmID(int mID) {
		this.mID = mID;
	}
	private String getCustomer() {
		return customer;
	}
	private void setCustomer(String customer) {
		this.customer = customer;
	}
	private String getMesThing() {
		return mesThing;
	}
	private void setMesThing(String mesThing) {
		this.mesThing = mesThing;
	}
	private float getReadingValue() {
		return readingValue;
	}
	private void setReadingValue(float readingValue) {
		this.readingValue = readingValue;
	}
	private String getMesDate() {
		return mesDate;
	}
	private void setMesDate(String mesDate) {
		this.mesDate = mesDate;
	}
	private String getMesDevice() {
		return mesDevice;
	}
	private void setMesDevice(String mesDevice) {
		mesDevice = mesDevice;
	}
	private String getPricePlan() {
		return PricePlan;
	}
	private void setPricePlan(String pricePlan) {
		PricePlan = pricePlan;
	}
	
	
	public static ArrayList<AFMeasure> createAFCustomer() {
	       ArrayList<AFMeasure> afMeasureList = new ArrayList<AFMeasure>();
	       ArrayList<String> attributList = new ArrayList<String>();
	       int inputline = 0;
			try {
	            String filePath = "Messung.csv";
	            BufferedReader br = null;
	            String input;

	            String inputSeparator = ",";
	            String space = " ";
	            

	            br = new BufferedReader(new FileReader(filePath));
	            while ((input = br.readLine()) != null) {
	            	if(inputline > 0){
	            		String[] messung = input.split(inputSeparator);
		                String[] SeparatedStrings;
		                int numOfStrings = messung.length;
		                for (int i = 0; i < numOfStrings; i++) {

		                    SeparatedStrings = messung[i].split(space);

		                    for (int j = 0; j < SeparatedStrings.length; j++) {

		                    	attributList.add(SeparatedStrings[j]);
		                    }

		                }

		                AFMeasure afMeasure = new AFMeasure(attributList);
		                afMeasureList.add(afMeasure);
		                attributList.removeAll(attributList);
	            	}
	            	inputline = 1;
	            }
	        } catch (FileNotFoundException e) {
	           e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();;
	        }
			
			return afMeasureList;
	    }


	@Override
	public String toString() {
		return "AFMeasure [mID=" + mID + ", customer=" + customer
				+ ", mesThing=" + mesThing + ", readingValue=" + readingValue
				+ ", mesDate=" + mesDate + ", mesDevice=" + mesDevice
				+ ", PricePlan=" + PricePlan + "]"+"\n";
	}
}
