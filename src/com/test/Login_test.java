package com.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.business.Login_business;
import com.util.Login_util;

@Test
public class Login_test extends Login_util {
	Login_business test=new Login_business();
	public void login_test() throws Exception{
	test.login_business1();	
	System.out.println("-----------这是登录测试用例------------");
	}
	
}
