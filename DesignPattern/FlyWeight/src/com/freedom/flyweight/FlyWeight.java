package com.freedom.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeight {
	private Map<String, Object> map = new HashMap<String, Object>();
	public Object get(String key) {
	    if(map.containsKey(key)) {
	        return map.get(key);
	    }
	    Object obj = new Object();
	    map.put(key, obj);
	    return obj;
	}
	
	public static void main(String[] args) {
		FlyWeight fw = new FlyWeight();
		fw.map.put("test", "freedom");
		System.out.println(fw.get("test"));
	}
}
