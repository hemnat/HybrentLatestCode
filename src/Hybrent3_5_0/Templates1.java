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

public class Templates1 {
	@Test(priority = 14)
	public void Order_Template() throws InterruptedException 
	{
		Thread.sleep(8000);
		WebDriverWait menu_btn= new WebDriverWait(Login.driver, 50);
		try {
		     WebElement menu_button=menu_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")));
			menu_button.click();
		}
		catch (Exception e) 
		{
			WebElement menu_button=menu_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
		     menu_button.click();
		}
		
	
	
	  WebElement menu_view=  menu_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View"))); 
	 Dimension size = menu_view.getSize();
	    System.out.println(size.height+"height");
	    System.out.println(size.width+"width");
	     System.out.println(size);
	     int startPoint = (int) (size.height * 0.7);
	     int endPoint = (int) (size.height *0.1);
	     int ScreenPlace =(int) (size.width*0.5);  
	   	  TouchAction ts = new TouchAction(Login.driver);
	  	 ts.press(PointOption.point(ScreenPlace,startPoint))
	   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
	   .moveTo(PointOption.point(ScreenPlace,endPoint)).release().perform();
	  	 
	  	try
		{
	  	WebElement Click_Order_Template=  menu_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[5]/android.view.View")));
	  	Click_Order_Template.click();
	  	Reporter.log("=====Order Template Started sucessfully=====", true);
		}
		catch (Exception e) 
		{
			WebElement Click_Order_Template=  menu_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[6]/android.view.View")));
		  	Click_Order_Template.click();
		  	Reporter.log("=====Order Template Started sucessfully=====", true);
		}
	}
}
