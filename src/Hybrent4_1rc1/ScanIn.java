package Hybrent4_1rc1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ScanIn {
	
	@Test(priority = 36)
	public void Verify_ScanInButtonTap() throws InterruptedException 
	{
		Thread.sleep(10000);
	 //click menu
		WebDriverWait menu_btn= new WebDriverWait(Login.driver,Duration.ofSeconds(20));
		try {
		 
		     WebElement menu_button=menu_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")));
		     menu_button.click();
		}
		catch (Exception e) 
		{
		    WebElement menu_button=menu_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
		     menu_button.click();
		}
		
	WebDriverWait menu_btn1= new WebDriverWait(Login.driver,Duration.ofSeconds(20));
	  	 try
	  	 {
	  	WebElement scan_in=  menu_btn1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[6]/android.view.View/android.widget.TextView[2]\n" + 
	  			"")));
		 scan_in.click();
		 Thread.sleep(5000);
		 WebElement scanin_get= menu_btn1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView\n" + 
		 		"")));
			String scanin_text= scanin_get.getText();
			assertEquals(scanin_text, "Scan In");
		 Reporter.log("=====ScanIn Started=====", true);
	  	 }
	  	 catch (Exception e) 
	  	 {
	  		WebElement scan_in= menu_btn1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[7]/android.view.View/android.widget.TextView[2]\n" + 
	  				"")));
			 scan_in.click();
			 Thread.sleep(8000);
			 WebElement scanin_get= menu_btn1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]\n" + 
				 		"")));
			String scanin_text= scanin_get.getText();
			assertEquals(scanin_text, "Scan In");
			 Reporter.log("=====ScanIn Started=====", true);
		}
	}
	
	  	@Test(priority = 37)
		public void VerifyAddItem_ScanIn() throws InterruptedException 
		{
	  	WebDriverWait add_item_slide= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
	  	 
	  	try
	  	{
		 WebElement add_items=  add_item_slide.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button")));
		 add_items.click();
		 Thread.sleep(8000);
	  	}
	  	catch (Exception e) 
	  	{
	  		 WebElement add_items=  add_item_slide.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")));
			 add_items.click();
			 Thread.sleep(8000);
		}
		 
		 TouchAction ts1 = new TouchAction(Login.driver);
		 ts1.press(PointOption.point(1000,550))
	    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
	    .moveTo(PointOption.point(650,550)).release().perform();
		 Thread.sleep(2500);
		 
		 try
		 {
		 WebElement add_item=  add_item_slide.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.TextView\n" + 
		 		"")));
		 add_item.click();
		 Thread.sleep(3000);
		 }
		 catch (Exception e) 
		 {
			 WebElement add_item=  add_item_slide.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View\n" + 
				 		"")));
				 add_item.click();
				 Thread.sleep(3000);
		}
		 
		 WebElement select_inventory=  add_item_slide.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Select\"]/android.widget.TextView\n" + 
		 		"")));
		 select_inventory.click();
		 Thread.sleep(3000);
		 
		WebDriverWait add_item_slide1= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
		 
		try
		{
		 WebElement Final_select=  add_item_slide1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View/android.widget.Button")));
		 Final_select.click();
		 Thread.sleep(3000);
		}
		catch (Exception e) 
		{
			WebElement Final_select=  add_item_slide1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View/android.widget.Button\n" + 
					"")));
			 Final_select.click();
			 Thread.sleep(3000);
		}
		}
		/*
		 WebElement add_uou=  add_item_slide1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[8]/android.view.View[2]/android.widget.Spinner\n" + 
		 		"")));
		 add_uou.click();
		 
		 WebElement add_uou1=  add_item_slide1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]\n" + 
		 		"")));
		 add_uou1.click();
		 */
		 
		@Test(priority = 38)
		public void Verify_Complete_ScanIn() throws InterruptedException 
		{
		 WebDriverWait add_qty= new WebDriverWait(Login.driver,Duration.ofSeconds(100));
		 try
		 {
			 WebElement Add=  add_qty.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button[2]\n" + 
			 		"")));
			 Add.click();
			 Thread.sleep(5000);
		 }
		 catch (Exception e) 
		 {
			 WebElement Add=  add_qty.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button[2]")));
			 Add.click();
			 Thread.sleep(5000);
		}
			 
		WebElement increase_qty=  add_qty.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.Button")));
		increase_qty.click();
				 
		WebElement increase_qty1=  add_qty.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.Button")));
		increase_qty1.click();
		Thread.sleep(5000);
					 
		 WebDriverWait cmpt= new WebDriverWait(Login.driver,Duration.ofSeconds(50));
		WebElement complete= cmpt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button\n" + 
				"")));
		complete.click();
		Thread.sleep(4000);
		
		try
		{
		WebElement complete1= cmpt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button[2]")));
		complete1.click();
		Thread.sleep(6000);
		}
		catch (Exception e) 
		{
			WebElement complete1= cmpt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button")));
			complete1.click();
			Thread.sleep(6000);
		}
		
		
	}
}
