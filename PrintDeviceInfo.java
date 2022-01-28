package mbb.com.device;

import mbb.com.device.info.DeviceInfo;

public class PrintDeviceInfo {

	public PrintDeviceInfo() {
	}
	
	public static String getDetails(DeviceInfo data){
		return "{ Device Type " + data.getDeviceType() + "\t Name " + data.getDeviceName() + "\t Model" + data.getModel()  + "}" ;
	}
}