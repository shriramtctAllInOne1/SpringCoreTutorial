package javabeat.net.core.ioc;



public class SpringService {
	
	public static SpringService service= new SpringService();
	
	public static SpringService createService()
	{
		return service;
	}
	
	public  Transport createCarInstance()
	{
	return new Car();
	}
	
	public  Transport createBusInstance()
	{
	return new Bus();
	}
	
}
