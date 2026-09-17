package Day5.src;
interface Connectable {
	void connect();
	
	default void disconnect() {
		System.out.println("the device is Disconnected");
	}
}
