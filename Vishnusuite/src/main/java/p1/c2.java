package p1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c2 {


	@Test(groups="One")
	public void t2() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://www.letskodeit.com/practice");
		ob.findElementById("bmwcheck").click();
		Thread.sleep(3000);
		ob.findElementById("benzcheck").click();
		Thread.sleep(3000);
		ob.findElementById("hondacheck").click();
		Thread.sleep(3000);
		File f = ob.getScreenshotAs(OutputType.FILE);
		//FileUtils => apache directory studio common io
		FileUtils.copyFile(f, new File("C:\\Users\\hp\\eclipse-workspace\\Vishnusuite\\src\\main\\java\\p1\\vihsnu.png"));
		ob.quit();
	}

}
