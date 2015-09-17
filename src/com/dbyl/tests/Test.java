package com.dbyl.tests;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import org.testng.annotations.Listeners;

import com.dbyl.libarary.pageAction.HomePage;
import com.dbyl.libarary.pageAction.LoginPage;
import com.dbyl.libarary.utils.DriverFactory;
import com.dbyl.libarary.utils.Locator;
import com.dbyl.libarary.utils.PageFactory;
import com.dbyl.libarary.utils.TestNGListener;
import com.dbyl.libarary.utils.xmlUtils;
@Listeners({ TestNGListener.class })
public class Test {

	@org.testng.annotations.Test
	public  void myTest() throws Exception {
		LoginPage h = null;
		try {
			h = (LoginPage) PageFactory.getPage(LoginPage.class,
					DriverFactory.getChromeDriver());
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		h.typeEmailInputBox("TEst");
		h.typePasswordInputBox("TTTTT");
	}

}