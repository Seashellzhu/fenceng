package com.page;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.test.Login_test;
import com.util.Login_util;
public class Qukuan_page extends Login_util{
	Login_test login_test=new Login_test();
	@Test
	public void qukuan() throws Exception {
		login_test.login_test();
		driver.switchTo().frame("leftFrame");
		driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();//跳转到默认页面
		driver.switchTo().frame("mainFrame");
		Thread.sleep(3000);
		driver.findElement(By.id("fmoneyValidate_money")).sendKeys("2000");
		driver.findElement(By.id("fmoneyValidate_0")).click();
		Thread.sleep(3000);
		
	}


}
