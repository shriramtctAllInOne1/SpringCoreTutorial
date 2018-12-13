package com.spring.initdestory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Cashier {
	
	private String	       name;
	private String	       path;
	private BufferedWriter	bufferWriter;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public void openFile() throws IOException
	{
		File loggfile = new File(path,name+".txt");
		bufferWriter= new BufferedWriter(new OutputStreamWriter(new FileOutputStream(loggfile,true)));
	}
	
	public void WriteToFile() throws IOException
	{
		List<String>nameList= new ArrayList<String>();
		
		nameList.add("ram");
		nameList.add("shivani");
		nameList.add("shivani1");
		StringBuffer sbf= new StringBuffer();
		for(String sparam:nameList)
		{
			sbf.append(sparam);
		}
		bufferWriter.write(sbf.toString());
		
	}
	
	public void closeFile() throws IOException
	{
		bufferWriter.close();
	}
}
