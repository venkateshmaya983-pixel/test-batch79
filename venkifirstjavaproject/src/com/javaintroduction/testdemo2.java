package com.javaintroduction;

class A{
	B b;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalise called");
	}
}
class B{
	A a;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalise called");
	}
}
public class testdemo2 {
	void cricket() {
		System.out.println("virat kohli");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalise called");
	}
	

	public static void main(String[] args) {
		testdemo2 vk = new testdemo2();
		System.out.println(vk);
		System.out.println(vk.hashCode());
		vk =null;
		testdemo2 obj1 = new testdemo2();
		testdemo2 obj2 = new testdemo2();
		obj1 = obj2;
		A obj3 = new A();
		B obj4 = new B();
		obj3 = null;
		
	
		
		System.gc();
		

	}

}
