package Hybrent3_4_0;

import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Receive_Orders {
	public AndroidDriver<WebElement> driver;
	 String po_no;
	
	@BeforeTest
	public void setUp_Device() throws Exception 
	{
		
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
	 driver = new AndroidDriver<WebElement> (new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	}
	
	
	public static String getAlphaNumericString(int n) 
   { 
 
       // chose a Character random from this String 
       String AlphaNumericString = "0123456789";
                                   
 
       // create StringBuffer size of AlphaNumericString 
       StringBuilder sb = new StringBuilder(n); 
 
       for (int i = 0; i < n; i++) 
       { 
 
           // generate a random number between 
           // 0 to AlphaNumericString variable length 
           int index 
               = (int)(AlphaNumericString.length() 
                       * Math.random()); 
 
           // add Character one by one in end of sb 
           sb.append(AlphaNumericString 
                         .charAt(index)); 
       } 
 
       return sb.toString(); 
   } 
 
	
	
	@Test(priority = 1)
	public void Login() throws InterruptedException 
	{
		WebElement sitename=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText\n" + 
				""));
		sitename.sendKeys("qa9.test");
		

		WebElement gobtn=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button"));
	    gobtn.click();
	    Thread.sleep(1500);
	 
	 
	 WebElement Username= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.widget.EditText"));
	 Username.sendKeys("haris");
	
	 WebElement Password=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText\n" + 
	 		""));
	 Password.sendKeys("goouser");
	 
	 WebElement Login=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.Button"));
	 Login.click();
	 Thread.sleep(1000);
	}
	
	
	
	@Test(priority = 2)
	public void Scan_In() throws InterruptedException 
	{
		
		//click menu
				WebElement menu_button=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\n" + 
				 		""));
				 menu_button.click();
			 Thread.sleep(1000);
			 
			 //click shop
			 WebElement menu_view=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View"));
				 
			 Dimension size = menu_view.getSize();
			    System.out.println(size.height+"height");
			    System.out.println(size.width+"width");
			     System.out.println(size);
			     int startPoint = (int) (size.height * 1);
			     int endPoint = (int) (size.height *0.3);
			     int ScreenPlace =(int) (size.width*0.5);  
			     TouchAction ts = new TouchAction(driver);
			  	 ts.press(PointOption.point(ScreenPlace,startPoint))
			   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
			   .moveTo(PointOption.point(ScreenPlace,endPoint)).release().perform();
			  	 
			  	WebElement scan_in=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View"));
				 scan_in.click();
				 Thread.sleep(1500);
				 
				 WebElement add_items=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button"));
				 add_items.click();
				 Thread.sleep(2000);
				 
				 ts.press(PointOption.point(1014,570))
			    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
			    .moveTo(PointOption.point(650,570)).release().perform();
				 
				 WebElement add_item=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]"));
				 add_item.click();
				 Thread.sleep(1000);
				 
				 WebElement select_inventory=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View"));
				 select_inventory.click();
				 Thread.sleep(1000);
				 
				 WebElement Final_select=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View/android.widget.Button\n" + 
				 		""));
				 Final_select.click();
				 Thread.sleep(1000);
				 
				 WebElement Add=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button[2]"));
				 Add.click();
				Thread.sleep(2000);
					 
				WebElement increase_qty=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[4]/android.view.View[2]/android.widget.Button\n" + 
					 		""));
				increase_qty.click();
				Thread.sleep(2000);
						 
				WebElement increase_qty1=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[4]/android.view.View[2]/android.widget.Button\n" + 
						 		""));
				increase_qty1.click();
				Thread.sleep(2000);
							 
							 
				WebElement complete= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button"));
				complete.click();
				Thread.sleep(2000);
				
				WebElement complete1= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button"));
				complete1.click();
				Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void Scan_out() throws InterruptedException 
	{
		
	 //click menu
	  WebElement menu_button=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button\n" + 
	  		""));
	 menu_button.click();
	 Thread.sleep(1000);
	  	 
	  	WebElement scan_out=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[4]/android.view.View"));
	  	scan_out.click();
		 Thread.sleep(2000);
		 
		 WebElement add_items=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button"));
		 add_items.click();
		 Thread.sleep(2000);
		 TouchAction ts = new TouchAction(driver);
		 ts.press(PointOption.point(1014,570))
	    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
	    .moveTo(PointOption.point(650,570)).release().perform();
		 Thread.sleep(1000);
		 
		 WebElement add_item=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]"));
		 add_item.click();
		 Thread.sleep(1000);
		 
		 WebElement select_inventory=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View"));
		 select_inventory.click();
		 Thread.sleep(1000);
		 
		 WebElement Final_select=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.Button\n" + 
		 		""));
		 Final_select.click();
		 Thread.sleep(1000);
		 
		 WebElement Add=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button[2]"));
		 Add.click();
		Thread.sleep(2000);
			 
		WebElement increase_qty=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[4]/android.view.View/android.view.View[6]/android.view.View[2]/android.widget.Button\n" + 
				""));
		increase_qty.click();
		Thread.sleep(2000);
				 
		WebElement increase_qty1=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[4]/android.view.View/android.view.View[6]/android.view.View[2]/android.widget.Button\n" + 
				""));
		increase_qty1.click();
		Thread.sleep(2000);
					 
					 
		WebElement complete= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button"));
		complete.click();
		Thread.sleep(2000);
		
		WebElement auto_attach= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]\n" + 
				""));
		auto_attach.click();
		Thread.sleep(2000);
		
		WebElement complete1= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button"));
		complete1.click();
		Thread.sleep(2000);
	}
	
	
	@Test(priority = 4)
	public void Item_added_in_cart() throws InterruptedException 
	{
	 
	 //click menu
	 WebElement menu_button=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\n" + 
	 		""));
	 menu_button.click();
	 
	 WebElement menu_view=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View"));
	 
	 Dimension size1 = menu_view.getSize();
	    System.out.println(size1.height+"height");
	    System.out.println(size1.width+"width");
	     System.out.println(size1);
	     int startPoint1 = (int) (size1.height * 0.3);
	     int endPoint1 = (int) (size1.height *1);
	     int ScreenPlace1 =(int) (size1.width*0.5);  
	     TouchAction ts1 = new TouchAction(driver);
	  	 ts1.press(PointOption.point(ScreenPlace1,startPoint1))
	   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
	   .moveTo(PointOption.point(ScreenPlace1,endPoint1)).release().perform();
	  	Thread.sleep(1000);
	 
	 //click shop
	 WebElement click_Shop=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View\n" + 
	 		""));
	 click_Shop.click();
	 Thread.sleep(4000);
	 ts1.press(PointOption.point(1000,617))
   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
   .moveTo(PointOption.point(450,617)).release().perform();
	 
	WebElement add_to_cart= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[2]\n" + 
	 		""));
	 add_to_cart.click();
	 Thread.sleep(1500);
	 
	 WebElement add_to_cart1= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]\n" + 
	 		""));
	 add_to_cart1.click();
	 Thread.sleep(1000);
	  
	 WebElement add_to_cart2= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]\n" + 
	 		""));
	 add_to_cart2.click();
	 Thread.sleep(500);
	 
	 WebElement add_to_cart3= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View[9]/android.widget.Button[2]"));
		 add_to_cart3.click();
		 Thread.sleep(500);
		 
		  WebElement add_to_cart4= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View[9]/android.widget.Button[2]"));
		 add_to_cart4.click();
		 Thread.sleep(2000);
		 
	 }
	 
	@Test(priority = 5)
	public void Create_Order() throws InterruptedException 
	{
	 
		 WebElement clk_add_to_cart= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]\n" + 
		 		""));
		 clk_add_to_cart.click();
		 Thread.sleep(500);
		 
		 WebElement use_my_po_= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[4]/android.widget.ListView/android.view.View[5]/android.view.View[2]/android.view.View/android.view.View\n" + 
		 		""));
		 use_my_po_.click();
			 Thread.sleep(500);
			 
			 
			 WebElement enter_orderno_= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[4]/android.widget.ListView/android.view.View[6]/android.widget.EditText"));
			 po_no="AutoPO"+Orders.getAlphaNumericString(5);
			 enter_orderno_.sendKeys(po_no);
			 
			 WebElement generate_po_= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Button\n" + 
			 		""));
			 generate_po_.click();
			 Thread.sleep(500);
			 
			 WebElement sure_generate_po_= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]"));
			 sure_generate_po_.click();
				 Thread.sleep(500);
				 
				 
			WebElement min_po_value= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]"));
			min_po_value.click();
			Thread.sleep(500);
					 
			WebElement po_delay= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]"));
			po_delay.click();
						 Thread.sleep(2000);
						 
			WebElement remaining_budget= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]\n" + 
					""));
			remaining_budget.click();
			Thread.sleep(2000);
						
	 
	}
	
	@Test(priority = 6)
	public void Verify_Order() throws InterruptedException   
	{
		
		WebElement menu_button=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.Button"));
		 menu_button.click();
		 Thread.sleep(2000);
		 
		 WebElement Verify_Order=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText\n" + 
		 		""));
		 Verify_Order.sendKeys(po_no);
		 Thread.sleep(2000);
		 
		 WebElement Click_Verify_Order=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View\n" + 
		 		""));
		 Click_Verify_Order.click();			 
		 Thread.sleep(3500);
		 
		 /*
		 TouchAction ts = new TouchAction(driver);
		 ts.press(PointOption.point(600,600))
		    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		    .moveTo(PointOption.point(600,1250)).release().perform();
		 Thread.sleep(1500);
		*/ 
	    }
	   	
	@Test(priority = 7)
		public void Approve_Order() throws InterruptedException 
		{
	    WebElement Approve_Order=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button"));
	    Approve_Order.click();
		Thread.sleep(2000);
		
		  WebElement ramaning_budget=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]"));
		  ramaning_budget.click();
			Thread.sleep(7000);
		}
		
	@Test(priority = 8)
		public void Recieve_Order() throws InterruptedException  
		{
		 
		WebElement menu_button=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.Button"));
		 menu_button.click();
		 Thread.sleep(2000);
			 
			 //click shop
		 WebElement click_receive=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[8]/android.view.View\n" + 
		 		""));
		 click_receive.click();
		 Thread.sleep(1000);
		 
		 WebElement Search_Order=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText"));
		 Search_Order.sendKeys(po_no);
		 Thread.sleep(1000);
		 
		 WebElement Click_Order=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View\n" + 
		 		""));
		 Click_Order.click();
		 Thread.sleep(1000);
		 
		 WebElement Receive_Order=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[1]\n" + 
		 		""));
		 Receive_Order.click();
		 Thread.sleep(1000);
		 
		 WebElement Clk_fill_qty=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button"));
		 Clk_fill_qty.click();
		 Thread.sleep(1000);	
		 
		 WebElement fill_all_qty=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[1]\n" + 
		 		""));
		 fill_all_qty.click();
		 Thread.sleep(1000);
		 
		 WebElement Action=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button\n" + 
		 		""));
		 Action.click();
		 Thread.sleep(1000);
		 
		 WebElement Complete=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[1]\n" + 
		 		""));
		 Complete.click();
		 Thread.sleep(4500);
		 
		} 
	
}
