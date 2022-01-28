package mbb.com.device;

import mbb.com.device.info.DeviceInfo;

public abstract class Device {
	
	private DeviceInfo device;
	
	public DeviceInfo getDevice() {
		return device;
	}

	public void setDevice(DeviceInfo device) {
		this.device = device;
	}

	public void baseFunctionality(){
		//Electronic device functionality logic goes here
		System.out.println("This is an electronic device... works fine");
	}
	
   public void functionality(){
	   //logic goes here
   }
   
   public void basicFeatures() {
	   // logic goes here...
   }
   
   public abstract void advancedFeature();
}
