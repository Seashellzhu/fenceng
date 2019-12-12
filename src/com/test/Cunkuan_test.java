package com.test;

import org.testng.annotations.Test;

import com.business.Cunkuan_business;
@Test
public class Cunkuan_test extends Cunkuan_business {
Cunkuan_business cunkuan_business=new Cunkuan_business();
public void cunkuanTest() throws Exception {
	cunkuan_business.cunkuan_business();
	System.out.println("-----------------这是存款测试用例--------------");
}
	
}
