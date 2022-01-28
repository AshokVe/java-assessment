package mbb.com.device.factory;

import mbb.com.device.AppleMacBook;
import mbb.com.device.Device;
import mbb.com.device.DeviceNames;
import mbb.com.device.MicrosoftXBox;
import mbb.com.device.SonyPlayStation;
import mbb.com.device.SonySmartTV;
import mbb.com.device.info.DeviceInfo;

public class DeviceFactory {
	private Device device;

	public Device getDevice(String deviceName) throws Exception{
		if (deviceName != null) {

			if (deviceName.equalsIgnoreCase(DeviceNames.SSTV)) {
				device = new SonySmartTV();
				device.setDevice(new DeviceInfo("Sony Smart TV", "UHD",
						"ABC-2022"));
			} else if (deviceName.equalsIgnoreCase(DeviceNames.SPL)) {
				device = new SonyPlayStation();
				device.setDevice(new DeviceInfo("Sony Play Station", "4K",
						"SPL-2022"));
			} else if (deviceName.equalsIgnoreCase(DeviceNames.MSXBox)) {
				device = new MicrosoftXBox();
				device.setDevice(new DeviceInfo("MicroSoft XBox", "4K",
						"SPL-2022"));
			} else if (deviceName.equalsIgnoreCase(DeviceNames.MacBook)) {
				device = new AppleMacBook();
				device.setDevice(new DeviceInfo("Apple MacBook", "AppleMB",
						"APL-2022"));
			}
		} else {
			throw new Exception("Device not found");
		}
		return device;
	}

}
