package Day5.src;
public abstract class Device {
	String DeviceName;
	int DeviceId;
	
	public Device(String DeviceName, int DeviceId) {
		this.DeviceName = DeviceName;
		this.DeviceId = DeviceId;
	}
	
	abstract void showDeviceDetails() ;
	
	void on() {
		System.out.println("device is on");
	}
	
	void off() {
		System.out.println("device is off");
	}
}
