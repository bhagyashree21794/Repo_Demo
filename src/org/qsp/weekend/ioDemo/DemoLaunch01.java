package org.qsp.weekend.ioDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch01 {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		System.out.println("******");
	}

}
