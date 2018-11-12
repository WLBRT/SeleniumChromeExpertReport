package com.wam.utilswam;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;

public class Loggers {
	public static Object Logs(String msjInfo) {
	BasicConfigurator.configure();
//	Logger log = Logger.getLogger(LoginTestCase.class);
	PropertyConfigurator.configure("log4j.properties");
	return Loggers.Logs(msjInfo);
	
	}


}
