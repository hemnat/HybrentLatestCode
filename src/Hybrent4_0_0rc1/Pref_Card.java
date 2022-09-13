package Hybrent4_0_0rc1;

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


public class Pref_Card {
	
	@Test(priority = 21)
	public void Pick_List() throws InterruptedException 
	{
		
	 //click menu
		Thread.sleep(5000);
		WebDriverWait menu= new WebDriverWait(Login.driver, 50);
		try {
		     
		     WebElement menu_button=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")));
		     menu_button.click();
		}
		catch (Exception e) 
		{
		  WebElement menu_button=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
	      menu_button.click();
			
		}
	 
		 WebElement menu_view=  menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View"))); 
		 Dimension size = menu_view.getSize();
		    System.out.println(size.height+"height");
		    System.out.println(size.width+"width");
		     System.out.println(size);
		     int startPoint = (int) (size.height * 0.7);
		     int endPoint = (int) (size.height *0.2);
		     int ScreenPlace =(int) (size.width*0.5);  
		   	  TouchAction ts = new TouchAction(Login.driver);
		  	 ts.press(PointOption.point(ScreenPlace,startPoint))
		   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
		   .moveTo(PointOption.point(ScreenPlace,endPoint)).release().perform();
	  	
	  	WebDriverWait pick= new WebDriverWait(Login.driver, 30);
	  	try
	  	{
	  	WebElement Click_pick_list=  pick.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View\n" + 
	  			"")));
	  	Click_pick_list.click();
	  	Reporter.log("=====Pick List Started sucessfully=====", true);
	  	}
	  	catch (Exception e) 
	  	{
	  		WebElement Click_pick_list=  pick.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View\n" + 
		  			"")));
		  	Click_pick_list.click();
		  	Reporter.log("=====Pick List Started sucessfully=====", true);
		}
	  	
	  	WebElement Detail_pick_list=  pick.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[1]\n" + 
	  			"")));
	  	Detail_pick_list.click();
	  	
	  	WebElement Click_more=  pick.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button")));
	  	Click_more.click();
	  	
	  	WebDriverWait attach= new WebDriverWait(Login.driver, 30);
	  	//WebElement Auto_Attach= attach.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[6]\n" + 
	  		//	"")));
	  	//Auto_Attach.click();
	  	
	  	//WebElement Click_more1=  attach.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button")));
	  	//Click_more1.click();
	  
	  	WebElement Move_to_execute=  attach.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[6]\n" + 
	  			"")));
	  	Move_to_execute.click();
	  	
	  	Reporter.log("=====Item has been added in the execute case sucessfully=====", true);
	  	
	}
	  	@Test(priority = 22)
		public void Execute_Cases() throws InterruptedException 
		{
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
	  
			try
			{
	  	WebElement Click_Execute_Cases=  menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View\n" + 
	  			"")));
	  	Click_Execute_Cases.click();
	  	Reporter.log("=====Execute cases Started sucessfully=====", true);
			}
			catch (Exception e) 
			{
				WebElement Click_Execute_Cases=  menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[4]/android.view.View\n" + 
			  			"")));
			  	Click_Execute_Cases.click();
			  	Reporter.log("=====Execute cases Started sucessfully=====", true);
			}
	  	
	  	WebDriverWait detail= new WebDriverWait(Login.driver, 30);
	  	WebElement Click_case_detail=  detail.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]\n" + 
	  			"")));
	  	Click_case_detail.click();
	  	
	  	WebElement Click_Back=  detail.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
	  	Click_Back.click();
	  	Reporter.log("=====Item has been added in the complete cases sucessfully=====", true);
		}
	  	
	  	@Test(priority = 23)
		public void Complete_Cases() throws InterruptedException 
		{
	  		
	  	//click menu
			Thread.sleep(4000);
			WebDriverWait menu= new WebDriverWait(Login.driver, 30);
			try {
			     
			     WebElement menu_button=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")));
			     menu_button.click();
			}
			catch (Exception e) 
			{
				WebElement menu_button=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
			     menu_button.click();
			}
	
			try
			{
	  	WebElement Click_Cases= menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[4]/android.view.View\n" + 
	  			"")));
	  	Click_Cases.click();
	  	Reporter.log("=====Complete cases started sucessfully=====", true);
			}
			catch (Exception e) 
			{
				WebElement Click_Cases= menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[5]/android.view.View\n" + 
			  			"")));
			  	Click_Cases.click();
			  	Reporter.log("=====Complete cases started sucessfully=====", true);
			}
	  	
	  	WebDriverWait detail= new WebDriverWait(Login.driver, 50);
	  	WebElement Case_Detail= detail.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[1]\n" + 
	  			"")));
	  	Case_Detail.click();
	  	
	  	WebElement Click_Save=  detail.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.Button")));
	  	Click_Save.click();
	  	
	  	WebElement Click_More=  detail.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button")));
	  	Click_More.click();
	  	
		WebElement Move_To_Picklist=  detail.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[4]")));
		Move_To_Picklist.click();
	  	
	  	Reporter.log("=====Item has been added in the pick list sucessfully=====", true);
	  	
	}
}
