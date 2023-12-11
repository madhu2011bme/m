package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;
	public ConfigurationReader() throws IOException {
		File f=new File("C:\\Users\\WELCOME\\eclipse-workspace\\AdactinCucumber\\src\\test\\java\\com\\properties\\adactin.properties");
		FileInputStream fis= new FileInputStream(f);
		p=new Properties();
		p.load(fis);
	}
	public String getBrowser() {
		String browser=p.getProperty("browser");
		return browser;
	}
	public String getUrl() {
		String url=p.getProperty("url");
		return url;
	}

}
