package Hybrent3_5_0;


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

public class Charge_Resident
{

	
	@Test(priority=19)
	public void ChargeResident() throws InterruptedException 
	{
		
	 //click menu
		Thread.sleep(6000);
		WebDriverWait menu= new WebDriverWait(Login.driver, 20);
		try {
		     WebElement menu_button=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")));
		     menu_button.click();
		}
		catch (Exception e) 
		{
			WebElement menu_button=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
		     menu_button.click();
		     
		}
	  	 
		  	 
	  	WebDriverWait resident= new WebDriverWait(Login.driver, 30);
	  	try
	  	{
	 WebElement click_Charge_Resident=  resident.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[8]/android.view.View")));
	 click_Charge_Resident.click();
	 Reporter.log("=====Charge Resident Started sucessfully=====", true);
	  	}
	  	catch (Exception e) 
	  	{
	  		 WebElement click_Charge_Resident=  resident.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[9]/android.view.View")));
	  		 click_Charge_Resident.click();
	  		 Reporter.log("=====Charge Resident Started sucessfully=====", true);
		}
	 
	 WebElement click_patient=  resident.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View\n" + 
	 		"")));
	 click_patient.click();
	
	 WebDriverWait search= new WebDriverWait(Login.driver, 30);
	 WebElement search_item=  search.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText\n" + 
	 		"")));
	 search_item.click();
	 Thread.sleep(6000);
	
	 
	 TouchAction ts1 = new TouchAction(Login.driver);
	 ts1.press(PointOption.point(1014,570))
    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
    .moveTo(PointOption.point(650,570)).release().perform();
	
	 
	 WebElement click_add=  search.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View\n" + 
	 		"")));
	 click_add.click();
	 Thread.sleep(3000);
	
	 
	 WebElement increase_qty= search.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[5]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button")));
	 increase_qty.click();
	 Thread.sleep(4000);
	
	 WebDriverWait complete= new WebDriverWait(Login.driver, 20);
	 try 
	 {
	 WebElement Complete=  complete.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.Button")));
	 Complete.click();
	 Thread.sleep(3000);
	 }
	 catch (Exception e) 
	 {
		 WebElement Complete=  complete.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Button")));
		 Complete.click();
		 Thread.sleep(3000);
	}
	
	 
	 WebElement Final_Complete=  complete.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button[2]")));
	 Final_Complete.click();
	
	 Reporter.log("=====Charge Resident has been Completed sucessfully=====", true);
	 
	 
	}
	
}

