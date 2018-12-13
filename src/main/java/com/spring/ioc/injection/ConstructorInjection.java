package com.spring.ioc.injection;

/**
 * This program describe dependency Injection in spring.
 * @author Ram
 *
 */
public class ConstructorInjection {
    
    String name;
    String address;
    
    public ConstructorInjection()
    {
        
    }
    public ConstructorInjection(String name, String address) {
        super();
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return  "Name is " + name + " \n Address is " + address;
    }
    
    

}
