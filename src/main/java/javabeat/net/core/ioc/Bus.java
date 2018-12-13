package javabeat.net.core.ioc;

public class Bus implements Transport {

	@Override
    public void getTransport() {
		System.out.println("Transport type is :bus");
    }
	
}
