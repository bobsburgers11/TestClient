package mwb;

import java.rmi.RemoteException;

import javax.xml.rpc.holders.FloatWrapperHolder;
import javax.xml.rpc.holders.IntegerWrapperHolder;
import javax.xml.rpc.holders.StringHolder;

public class MWBMeasureDevice {

	    int queryMesID;
	    IntegerWrapperHolder mesID = new IntegerWrapperHolder();
	    IntegerWrapperHolder cid = new IntegerWrapperHolder();
	    StringHolder measureTarget = new StringHolder();
	    FloatWrapperHolder value = new FloatWrapperHolder();
	    StringHolder model = new StringHolder();
	    StringHolder tariffplan = new StringHolder();

	    public MWBMeasureDevice(int queryMessID) {

	        this.queryMesID = queryMessID;
	        this.mesID = mesID;
	        this.cid = cid;
	        this.measureTarget = measureTarget;
	        this.value = value;
	        this.model = model;
	        this.tariffplan = tariffplan;
	        getMeasureDevice(queryMessID, mesID, cid, measureTarget, value, model, tariffplan);

	    }

	    private static void getMeasureDevice(int queryMesID, javax.xml.rpc.holders.IntegerWrapperHolder mesID, javax.xml.rpc.holders.IntegerWrapperHolder cid, javax.xml.rpc.holders.StringHolder measureTarget, javax.xml.rpc.holders.FloatWrapperHolder value, javax.xml.rpc.holders.StringHolder model, javax.xml.rpc.holders.StringHolder tariffplan) {
	        ch.fhnw.www.wi.eai.mwb.MWBProxy service = new ch.fhnw.www.wi.eai.mwb.MWBProxy();
	        try {
				service.getMeasureDevice(queryMesID, mesID, cid, measureTarget, value, model, tariffplan);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	 
	    public int getQueryMesID() {
			return queryMesID;
		}

		public void setQueryMesID(int queryMesID) {
			this.queryMesID = queryMesID;
		}

		public IntegerWrapperHolder getMesID() {
			return mesID;
		}

		public void setMesID(IntegerWrapperHolder mesID) {
			this.mesID = mesID;
		}

		public IntegerWrapperHolder getCid() {
			return cid;
		}

		public void setCid(IntegerWrapperHolder cid) {
			this.cid = cid;
		}

		public StringHolder getMeasureTarget() {
			return measureTarget;
		}

		public void setMeasureTarget(StringHolder measureTarget) {
			this.measureTarget = measureTarget;
		}

		public FloatWrapperHolder getValue() {
			return value;
		}

		public void setValue(FloatWrapperHolder value) {
			this.value = value;
		}

		public StringHolder getModel() {
			return model;
		}

		public void setModel(StringHolder model) {
			this.model = model;
		}

		public StringHolder getTariffplan() {
			return tariffplan;
		}

		public void setTariffplan(StringHolder tariffplan) {
			this.tariffplan = tariffplan;
		}

		@Override
	    public String toString() {
	        return "mesID =" + mesID.value + "\n" + "cid =" + cid.value + "\n" + "measureTarget= " + measureTarget.value + "\n" + "value= " + value.value + "\n" + "ausfuehrung =" + model.value + "\n" + "tariffplan=" + tariffplan.value + "\n";
	    }

	}

