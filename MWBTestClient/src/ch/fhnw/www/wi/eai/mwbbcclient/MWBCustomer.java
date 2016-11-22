package ch.fhnw.www.wi.eai.mwbbcclient;

public class MWBCustomer {
	
	private static int CID = 0;
	private String FirstName;
	private String LastName;
	private String Street;
	private String ZIP_Town;
	private boolean CustomSeg;
	private MWBMeasureDevice mwbBD;
	
	
	public MWBCustomer createMWBCustomer(){
		
		MWBCustomer mwbC = new MWBCustomer();
		
		return mwbC;
	}
	
}
