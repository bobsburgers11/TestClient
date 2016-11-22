package ch.fhnw.www.wi.eai.mwbbcclient;

import java.rmi.RemoteException;

import javax.xml.rpc.holders.IntegerWrapperHolder;

import ch.fhnw.www.wi.eai.mwb.MWB;
import ch.fhnw.www.wi.eai.mwb.MWBProxy;

public class MWBTestClient {
	
	public static void main(String[] args){
		
		MWB server;
		
		server = new MWBProxy();
		
		
		try{
			server.printCustomers();
			server.printMeasureDevice();
		} catch (RemoteException e){
			e.printStackTrace();
		}
		
		
	}



}
