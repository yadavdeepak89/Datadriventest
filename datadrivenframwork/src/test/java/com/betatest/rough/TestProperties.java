package com.betatest.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.sun.jna.platform.win32.Netapi32Util.User;

public class TestProperties {
	
	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));
		Properties OR=new Properties();
		FileInputStream fis1 =new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
		OR.load(fis1);
		OR.getProperty("bmlBtn");
		System.out.println(OR.getProperty("bmlBtn"));
		Properties config = new Properties();//create the object of Properties file and import java.util.Properties pkg
		FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
		config.load(fis);
		System.out.println(config.getProperty("browser"));
		
		
	}

}
