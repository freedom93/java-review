package com.freedom.facade;

public class Computer {
	
	private CPU cpu;
	private Memory memory;
	private Disk disk;
	
	public Computer(){
		cpu = new CPU();
		memory = new Memory();
		disk = new Disk();
	}
	
	public void startup(){
		System.out.println("computer start");
		cpu.startup();
		memory.startup();
		disk.startup();
	}
	
	public void shutdown(){
		System.out.println("computer shutdown");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
	}

}
