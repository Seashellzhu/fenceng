package com.page;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.test.Login_test;
import com.util.Login_util;

public class Cunkun_page extends Login_util {
	Login_test login_test=new Login_test();
	
	//创建我要存款的元素查找方法
	public void cunkuan() throws Exception {
		login_test.login_test();
		driver.switchTo().frame("leftFrame");
		driver.findElement(By.xpath("/html/body/p[2]/a/img")).click();
		driver.switchTo().defaultContent();
        driver.switchTo().frame("mainFrame");
        Thread.sleep(3000);
        driver.findElement(By.id("smoneyValidate_money")).sendKeys("6000");
        driver.findElement(By.id("smoneyValidate_0")).click();
        Thread.sleep(3000);
	}
	
}
