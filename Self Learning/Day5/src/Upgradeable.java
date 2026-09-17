package Day5.src;
public interface Upgradeable {
	void upgrade();
	
	default void upgradet() {
		System.out.println("the device is upgrated");
	}
}
