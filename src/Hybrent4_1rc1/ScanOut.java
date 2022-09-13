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

public class ScanOut {
	
	
	@Test(priority = 39)
	public void Verify_ScanOutButtonTap() throws InterruptedException 
	{
		Thread.sleep(5000);
	 //click menu
	 WebDriverWait menu_btn= new WebDriverWait(Login.driver,Duration.ofSeconds(20));
		try 
		{
		 
		     WebElement menu_button=menu_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
		     menu_button.click();
		}
		catch (Exception e) 
		{
			WebElement menu_button=menu_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")));
		     menu_button.click();
		}

		  	 
		try
		{
	  	WebElement scan_out=  menu_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[7]/android.view.View")));
	  	scan_out.click();
	  	Thread.sleep(5000);
	  	Reporter.log("=====ScanOut Started=====", true);
		}
		catch (Exception e) 
		{
		 	WebElement scan_out=  menu_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[8]/android.view.View")));
		  	scan_out.click();
		  	Thread.sleep(5000);
		  	Reporter.log("=====ScanOut Started=====", true);
		}
		
		try
		{
			 WebElement scanout_get= menu_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView\n" + 
			 		"")));
			String scanout_text= scanout_get.getText();
			assertEquals(scanout_text, "Scan Out");
		}
		
		catch (Exception e) 
		{
			 WebElement scanout_get= menu_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView")));
			String scanout_text= scanout_get.getText();
			assertEquals(scanout_text, "Scan Out");
		}
	}
	
		
		@Test(priority = 40)
		public void Verify_AddItemScanOut() throws InterruptedException 
		{
		 WebDriverWait add_item_slide= new WebDriverWait(Login.driver,Duration.ofSeconds(50));
		 WebElement add_items=  add_item_slide.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button")));
		 add_items.click();
		 Thread.sleep(5000);
		 
		 /*
		 WebElement search_item=  add_item_slide.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText")));
		 search_item.sendKeys("sku-marktest");
		 Thread.sleep(3000);
		 */
		
		 TouchAction ts1 = new TouchAction(Login.driver);
		 ts1.press(PointOption.point(1014,570))
	    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
	    .moveTo(PointOption.point(650,570)).release().perform();
		 
		 try
		 {
			 WebElement add_item=  add_item_slide.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.TextView\n" + 
			 		"")));
			 add_item.click();
			 Thread.sleep(3000);
			 }
		 catch (Exception e) 
		 {
			 WebElement add_item=  add_item_slide.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]\n" + 
				 		"")));
				 add_item.click();
				 Thread.sleep(3000);
		}
		}
		 
		 
	@Test(priority = 41)
	  public void Verify_Complete_ScanOut() throws InterruptedException 
	  {
		 WebDriverWait add_item_t= new WebDriverWait(Login.driver,Duration.ofSeconds(50));
		 try
		 {
		 WebElement Add=  add_item_t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button[2]\n" + 
		 		"")));
		 Add.click();
		 Thread.sleep(3500);
		 }
		 catch (Exception e) 
		 {
			 WebElement Add=  add_item_t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.widget.Button[2]\n" + 
			 		"")));
			 Add.click();
			 Thread.sleep(3500);
		}
			 
		
		 try
		 {
		WebElement increase_qty1=  add_item_t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[5]/android.view.View/android.view.View[4]/android.view.View[2]/android.widget.Button\n" + 
				"")));
		increase_qty1.click();
		Thread.sleep(8000);
		 }
		 catch (Exception e) 
		 {
			 WebElement increase_qty1=  add_item_t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[5]/android.view.View/android.view.View[4]/android.view.View[2]/android.widget.Button")));
				increase_qty1.click();
				Thread.sleep(8000);
		}
	
		WebDriverWait complete_t= new WebDriverWait(Login.driver,Duration.ofSeconds(20));
		
		try 
		{
		WebElement complete= complete_t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.Button\n" + 
				"")));
		complete.click();
		Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			WebElement complete= complete_t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button\n" + 
					"")));
			complete.click();
			Thread.sleep(2000);
		}
		
		WebElement Cancel_charge=  complete_t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[1]")));
		Cancel_charge.click();
					 		 
		WebElement auto_attach= complete_t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[2]\n" + 
				"")));
		auto_attach.click();
		Thread.sleep(2000);
		
		
		WebElement complete1= complete_t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button[2]\n" + 
				"")));
		complete1.click();
		
		
	}
}
