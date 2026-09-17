package Day5.src;//1. Design a Smart Device Management System where:  
//1 Device is an abstract class  
//2 Interfaces such as Connectable, Rechargeable, and Upgradeable 
// define device capabilities 
//3 Different devices implement one or more interfaces  
//4 Use default methods for common functionality  
//5 Study when to prefer an abstract class over an interface 

public class Question1 {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("iphone", 101);
		phone.showDeviceDetails();
        phone.on();

        phone.connect();
        phone.disconnect();

        phone.recharge();
        phone.charging();

        phone.upgrade();
        phone.upgrade();

        phone.off();

	}

}
