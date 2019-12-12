package com.test;

import org.testng.annotations.Test;

import com.business.Qukuan_business;
import com.util.Login_util;

public class Qukuan_test extends Login_util {
Qukuan_business qukuan_business=new Qukuan_business();
@Test
public void qukuan_test() throws Exception {
	qukuan_business.qubkuan_business();
	System.out.println("--------------这是取款测试用例------------");
}
}
