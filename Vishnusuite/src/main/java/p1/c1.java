package p1;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c1 {
	
	@Test(groups="One")
	public void t1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		
		Set<Cookie> c = ob.manage().getCookies();
		System.out.println("Number of cookies "+ c.size());
		
		ob.manage().deleteAllCookies();
		
		Set<Cookie> c1 = ob.manage().getCookies();
		System.out.println("Number of cookies after deletion "+ c1.size());
		ob.quit();
	}

}
