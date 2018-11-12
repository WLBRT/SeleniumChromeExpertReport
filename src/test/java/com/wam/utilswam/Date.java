package com.wam.utilswam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
	public static String Dates() {
		DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		return date.format(now);
	}

}
