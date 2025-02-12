package com.celcom.day7;

interface Interface{
	void show();
}

public class InnerClassExample {
	
	//non static inner class
	class InnerClass{
		void myMethod() {
			System.out.println("Non static inner class");
		}
	}
	
	
	//static inner class
	
	static class StaticInnerClass{
		void myMethod2()
		{
			System.out.println("static inner class");
		}
	}
	
	void method() {
		
		
		//Local class
		class LocalInnerClass{
			
			void myMethod3() {
			
				System.out.println("local inner class");
			}
		}
		LocalInnerClass inner3= new LocalInnerClass();
		inner3.myMethod3();
	}

	
	public static void main(String[] args) {
		
		
		InnerClassExample obj = new InnerClassExample();
		InnerClass inner= obj.new InnerClass();
		inner.myMethod();
		
		
		InnerClassExample.StaticInnerClass inner2 = new InnerClassExample.StaticInnerClass();
		inner2.myMethod2();
		
		//anonymous inner class
		Interface inter = new Interface() {

			@Override
			public void show() {
				System.out.println("anonymous inner class");
				
			}
			
		};
		inter.show();
		
		//lambda expression
		
		Interface obj1 =()->System.out.println("Display");
		obj1.show();
		

	}

}
