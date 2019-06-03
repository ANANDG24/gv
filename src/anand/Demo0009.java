package anand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo0009 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:hotel.html");
		 WebElement mtr = driver.findElement(By.id("mtr"));
		 Select mtrselect=new Select(mtr);
		 mtrselect.selectByIndex(1);
		 mtrselect.selectByValue("v");
		 mtrselect.selectByVisibleText("dosa");
		 boolean v = mtrselect.isMultiple();
		 System.out.println(v);
		
	}

}
