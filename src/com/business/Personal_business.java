package com.business;

import org.testng.annotations.Test;

import com.page.Personal_page;
import com.util.Login_util;
public class Personal_business extends Login_util {
	Personal_page personal_page=new Personal_page();
	public void personal_business() throws Exception {
		personal_page.personal_page();
		
	}

}
