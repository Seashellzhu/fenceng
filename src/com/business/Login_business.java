package com.business;

//import org.testng.annotations.Test;

import com.page.Login_page;
import com.util.Login_util;

public class Login_business extends Login_util{
public void login_business1() throws Exception{
	Login_page page=new Login_page();
	page.account();
	page.password();
	page.click_confirm();
}
}
