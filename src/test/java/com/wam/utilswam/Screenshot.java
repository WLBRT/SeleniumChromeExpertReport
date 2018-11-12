package com.wam.utilswam;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	public static void Shot(WebDriver d, String nombreCaptura) {
		try {
			TakesScreenshot cp = (TakesScreenshot) d;
			File source = cp.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshot/" + nombreCaptura + ".png"));
			System.out.println(Date.Dates()+ " Captura Exitosa,  Screenshot/"+ nombreCaptura +".png");
		} catch (Exception e) {
			System.out.println(Date.Dates()+ " Excepción al intentar Capturar: " + e.getMessage());
		}
	}
}
