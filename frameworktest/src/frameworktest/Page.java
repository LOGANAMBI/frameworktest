package frameworktest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

// Import package pageObject.*

import frameworktest.Home;

import frameworktest.Log;

public class Page {

private static WebDriver driver = null;

public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Balaji\\Downloads\\geckodriver-v0.21.0-win32\\geckodriver.exe");

driver = new FirefoxDriver();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("http://www.store.demoqa.com");

// Use page Object library now

Home.lnk_MyAccount(driver).click();

Log.txtbx_UserName(driver).sendKeys("testuser_1");

Log.txtbx_Password(driver).sendKeys("Test@123");

Log.btn_LogIn(driver).click();

System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

Home.lnk_LogOut(driver).click(); 

driver.quit();

}
}

