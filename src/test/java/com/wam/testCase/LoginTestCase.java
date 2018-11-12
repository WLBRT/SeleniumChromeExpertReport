package com.wam.testCase;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.wam.Page.PageLogin;
import com.wam.SuperClase.SuperClaseChrome;
import com.wam.utilswam.Loggers;
import com.wam.utilswam.Screenshot;

public class LoginTestCase extends SuperClaseChrome {
	
	@Test(description="Validar inicio de sesión funcional", priority=1)
	public void LoginTC() throws IOException {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("IncioDeSesion.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test = extent.createTest("Incio de Sesion", "Inicar sesion");
		
		
		
		Screenshot.Shot(d, "PaginaDeInicio");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
//		BasicConfigurator.configure();
//		Logger log = Logger.getLogger(LoginTestCase.class);
//		PropertyConfigurator.configure("log4j.properties");
		
		PageLogin login = new PageLogin(d);
		test.log(Status.INFO,"Navigated to URL");
//		log.info("Abrir el navegador");
//		log.info("Maximiza la venta");
		
//		log.info("Se insertar UserName y Password");
		
		// log with snapshot
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		// test with snapshot
		test.addScreenCaptureFromPath("screenshot.png");

		// calling flush writes everything to the log file
		extent.flush();
		
		login.loginTo("Admin", "admin123");
	}

}
