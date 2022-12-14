package Hybrent4_1rc1;


import static org.testng.AssertJUnit.assertEquals;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;


@Test public class Login
{
	static AndroidDriver driver;
	static WebElement sitename;
	static WebElement gobtn;
	static WebElement Alert_Ok;
	static WebElement Username;
	static WebElement Password;
	static WebElement Login;
	static String actual;
	static String expected;
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void setUp_Device() throws Exception 
	{
		Reporter.log("=====Session Started=====", true);
	 // Created object of DesiredCapabilities class.
		//ChromeOptions chromeOptions = new ChromeOptions();
	 DesiredCapabilities capabilities = new DesiredCapabilities();
	 // Set android deviceName desired capability. Set your device name.
	 capabilities.setCapability("deviceName", "ZY2242XGM3");
	 
	 // Set android VERSION desired capability. Set your mobile device's OS version.
	 capabilities.setCapability(CapabilityType.VERSION, "8.1.0");

	 // Set android platformName desired capability. It's Android in our case here.
	 capabilities.setCapability("platformName", "Android");
	 
	 //capabilities.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);
	 //capabilities.setCapability( "chromedriverExecutable", "D://hromedriver_win32 (2)//chromedriver.exe");
	
	 
	 // Set your application's appPackage 
	 capabilities.setCapability("appPackage", "com.hybrent.hybrent");
	
	 // Set android appActivity desired capability.
	 capabilities.setCapability("appActivity", "com.hybrent.hybrent.MainActivity");
	 
	 // Set skipUnlock to true
	 capabilities.setCapability("skipUnlock", true);
	 
	 // Created object of RemoteWebDriver will all set capabilities.
	 // Set appium server address and port number in URL string.
	 driver = new AndroidDriver (new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 Reporter.log("=====Session has been Started Sucessfully=====", true);
	 
	}
	@Test(priority = 1)
	public void VerifyWithBlankSiteNameEnter() throws InterruptedException 
	{
		Thread.sleep(6000);
		Reporter.log("=====Login Session Started=====", true);
		WebDriverWait site= new WebDriverWait(driver,Duration.ofSeconds(100));
		sitename= site.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText")));
		gobtn=  site.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")));
	    gobtn.click();
	    Thread.sleep(6000);
	    Alert_Ok=  site.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button\n" + 
	    		"")));
	   WebElement Get_Alert=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView\n" + 
	    		""));
	    String Get_Alert_Value= Get_Alert.getText();
	    //SoftAssert softAssertion= new SoftAssert();
	    //Assertion.assertEquals(Get_Alert_Value, "Please enter site nam");
	    assertEquals(Get_Alert_Value, "Please enter site name");
	    Alert_Ok.click();
	    
   }
	@Test(priority = 2)
	public void VerifyWithInvalidSiteNameEnter() throws InterruptedException 
	{
		Thread.sleep(2000);
		sitename.sendKeys("invalidsitename");
	    gobtn.click();
	    Thread.sleep(2000);
	    Alert_Ok=  driver.findElement((By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button\n" + 
	    		"")));
	    Thread.sleep(2000);
	    WebElement Get_Alert=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView\n" + 
	    		""));
	    String Get_Alert_Value= Get_Alert.getText();
	    assertEquals(Get_Alert_Value, "Invalid site name");
	    Alert_Ok.click();
	    sitename.clear();
	
	}
	@Test(priority = 3)
	public void VerifyWithValidSiteNameEnter() throws InterruptedException 
	{
		Thread.sleep(2000);
		sitename.sendKeys("release40.rd");
	    gobtn.click();
	    Thread.sleep(5000);
	    WebElement Get_Alert=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View\n" + 
	    		""));
	    String Get_Alert_Value= Get_Alert.getText();
	    assertEquals(Get_Alert_Value, "User Name");
	}
	@Test(priority = 4)
	public void LoginWithBlankCrednetials() throws InterruptedException 
	{    
		
	 WebDriverWait Login_page=new WebDriverWait(driver,Duration.ofSeconds(40)); ;
	 Username= Login_page.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.widget.EditText")));
	 Username.clear();
	
	 Password=  Login_page.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText\n" + 
	 		"")));
	 Username.clear();
	 
	 WebElement outsideClick=  Login_page.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Image")));
	 outsideClick.click();
	 Thread.sleep(3000);
	 
	 
	  Login=  Login_page.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.Button")));
	 Login.click();
	 Thread.sleep(3000);
	 Alert_Ok=  Login_page.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")));
	   WebElement Get_Alert=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView[2]\n" + 
	   		""));
	 String Get_Alert_Value= Get_Alert.getText();
	 assertEquals(Get_Alert_Value, "User cannot be blank. Password cannot be blank.");
	 Alert_Ok.click();
	 Thread.sleep(3000);
	 }
	
	@Test(priority = 5)
	public void LoginWithInvalidCrednetials() throws InterruptedException 
	{   
	 Thread.sleep(2000);
	 Username.sendKeys("test");
	 Password.sendKeys("test");
	 Login.click();
	 Thread.sleep(3000);
	 Alert_Ok=  driver.findElement((By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")));
	 WebElement Get_Alert=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView[2]\n" + 
	 		""));
    String Get_Alert_Value= Get_Alert.getText();
	assertEquals(Get_Alert_Value, "Invalid user name.");
    Alert_Ok.click();
	Thread.sleep(3000);
}
	@Test(priority = 6)
	public void LoginWithValidCrednetials() throws InterruptedException 
	{   
		Thread.sleep(2000);
		 Username.clear();
		 Password.clear();
	 Username.sendKeys("hemant");
	 Password.sendKeys("goouser");
	 Thread.sleep(3000);
	 Login.click();
	 Thread.sleep(7000);
	 try
	 {
		 WebElement Get_Text=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView\n" + 
			 		""));
			 String Get_Alert_Value= Get_Text.getText();
				assertEquals(Get_Alert_Value, "Daily Dash");
	 
	 }
	 catch (Exception e) 
	 {
		 WebElement Get_Text=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView\n" + 
		 		""));
		 String Get_Alert_Value= Get_Text.getText();
			assertEquals(Get_Alert_Value, "Daily Dash");
		
	}
    
	 
	 }
}
