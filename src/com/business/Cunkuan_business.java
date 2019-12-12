package com.business;

import org.testng.annotations.Test;

import com.page.Cunkun_page;
import com.util.Login_util;

public class Cunkuan_business extends Login_util {
Cunkun_page cunkuan=new Cunkun_page();
public void cunkuan_business() throws Exception {
	cunkuan.cunkuan();
}
}
