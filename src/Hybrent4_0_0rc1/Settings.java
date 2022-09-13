package Hybrent4_0_0rc1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Settings 
{
	@Test(priority = 74)
	public void VerifySettingsButtonTap() throws InterruptedException 
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
	    	 
	    	 WebElement click_Settings= click.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[8]\n" + 
	    	 		"")));
	    	 click_Settings.click();
	  	      Thread.sleep(5000);
	  	  
	     }
	     catch (Exception e) 
	     {
	    	 WebElement click_Settings= click.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[9]\n" + 
		    	 		"")));
	    	 click_Settings.click();
		  	  Thread.sleep(5000);
		  	  
		}
	     
	}
		  
	@Test(priority = 75)
	  public void VerifySettingsScreen() throws InterruptedException 
	  {
		try
		{
		WebDriverWait click= new WebDriverWait(Login.driver,Duration.ofSeconds(30));  
		WebElement Settings_get= click.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView")));
		 	String Settings_text= Settings_get.getText();
		 	assertEquals(Settings_text, "Settings");
		}
		catch (Exception e) 
		{
			WebDriverWait click= new WebDriverWait(Login.driver,Duration.ofSeconds(30));  
			WebElement Settings_get= click.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView")));
			 	String Settings_text= Settings_get.getText();
			 	assertEquals(Settings_text, "Settings");
		}
		 
	  }
}
