package com.javaintroduction;

public class datatypes3 {
	byte b = 127;
	byte b1 = (byte) 128;
    short s = 32567;
    short s1 = (short)3256790;
    int A = 98765443;
    int A1 = (int) 98328789333D;
    long l = 9223372036854775807L;
    Double d = 56738298637D;
    float f = 12.2f;
    char name = 'A';
    boolean boo = true;
    boolean boo1 = false;
    

	public static void main(String[] args) {
		datatypes3 dt = new datatypes3();
		System.out.println(dt.b);
		System.out.println(dt.b1);
		System.out.println(dt.s);
		System.out.println(dt.s1);
		System.out.println(dt.A);
		System.out.println(dt.A1);
		System.out.println(dt.l);
		System.out.println(dt.d);
		System.out.println(dt.f);
		System.out.println(dt.name);

		if(dt.boo1) {
			System.out.println("good morning");
		}
		System.out.println(dt.name);
		System.out.println(dt.name);
		
			
		

	}

}
