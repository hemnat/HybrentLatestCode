package Hybrent4_1rc1;

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

public class NewsAndEvents 
{

	
	
	@Test(priority = 70)
	public void VerifyNewsAndEventsButtonTap() throws InterruptedException 
	{
		
	 //click menu
		Thread.sleep(5000);
		WebDriverWait menu= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
		try {
		     WebElement menu_button=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
		     menu_button.click();
		}
		catch (Exception e) 
		{
			WebElement menu_button=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")));
		     menu_button.click();
		}
		  	 
		  	WebDriverWait click= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
	     try {
	    	 
	    	 WebElement click_NewsAndEvents= click.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[6]\n" + 
	    	 		"")));
	    	 click_NewsAndEvents.click();
	  	      Thread.sleep(7000);
	  	    
		 Reporter.log("=====News And Events Started=====", true);
	     }
	     catch (Exception e) 
	     {
	    	 WebElement click_NewsAndEvents= click.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[7]\n" + 
		    	 		"")));
		    	 click_NewsAndEvents.click();
		  	      Thread.sleep(7000);
		  	  
			 Reporter.log("=====News And Events Started=====", true);
		}
	     
	     WebDriverWait click1= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
	     try
	     {
	    	 WebElement NewsandEvents_get= click1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView\n" + 
	    	 		"")));
			 	String NewsandEvents_text= NewsandEvents_get.getText();
			 	assertEquals(NewsandEvents_text, "News & Events");
	     }
	     catch (Exception e) 
	     {
	    	  WebElement NewsandEvents_get= click1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView\n" + 
	    	  		"")));
			 	String NewsandEvents_text= NewsandEvents_get.getText();
			 	assertEquals(NewsandEvents_text, "News & Events");
		}
	     
	}
		  
	@Test(priority = 71)
	  public void VerifyNewsDescriptionScreen() throws InterruptedException 
	  {
		 WebDriverWait add_cse2= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
		 WebElement Click_Newss=add_cse2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]\n" + 
		 		"")));
		 Click_Newss.click();
		 Thread.sleep(6000);
		 
		 WebDriverWait add_cse3= new WebDriverWait(Login.driver,Duration.ofSeconds(50));
		 try
		 {
		 WebElement Cancel_news=  add_cse3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.Button")));
		 Cancel_news.click();
		 Thread.sleep(1000);
		 }
		 catch (Exception e) 
		 {
			WebElement Cancel_news=  add_cse3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Button")));
			 Cancel_news.click();
			 Thread.sleep(1000);
		 }
		 
	  }
}