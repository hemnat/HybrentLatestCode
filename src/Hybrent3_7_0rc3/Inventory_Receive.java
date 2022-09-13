package Hybrent3_7_0rc3;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Inventory_Receive 
{
	
	static int endPoint11;
	static int ScreenPlace11;
	static int startPoint11;
	@SuppressWarnings("rawtypes")
	@Test(priority = 48)
	public void VerifyInventoryRecieveButtonTap() throws InterruptedException 
	{	
	 //click menu
		Thread.sleep(5000);
		WebDriverWait menu= new WebDriverWait(Login.driver, 30);
		try {
		     WebElement menu_button=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
		     menu_button.click();
		}
		catch (Exception e) 
		{
			WebElement menu_button=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")));
		     menu_button.click();
		}
		WebElement menu_view=  menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View"))); 
		 
		 Dimension size11 = menu_view.getSize();
		    System.out.println(size11.height+"height");
		    System.out.println(size11.width+"width");
		     System.out.println(size11);
		      startPoint11 = (int) (size11.height * 0.7);
		      endPoint11 = (int) (size11.height *0.1);
		      ScreenPlace11 =(int) (size11.width*0.5);  
		   	  TouchAction ts11 = new TouchAction(Login.driver);
		  	 ts11.press(PointOption.point(ScreenPlace11,startPoint11))
		   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
		   .moveTo(PointOption.point(ScreenPlace11,endPoint11)).release().perform();   
		
	  	WebDriverWait inv_rcv= new WebDriverWait(Login.driver, 30);
	  	try
	  	{
	  	WebElement Click_Inventory_Recieve=  inv_rcv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View\n" + 
	  			"")));
	  	Click_Inventory_Recieve.click();
	  	Thread.sleep(8000);
	  	Reporter.log("=====Inventory Receive Started sucessfully=====", true);
	  	}
	  	catch (Exception e)
	  	{
	  		WebElement Click_Inventory_Recieve=  inv_rcv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View\n" + 
		  			"")));
		  	Click_Inventory_Recieve.click();
		  	Thread.sleep(8000);
		    Reporter.log("=====Inventory Receive Started sucessfully=====", true);
		}
	  	try
	  	{
	  	 	WebElement InvRcv_get= inv_rcv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]\n" + 
	  	 			"")));
		 	String InvRcv_text= InvRcv_get.getText();
		 	assertEquals(InvRcv_text, "Inventory Transfer Notes");
	  	}
	  	catch (Exception e) 
	  	{
	  		WebElement InvRcv_get= inv_rcv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]\n" + 
		  			"")));
		 	String InvRcv_text= InvRcv_get.getText();
		 	assertEquals(InvRcv_text, "Inventory Transfer Notes");
		}
	  	
	  	
	}
		 
	@Test(priority = 49)
	public void VerifyCompleteInventoryRecieve() throws InterruptedException 
			{
		WebDriverWait inv_rcv1= new WebDriverWait(Login.driver, 30);
		 WebElement click_record=  inv_rcv1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]\n" + 
		 		"")));
		 click_record.click();
		 WebElement click_action=  inv_rcv1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.widget.Button\n" + 
		 		"")));
		 click_action.click();
		 
	  	
		 WebElement recieve_all_item=  inv_rcv1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[1]\n" + 
		 		"")));
		 recieve_all_item.click();
		 
		 WebDriverWait stk_info= new WebDriverWait(Login.driver, 50);
		 WebElement click_stockinfo=  stk_info.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.view.View[@content-desc=\"Stock Info\"])[1]/android.widget.TextView")));
		 click_stockinfo.click();
		 Thread.sleep(3000);
		 
		 WebDriverWait select_t= new WebDriverWait(Login.driver, 20);
		WebElement select_stockinfo=  select_t.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.CheckBox")));
		 select_stockinfo.click();
		 
	    try
		 {
		 WebElement cancel_popup=  stk_info.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.widget.Button\n" + 
		 		"")));
		 cancel_popup.click();
		 }
		 catch (Exception e) 
		 {
			 WebElement cancel_popup=  stk_info.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.Button\n" + 
				 		"")));
				 cancel_popup.click();
		}
		 
		 WebDriverWait slt_inv= new WebDriverWait(Login.driver, 50);
		 WebElement select_inv=  slt_inv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Select\"]/android.widget.TextView\n" + 
		 		"")));
		 select_inv.click();
		 Thread.sleep(4000);

		 try
		 {
			 WebElement select_inv1=  slt_inv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View/android.widget.Button\n" + 
			 		"")));
				select_inv1.click();
				Thread.sleep(2000);
		
		 }
		 catch (Exception e)
		 {
			 WebElement select_inv1=  slt_inv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View/android.widget.Button")));
			 select_inv1.click();
			 Thread.sleep(2000);
		}
			}
		 
	@Test(priority = 50)
	public void CreateVendorSignature() throws InterruptedException 
	{
		WebDriverWait slt_inv= new WebDriverWait(Login.driver, 50);
		 WebElement add_sign=  slt_inv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.Button\n" + 
		 		"")));
		 add_sign.click();
		 Thread.sleep(5000);
		 
		 WebElement Create_vendor_Signature=  slt_inv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.widget.Image")));
			 Dimension size1 = Create_vendor_Signature.getSize();
			    System.out.println(size1.height+"height");
			    System.out.println(size1.width+"width");
			     System.out.println(size1);
			     int startPoint1 = (int) (size1.height * 1);
			     int endPoint1 = (int) (size1.height *0.3);
			     int ScreenPlace1 =(int) (size1.width*0.5); 
			     int ScreenPlace2 =(int) (size1.width*0.8);  
			   	  TouchAction ts1 = new TouchAction(Login.driver);
			   	
			   	 ts1.press(PointOption.point(ScreenPlace1,startPoint1))
			   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
			   .moveTo(PointOption.point(ScreenPlace1,endPoint1)).release().perform();
			 
			 	ts1.press(PointOption.point(ScreenPlace2,startPoint1))
				   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
				   .moveTo(PointOption.point(ScreenPlace2,endPoint1)).release().perform();
				 
			 
			 WebElement close_sign=  slt_inv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[4]/android.widget.Button[2]")));
			 close_sign.click();
			 
			 WebElement complete_recieve=  slt_inv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button")));
			 complete_recieve.click();
			 Thread.sleep(20000);
			 
			 try
			 {
			 WebElement back_button=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\n" + 
			 		""));
			 back_button.click();
			 }
			 catch (Exception e) 
			 {
				 WebElement back_button=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button\n" + 
					 		""));
					 back_button.click();
			}
			 
			 Reporter.log("=====Inventory Transfer has been Completed sucessfully=====", true);
			
		 
	}
	
}
