package com.operation1;

public class MainClass extends OpenBrowser{

	
	public static void main(String[] args) throws InterruptedException
	{
		OpenBrowser OB=new OpenBrowser();
		
		EnterUrl EU=new EnterUrl();
		
		CreateAccountTestCase Acc=new CreateAccountTestCase();
		
		//OB.browser();
		//EU.url();
		Acc.Createaccount();
	}
	
	
}
