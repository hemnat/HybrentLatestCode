package Hybrent4_0_0rc1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Verify_Shortcuts 
{
	@Test(priority = 2)
	 public void Verify_shortcuts_Click_Shop() throws InterruptedException 
	 {
		Thread.sleep(6000);
		WebDriverWait menu=new WebDriverWait(Login.driver, 40);
		 WebElement menu_button=  menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
		 menu_button.click();
		 Thread.sleep(2000);
		 //click Home
	    WebElement click_Home=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]\n" + 
			""));
	    click_Home.click();
	    Thread.sleep(1000);
	    WebElement click_Shop=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]"));
	    click_Shop.click();
	    Thread.sleep(2500);
	 }
	 @Test(priority = 3)
	public void Click_Bill_and_Replace() throws InterruptedException 
	{
	    //click Bill and Replace
	     WebElement menu_button=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\n" + 
	    		 		""));
	     menu_button.click();   
	    		 
	     WebElement click_Home=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]\n" + 
	    				""));
	     click_Home.click();
	     Thread.sleep(1000);
		 WebElement click_BandR=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]"));
		 click_BandR.click();
		 Thread.sleep(2000);
	 }
	 @Test(priority = 4)
	 public void Click_Replenish_Bin() throws InterruptedException 
	 {
	   //click replenish Bin
		 WebElement menu_button=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\n" + 
			 		""));
	menu_button.click();   
			 
	WebElement click_Home=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]\n" + 
					""));
	click_Home.click();
	Thread.sleep(1000);
		 WebElement click_replenish_bin=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]\n" + 
		 		""));
		 click_replenish_bin.click();
		 WebElement click_cancel_bin=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Button\n" + 
			 		""));
			 click_cancel_bin.click();
			 Thread.sleep(2000);
	 }
	 @Test(priority = 5)
	 public void Click_Orders() throws InterruptedException 
	 {
	 
		//click Orders
		 WebElement menu_button=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\n" + 
			 		""));
	     menu_button.click();   
			 
	     WebElement click_Home=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]\n" + 
					""));
	     click_Home.click();
		 Thread.sleep(1000);
		 WebElement click_Orders=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]"));
		 click_Orders.click();
		 Thread.sleep(2000);
	 }
	 
	@Test(priority = 6)
	public void Click_Approve_PO() throws InterruptedException 
		 {
		//Approve PO
		WebElement menu_button=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\n" + 
		 		""));
	    menu_button.click();   
		 
	    WebElement click_Home=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]\n" + 
				""));
	     click_Home.click();
		 Thread.sleep(2000);
		 WebElement click_Approve_po=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[5]"));
		 click_Approve_po.click();
		 Thread.sleep(2000);
		 }
	@Test(priority = 7)
	public void Click_Recieve() throws InterruptedException 
		 {		 
		//Recieve
		 WebElement menu_button=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\n" + 
		 		""));
	     menu_button.click(); 
	     Thread.sleep(1000);
		 
	     WebElement click_Home=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]\n" + 
				""));
	     click_Home.click();
	     Thread.sleep(1000);	  
	     WebElement click_Receieve=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[6]"));
	     click_Receieve.click();
		  Thread.sleep(2000);
		 }
	@Test(priority = 8)
	public void Click_Shipment() throws InterruptedException 
		 {		 
		 //click Shipment
		WebElement menu_button=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\n" + 
		 		""));
	     menu_button.click();   
		 
	     WebElement click_Home=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]\n" + 
				""));
	     click_Home.click();
	     Thread.sleep(1000);
		 WebElement click_Shipment=Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[7]"));
		 click_Shipment.click();
		 Thread.sleep(2000);
		 }

	@Test(priority = 9)
	public void Click_Invoice() throws InterruptedException 
		 { 
		 //click Invoice
		 WebElement menu_button=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\n" + 
		 		""));
	     menu_button.click();   
		 
	     WebElement click_Home=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]\n" + 
				""));
	     click_Home.click();
	     Thread.sleep(1000);
		 WebElement menu_view=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View"));
		 Dimension size = menu_view.getSize();
		    System.out.println(size.height+"height");
		    System.out.println(size.width+"width");
		     System.out.println(size);
		     int startPoint = (int) (size.height * 1);
		     int endPoint = (int) (size.height *0.3);
		     int ScreenPlace =(int) (size.width*0.5);  
		   	  TouchAction ts = new TouchAction(Login.driver);
		  	 ts.press(PointOption.point(ScreenPlace,startPoint))
		   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		   .moveTo(PointOption.point(ScreenPlace,endPoint)).release().perform();
		 WebElement click_Invoice=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]"));
		 click_Invoice.click();
		 Thread.sleep(1000);
		 }
	@Test(priority = 17)
	public void Click_Templates() throws InterruptedException 
		 {  
		 //click Templates
		WebElement menu_button=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\n" + 
		 		""));
	     menu_button.click();   
		 
	     WebElement click_Home=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]\n" + 
				""));
	     click_Home.click();
	     Thread.sleep(1000);
	     WebElement menu_view=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View"));
		 Dimension size = menu_view.getSize();
		    System.out.println(size.height+"height");
		    System.out.println(size.width+"width");
		     System.out.println(size);
		     int startPoint = (int) (size.height * 1);
		     int endPoint = (int) (size.height *0.3);
		     int ScreenPlace =(int) (size.width*0.5);  
		   	  TouchAction ts = new TouchAction(Login.driver);
		  	 ts.press(PointOption.point(ScreenPlace,startPoint))
		   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		   .moveTo(PointOption.point(ScreenPlace,endPoint)).release().perform();
		 WebElement click_Templates=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]"));
		 click_Templates.click();
		 Thread.sleep(1000);
		 }
	@Test(priority = 10)
		 public void Click_Scan_in() throws InterruptedException 
		 	 {  
		 //click Scan-in
		WebElement menu_button=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\n" + 
				 		""));
		 menu_button.click();
		 Thread.sleep(1000);
		 WebElement click_Home=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]\n" + 
					""));
		 click_Home.click();
		 Thread.sleep(1000);
		 WebElement menu_view=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View"));
		 Dimension size = menu_view.getSize();
		    System.out.println(size.height+"height");
		    System.out.println(size.width+"width");
		     System.out.println(size);
		     int startPoint = (int) (size.height * 1);
		     int endPoint = (int) (size.height *0.3);
		     int ScreenPlace =(int) (size.width*0.5);  
		   	  TouchAction ts = new TouchAction(Login.driver);
		  	 ts.press(PointOption.point(ScreenPlace,startPoint))
		   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		   .moveTo(PointOption.point(ScreenPlace,endPoint)).release().perform();
		 WebElement click_Scan_in=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]"));
		 click_Scan_in.click();
		 Thread.sleep(1000);
		 	 }
	@Test(priority = 11)
	public void Click_Scan_out() throws InterruptedException 
		 {   
		 
		 //click Scan-out
		WebElement menu_button=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\n" + 
		 		""));
	   menu_button.click();
	  Thread.sleep(1000);
	  WebElement click_Home=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]\n" + 
			""));
	  click_Home.click();
	  Thread.sleep(1000);
		 WebElement menu_view=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View"));
		 Dimension size = menu_view.getSize();
		    System.out.println(size.height+"height");
		    System.out.println(size.width+"width");
		     System.out.println(size);
		     int startPoint = (int) (size.height * 1);
		     int endPoint = (int) (size.height *0.3);
		     int ScreenPlace =(int) (size.width*0.5);  
		   	  TouchAction ts = new TouchAction(Login.driver);
		  	 ts.press(PointOption.point(ScreenPlace,startPoint))
		   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		   .moveTo(PointOption.point(ScreenPlace,endPoint)).release().perform();
		 WebElement click_Scan_out=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[5]"));
		 click_Scan_out.click();
		 Thread.sleep(1000);
		 
		 }
	@Test(priority = 12)
	public void Click_Charge_Resident() throws InterruptedException 
		 {   	 
		 //click Charge Resident
		WebElement menu_button=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\n" + 
		 		""));
	    menu_button.click();
	    Thread.sleep(1000);
	    WebElement click_Home=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]\n" + 
			""));
	  click_Home.click();
	  Thread.sleep(1000);
		 WebElement menu_view=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View"));
		 Dimension size = menu_view.getSize();
		    System.out.println(size.height+"height");
		    System.out.println(size.width+"width");
		     System.out.println(size);
		     int startPoint = (int) (size.height * 1);
		     int endPoint = (int) (size.height *0.3);
		     int ScreenPlace =(int) (size.width*0.5);  
		   	  TouchAction ts = new TouchAction(Login.driver);
		  	 ts.press(PointOption.point(ScreenPlace,startPoint))
		   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		   .moveTo(PointOption.point(ScreenPlace,endPoint)).release().perform();
		 WebElement click_Charge_Resident=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[6]"));
		 click_Charge_Resident.click();
		 Thread.sleep(1000);
	}
		
	@Test(priority = 13)
	public void Inventory_Recieve() throws InterruptedException 
		 {  
		WebElement menu_button=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\n" + 
		 		""));
	    menu_button.click();
	    Thread.sleep(1000);
	    WebElement click_Home=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]\n" + 
			""));
	    click_Home.click();
	    Thread.sleep(1000);
		 WebElement menu_view=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View"));
		 Dimension size = menu_view.getSize();
		    System.out.println(size.height+"height");
		    System.out.println(size.width+"width");
		     System.out.println(size);
		     int startPoint = (int) (size.height * 1);
		     int endPoint = (int) (size.height *0.3);
		     int ScreenPlace =(int) (size.width*0.5);  
		   	  TouchAction ts = new TouchAction(Login.driver);
		  	 ts.press(PointOption.point(ScreenPlace,startPoint))
		   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		   .moveTo(PointOption.point(ScreenPlace,endPoint)).release().perform();
		 WebElement click_Inventory_Receive=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[7]"));
		 click_Inventory_Receive.click();
		 Thread.sleep(1000);
		}
		 
}

