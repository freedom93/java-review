package com.freedom.adapter2;


import org.junit.Test;

public class TestAdapter {

	//类的适配器模式
	@Test
	public void test() {

		Targetable tt = new Adapter();
		tt.method1();
		tt.method2();
	}
	
	
	//对象的适配器模式
	@Test
	public void test2() {

		Source source = new Source();
		Targetable tt = new Wrapper(source);
		tt.method1();
		tt.method2();
	}
	
	//接口的适配器模式
		@Test
		public void test3() {
			
			SourceMethod1 source1 = new SourceMethod1();
			SourceMethod2 source2 = new SourceMethod2();
			
			source1.method1();
			source1.method2();
			source2.method1();
			source2.method2();

			
		}

}
