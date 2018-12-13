package com.spring.ioc.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * This program describe collection as bean property in spring.
 * 
 * @author Ram
 * 
 *         Bean with collections as property
 * 
 */
public class BeanwithCollection {
    private List<Object>        list;
    private Set<Object>         set;
    private Map<Object, Object> map;
    private Properties          props;
    
    public BeanwithCollection()
    {
        
    }

    public BeanwithCollection(List<Object> list, Set<Object> set,
            Map<Object, Object> map, Properties props) {
        super();
        this.list = list;
        this.set = set;
        this.map = map;
        this.props = props;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Set<Object> getSet() {
        return set;
    }

    public void setSet(Set<Object> set) {
        this.set = set;
    }

    public Map<Object, Object> getMap() {
        return map;
    }

    public void setMap(Map<Object, Object> map) {
        this.map = map;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

}
