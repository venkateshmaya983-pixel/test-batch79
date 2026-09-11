package com.javaintroduction;

public class cricketer {

	static int countryid = 91;
	static String countryname = "india";
	int jerseynumber;
	String crictername = "mahendar singh dhoni";
	public static void main(String[] args)throws ClassNotFoundException{
		System.out.println("countryid:" +countryid);
		System.out.println("countryname:" +countryname);
		cricketer msd = new cricketer();
		System.out.println(msd.jerseynumber);
		System.out.println(msd.crictername);
		cricketer vk = new cricketer();
		 vk. jerseynumber = 18;
		 vk.crictername = "virat kohli";
			System.out.println(vk.jerseynumber);
			System.out.println(vk.crictername);
			Class.forName("java.lang.System");
			
		 

		

	}

}
