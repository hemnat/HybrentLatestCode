package Hybrent3_5_0;


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

public class Inventory_Transfer 
{
	 
	@SuppressWarnings("rawtypes")
	@Test(priority = 20)
	public void InventoryTransfer() throws InterruptedException 
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
		  	 
	  	WebDriverWait inv_rcv= new WebDriverWait(Login.driver, 30);
	  	try
	  	{
	  	WebElement Click_Inventory_Recieve=  inv_rcv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[9]/android.view.View\n" + 
	  			"")));
	  	Click_Inventory_Recieve.click();
	  	Thread.sleep(8000);
	  	Reporter.log("=====Inventory Transfer Started sucessfully=====", true);
	  	}
	  	catch (Exception e)
	  	{
	  		WebElement Click_Inventory_Recieve=  inv_rcv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[10]/android.view.View\n" + 
		  			"")));
		  	Click_Inventory_Recieve.click();
		  	Thread.sleep(8000);
		  	Reporter.log("=====Inventory Transfer Started sucessfully=====", true);
		}
	  	
	  	WebDriverWait inv_rcv1= new WebDriverWait(Login.driver, 30);
		 WebElement Add_item=  inv_rcv1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")));
		 Add_item.click();
		 Thread.sleep(7000);
		 
		 /*
		 WebElement search_item=  inv_rcv1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText\n" + 
		 		"")));
		 search_item.sendKeys("den300mg");
		 Thread.sleep(3000);
		 
		 WebElement click_search=  inv_rcv1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.Button[2]")));
		 click_search.click();
		 Thread.sleep(3000);
		 */
		
		 TouchAction ts1 = new TouchAction(Login.driver);
		 ts1.press(PointOption.point(1014,570))
	    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
	    .moveTo(PointOption.point(650,570)).release().perform();
		 
		 WebElement add_btn=  inv_rcv1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View")));
		 add_btn.click();
		 Thread.sleep(4000);
		 
		 WebDriverWait inv_rcvn= new WebDriverWait(Login.driver, 30);
		 WebElement procced_btn=  inv_rcvn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.Button\n" + 
		 		"")));
		 procced_btn.click();
		 
		 WebElement click_create=  inv_rcvn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button")));
		 click_create.click();
		 
		 WebDriverWait stk_info= new WebDriverWait(Login.driver, 50);
		 WebElement select_to_inv=  stk_info.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Select\"]")));
		 select_to_inv.click();
		 Thread.sleep(3000);
		 
		 WebDriverWait select_t= new WebDriverWait(Login.driver, 30);
		 
		 try
		 {
		WebElement select_inv=  select_t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View/android.widget.Button")));
		select_inv.click();
		 }
		 catch (Exception e) 
		 {
			 WebElement select_inv=  select_t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View/android.widget.Button")));
				select_inv.click();
		}
		 		 
		 WebElement complete=  select_t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button\n" + 
		 		"")));
		 complete.click();
		 
		 WebDriverWait slt_inv= new WebDriverWait(Login.driver, 50);
		 WebElement pop_up=  slt_inv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.widget.Button[2]")));
		 pop_up.click();
		 
		 
	}
	
}
