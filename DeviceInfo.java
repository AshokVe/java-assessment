package mbb.com.device.info;

public class DeviceInfo {
	private String deviceType;
	private String model;
	private String deviceName;
	
	
	public DeviceInfo(){}
	
	public DeviceInfo(String deviceName, String deviceType, String model){
		this.deviceName = deviceName;
		this.deviceType = deviceType;
		this.model = model;
	}
	
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}
