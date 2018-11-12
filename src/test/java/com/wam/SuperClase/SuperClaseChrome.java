package com.wam.SuperClase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class SuperClaseChrome {
	public static WebDriver d;
	@Parameters({"url", "browserType"})
	@BeforeClass
	public static void preCondicion(String url,String browserType) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		d = new ChromeDriver();
//		d.get("https://opensource-demo.orangehrmlive.com/");
		d.get(url);
		d.manage().window().maximize();
	}
	
	@AfterClass
	public static void postCondicion() {
		d.quit();
	}

}
