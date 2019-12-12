package com.page;


import org.openqa.selenium.By;
//import org.testng.annotations.Test;

import com.util.Login_util;

public class Login_page extends Login_util {

	//������¼ҳ����˺�Ԫ�ض�λ����

  public void account() throws Exception{
	  driver.findElement(By.id("loginValidate_userNO")).sendKeys("1575771479529");
  }
	//������¼ҳ�������Ԫ�ض�λ����

  public void password() throws Exception {
	  driver.findElement(By.id("loginValidate_password")).sendKeys("123456");
  }


  public void click_confirm() throws Exception{
	  driver.findElement(By.id("loginValidate_0")).click();
	  Thread.sleep(3000);
  }		
}
