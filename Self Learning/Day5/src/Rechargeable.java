package Day5.src;
public interface Rechargeable {
	void recharge();
	
	default void charging() {
		System.out.println("the device is charging");
	}
}
