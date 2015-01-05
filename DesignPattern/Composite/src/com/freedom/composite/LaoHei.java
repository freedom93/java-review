package com.freedom.composite;

import java.util.Enumeration;

public class LaoHei {

	HeiErDai root = null;
	static String name = null;
	
	public LaoHei(String name){
		root = new HeiErDai(name);
		this.name = name;
		
	}
	
	//输出各个节点
	public void printNode(Enumeration<HeiErDai> elements){
			
	for(; elements.hasMoreElements();)
				System.out.println(elements.nextElement().getName());
				
				
	}
		
	public static void main(String[] args) {

		LaoHei tree = new LaoHei("老黑");
		HeiErDai oldSon = new HeiErDai("oldSon是大黑……");
		HeiErDai youngSon = new HeiErDai("youngSon是二黑……");
		
		oldSon.add(youngSon);
		tree.root.add(oldSon);
		
		System.out.println("build the tree of "+name+"'s family:");
		Enumeration<HeiErDai> e = tree.root.getChildren();
		tree.printNode(e);
		Enumeration<HeiErDai> e2 = tree.root.getChildren();
		tree.printNode(e2.nextElement().getChildren());
		
	}

}
