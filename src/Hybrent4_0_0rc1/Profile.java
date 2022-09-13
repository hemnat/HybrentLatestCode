package Hybrent4_0_0rc1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class Profile 
{
	@Test(priority = 72)
	public void VerifyProfileButtonTap() throws InterruptedException 
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
	    	 
	    	 WebElement click_Profile= click.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[7]\n" + 
	    	 		"")));
	    	 click_Profile.click();
	  	      Thread.sleep(5000);
	  	  
	     }
	     catch (Exception e) 
	     {
	    	 WebElement click_Profile= click.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[8]\n" + 
		    	 		"")));
	    	 click_Profile.click();
		  	  Thread.sleep(5000);
		  	  
		}
	     
	}
		  
	@Test(priority = 73)
	  public void VerifyProfileScreen() throws InterruptedException 
	  {
		WebDriverWait click= new WebDriverWait(Login.driver,Duration.ofSeconds(30));  
		try
		{
		WebElement Profile_get= click.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView\n" + 
				"")));
		 	String Profile_text= Profile_get.getText();
		 	assertEquals(Profile_text, "Profile");
		}
		catch (Exception e) 
		{
			WebElement Profile_get= click.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView\n" + 
					"")));
			 	String Profile_text= Profile_get.getText();
			 	assertEquals(Profile_text, "Profile");
		}
		 
	  }
}

