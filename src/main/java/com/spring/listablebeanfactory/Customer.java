package com.spring.listablebeanfactory;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This program describe the listableFactoryBean,setFactoryBean,MapFctoryBean 
 * @author Ram
 *
 */
public class Customer {
    /**
     * http://www.mkyong.com/tutorials/spring-tutorials/
     */
    private List<String> nameList;

    private Set nameSet;

    private Map<String,String> nameMap;

   

    public List<String> getNameList() {
        return nameList;
    }



    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }



    public Set getNameSet() {
        return nameSet;
    }



    public void setNameSet(Set nameSet) {
        this.nameSet = nameSet;
    }



    public Map<String, String> getNameMap() {
        return nameMap;
    }



    public void setNameMap(Map<String, String> nameMap) {
        this.nameMap = nameMap;
    }



	@Override
    public String toString() {
	    StringBuilder builder = new StringBuilder();
	    builder.append("Customer [nameList=");
	    builder.append(nameList);
	    builder.append(", nameSet=");
	    builder.append(nameSet);
	    builder.append(", nameMap=");
	    builder.append(nameMap);
	    builder.append("]");
	    return builder.toString();
    }



  
}
