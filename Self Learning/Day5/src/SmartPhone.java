package Day5.src;
class SmartPhone extends Device implements Connectable, Rechargeable, Upgradeable{
	
	SmartPhone(String DeviceName, int DeviceId){
		super(DeviceName, DeviceId);
	}
	
	 @Override
	    void showDeviceDetails() {
	        System.out.println("Device Name: " + DeviceName);
	        System.out.println("Device ID: " + DeviceId);
	    }

	    @Override
	    public void connect() {
	        System.out.println("Smartphone connected");
	    }

	    @Override
	    public void recharge() {
	        System.out.println("Smartphone is recharging");
	    }

	    @Override
	    public void upgrade() {
	        System.out.println("Smartphone software upgraded");
	    }
	}


