package com.spring.beannameaware;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class ResourceLoaderEx implements ResourceLoaderAware {
	
	private ResourceLoader	resourceLoader;
	
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
		
	}
	
	public Resource getResource(String location) {
		return resourceLoader.getResource(location);
		
	}
}
