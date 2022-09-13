package Hybrent4_1rc1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Invoice {

	
	@Test(priority = 24)
	public void VerifyInvoiceButtonTap() throws InterruptedException 
	{	
	 //click menu
		Thread.sleep(5000);
		WebDriverWait menu= new WebDriverWait(Login.driver,Duration.ofSeconds(50));
		try {
		     WebElement menu_button=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
		     menu_button.click();
		}
		catch (Exception e) 
		{
			WebElement menu_button=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")));
		     menu_button.click();
		}
	  	 
		try
		{
	  	WebElement Click_Invoice=  menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[3]/android.widget.TextView")));
	  	Click_Invoice.click();
	  	Thread.sleep(3000);
	  	
	  	Reporter.log("=====Invoice processed Started sucessfully=====", true);
		}
		catch (Exception e) 
		{
			WebElement Click_Invoice=  menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[4]/android.widget.TextView")));
		  	Click_Invoice.click();
		  	Thread.sleep(3000);
		  Reporter.log("=====Invoice processed Started sucessfully=====", true);
		}
		
		try
		{
			WebElement invoice_get= menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView\n" + 
					"")));
			 String invoice_text= invoice_get.getText();
			 assertEquals(invoice_text, "Invoice");
			
		}
		catch (Exception e) 
		{
			WebElement invoice_get= menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView")));
			 String invoice_text= invoice_get.getText();
			 assertEquals(invoice_text, "Invoice");
		}
		
	}

		@Test(priority = 25)
		public void VerifyInvoiceDeatilPage() throws InterruptedException 
		{
	     WebDriverWait menu= new WebDriverWait(Login.driver,Duration.ofSeconds(40));
	  	WebElement invoice_Detail=  menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View/android.widget.TextView[1]\n" + 
	  			"")));
	  	invoice_Detail.click();
	  	
	  	WebDriverWait Action_button= new WebDriverWait(Login.driver,Duration.ofSeconds(40)); 
	  	WebElement Action=  Action_button.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.widget.Button\n" + 
	  			"")));
	  	Action.click();
		}
	  	
	  	@Test(priority = 26)
		public void VerifyProcessedInvoice() throws InterruptedException 
		{
	  	WebDriverWait Action_button= new WebDriverWait(Login.driver,Duration.ofSeconds(40));
	  	WebElement Mark_As_Processed=   Action_button.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]")));
	  	Mark_As_Processed.click();

	  /*
	  	WebElement Yes=  Action_button.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button[2]\n" + 
	  			"")));
	  	Yes.click();
	  	Thread.sleep(2000);
	  	*/
	  	
	  	WebElement Confirm_popup=  Action_button.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")));
	  	Confirm_popup.click();
	  	Thread.sleep(5000);
	  	
	  	try
	  	{
	  		WebElement Back_Button=  Action_button.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
		  	Back_Button.click();
		  	Login.driver.navigate().back();
	  	}
	  	catch (Exception e) 
	  	{
	  		WebElement Back_Button=  Action_button.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")));
		  	Back_Button.click();
		  	Login.driver.navigate().back();
		}
	    
	  	Reporter.log("=====Invoice processed has been Completed sucessfully=====", true);
	  	
	  	
	  	
	}
}
	/*
	@Test(priority = 9)
	  	public void Verify_Invoice() throws InterruptedException 
		{
		WebDriverWait verify= new WebDriverWait(Login.driver,20); 
	  	WebElement verify_Invoice=  verify.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View[3]\n" + 
	  			"")));
	  	String verify_inv=verify_Invoice.getText();
	  	
	  	if(verify_inv.equals("Processed"))
	  	{
	  		Reporter.log("=====Invoice Processed has been verified sucessfully=====", true);
	  		
	  	}
	  	else
	  	
	  	{
		  	Reporter.log("=====Invoice Processed not verified=====", true);
		  		
		}
		*/
	  	  
	

	

