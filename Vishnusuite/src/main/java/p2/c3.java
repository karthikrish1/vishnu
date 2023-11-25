package p2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c3 {
	

	@Test(groups="Two")
	public void t3()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://jqueryui.com/slider/");
		//horizontal slider: move along x axis, y value will be 0
		//vertical slideR: move along y axis, x value will be 0
		
		//webelements=> inside the frame
		// switch our control to that frame
		// index, name, id
		ob.switchTo().frame(0);
		WebElement ele = ob.findElementById("slider");
		Actions ac= new Actions(ob);
		ac.dragAndDropBy(ele, 50, 0).build().perform();
		ob.quit();
	}


}
