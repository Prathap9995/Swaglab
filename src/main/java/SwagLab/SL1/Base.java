package SwagLab.SL1;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public Properties pro;
	
	public WebDriver initiatingdriver() throws IOException {
		Properties pro = new Properties();
		FileInputStream fil = new FileInputStream("C:\\Users\\Prathap\\eclipse-workspace\\Prathap\\Prathap.java\\CoreJava\\SL1\\src\\main\\java\\Resource\\Data.properties");
		pro.load(fil);
	String bname = 	pro.getProperty("Browser");
	System.out.println(bname);
	
	if(bname.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	}
	else {
		System.out.println("Error");
		
		
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}
	

}
