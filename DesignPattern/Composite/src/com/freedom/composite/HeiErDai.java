package com.freedom.composite;

import java.util.Enumeration;
import java.util.Vector;

public class HeiErDai {
	
	private String name;
	private HeiErDai parent;
	private Vector<HeiErDai> children = new Vector<HeiErDai>();
	
	public HeiErDai(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HeiErDai getParent() {
		return parent;
	}
	public void setParent(HeiErDai parent) {
		this.parent = parent;
	}
	
	//添加孩子节点
	public void add(HeiErDai node){
		children.add(node);
	}
	
	//删除孩子节点
	public void remove(HeiErDai node){
		children.remove(node);
	}
	
	//取得孩子节点
	public Enumeration<HeiErDai> getChildren(){
		return children.elements();
	}
	
	

}
