package com.test;

import org.testng.annotations.Test;

import com.business.Personal_business;
import com.util.Login_util;
public class Personal_test extends Login_util {
  Personal_business personal_business=new Personal_business();
 @Test
  public void personal_test() throws Exception {
	  personal_business.personal_business();
		System.out.println("----------这是个人信息打印测试用例-----------");
  }
}
