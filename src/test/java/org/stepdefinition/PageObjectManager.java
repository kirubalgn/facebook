package org.stepdefinition;

public class PageObjectManager {
	
	private PageObjectManager() {
		
	}
	
	private static PageObjectManager pageObjectManager;
	
	private LoginPojo loginPojo;

	public static PageObjectManager getPageObjectManager() {
		return (pageObjectManager==null)? pageObjectManager=new PageObjectManager():pageObjectManager;
	}

	public LoginPojo getLoginPojo() {
		return (loginPojo==null)? loginPojo = new LoginPojo():loginPojo;
	}

}
