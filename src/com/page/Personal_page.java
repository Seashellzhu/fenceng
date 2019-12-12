package com.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.Login_test;
import com.util.Login_util;

@Test
public class Personal_page extends Login_util {
	Login_test login_test=new Login_test();
	public void personal_page() throws Exception {
		login_test.login_test();
		driver.switchTo().frame("leftFrame");
		driver.findElement(By.xpath("/html/body/p[5]/a/img")).click();
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("mainFrame");
	    WebElement table =driver.findElement(By.tagName("Table"));
	    List<WebElement> rows=table.findElements(By.tagName("tr"));
	    Assert.assertEquals(9, rows.size());
	    for(WebElement row:rows) {
	    	List<WebElement> cols=row.findElements(By.tagName("td"));
	    	for(WebElement col:cols) {
	    		System.out.print(col.getText()+"\t");
	    	}
	    	System.out.println("");
	    }
	    Thread.sleep(3000);
	    System.out.println("这是打印个人信息表格的测试用例");
	    
	}	

}
