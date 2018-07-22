package com.operation1;

public class MainClass extends OpenBrowser{

	
	public static void main(String[] args) throws InterruptedException
	{
		OpenBrowser OB=new OpenBrowser();
		
		EnterUrl EU=new EnterUrl();
		
		CreateAccountTestCase Create=new CreateAccountTestCase();
		EditAccountTestCase Edit=new EditAccountTestCase();
		
		//OB.browser();
		//EU.url();
		//Create.Createaccount();
		Edit.EditAccount();
	}
	
	
}
