package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class facebook {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "https://www.google.com.tr/");
		selenium.start();
	}

	@Test
	public void testFacebook() throws Exception {
		selenium.open("http://www.facebook.com");
		selenium.waitForPageToLoad("");
		selenium.type("email", "yesil.tugba.ktu@gmail.com");
		selenium.type("pass", "3261130_tubi");
		selenium.click("id=u_0_l");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
