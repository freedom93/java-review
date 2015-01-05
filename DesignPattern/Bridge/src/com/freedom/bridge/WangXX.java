package com.freedom.bridge;

public class WangXX {

	public static void main(String[] args) {
		System.out.println("王XX视察袜子公司：");
		SocksComputer sc = new SocksComputer();
		sc.makeMoney();
		
		System.out.println("\n王XX视察手套公司：");
		GlovesComputer gc = new GlovesComputer();
		gc.makeMoney();
		
		System.out.println("\n王XX视察围巾公司：");
		ScarfComputer scc = new ScarfComputer();
		scc.makeMoney();

		System.out.println("\n王XX视察围巾公司转型成小短裙后的情况：");
		ScarfComputerToSkirts scts = new ScarfComputerToSkirts(new Skirts());
		scts.makeMoney();
	}

}
