package com.freedom.template1;

public class Plus extends AbstractCalculate {

	@Override
	public int calculate(int a, int b) {
		
		return a+b;
	}
	

	    public static void main(String[] args) {  
	        String exp = "8+8";  
	        AbstractCalculate cal = new Plus();  
	        int result = cal.calculate(exp, "\\+");  
	        System.out.println(result);  
	    }  


}
