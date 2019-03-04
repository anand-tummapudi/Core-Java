package com.anand.java.practice;

interface TestInterface {
	public void method1();
}
public class AnonymounsInnerClassDemo {
	int x = 100;
	public void m2() {
		int y=30;
		// Replacing this with lambda expression.
		TestInterface t1 = new TestInterface() {
			int x = 200;
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				System.out.println("Inner:" + this.x);
			}
			
		};
		/*TestInterface t1 = ()->{
			int x = 400;
			System.out.println("Inside Lambda:"+this.x);
			System.out.println(y);
			
			
		};*/
		t1.method1();
	}
	public static void main(String args[]) {
		
		AnonymounsInnerClassDemo adm = new AnonymounsInnerClassDemo();
		adm.m2();
	}

}
