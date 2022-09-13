package Hybrent3_6_0rc2;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class Templates {
	
	
	 public String getAlphaNumericString(int n) 
	    { 
	  
	        // chose a Character random from this String 
	        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123";
	                                    
	  
	        // create StringBuffer size of AlphaNumericString 
	        StringBuilder sb = new StringBuilder(n); 
	  
	        for (int i = 0; i < n; i++) 
	        { 
	  
	            // generate a random number between 
	            // 0 to AlphaNumericString variable length 
	            int index 
	                = (int)(AlphaNumericString.length() 
	                        * Math.random()); 
	  
	            // add Character one by one in end of sb 
	            sb.append(AlphaNumericString 
	                          .charAt(index)); 
	        } 
	  
	        return sb.toString(); 
	    }
	 
	@Test(priority = 27)
	public void Verify_OrderTemplate() throws InterruptedException 
	{
		
		//click menu
		Thread.sleep(8000);
		WebDriverWait menu= new WebDriverWait(Login.driver, 70);
		
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
	  	WebElement Click_Order_Template=  menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[5]/android.view.View")));
	  	Click_Order_Template.click();
	  	Reporter.log("=====Order Template Started sucessfully=====", true);
		}
		catch (Exception e) 
		{
			WebElement Click_Order_Template=  menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[6]/android.view.View")));
		  	Click_Order_Template.click();
		  Reporter.log("=====Order Template Started sucessfully=====", true);
		}
		
		try 
		{
			WebElement Templates_get= menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]\n" + 
		  			"")));
			String Templates_text= Templates_get.getText();
			assertEquals(Templates_text, "Templates");
		}
		catch (Exception e) 
		{
			WebElement Templates_get= menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]\n" + 
					"")));
			String Templates_text= Templates_get.getText();
			assertEquals(Templates_text, "Templates");
		}
	}
		
		@Test(priority = 28)
		public void Verify_OrderTemplateDetailPage() throws InterruptedException 
		{
		
		WebDriverWait fill= new WebDriverWait(Login.driver, 70);
	  	WebElement Click_Template_name=  fill.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[4]/android.view.View[1]/android.view.View[1]\n" + 
	  			"")));
	  	Click_Template_name.click();
	  	
	  	
	  	WebElement fill_default_qty=  fill.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.widget.Button")));
	  	fill_default_qty.click();
	  	
	  	WebElement use_my_po=  fill.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[3]/android.widget.ListView/android.view.View[4]/android.view.View[2]/android.view.View\n" + 
	  			"")));
	  	use_my_po.click();
	  	
	  	WebElement enter_pono=  fill.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[3]/android.widget.ListView/android.view.View[5]/android.widget.EditText")));
	  	enter_pono.sendKeys("Test"+getAlphaNumericString(5));
		}
	  	
	  	
	  	
	  	@Test(priority = 29)
		public void Make_Order() throws InterruptedException 
		{
	  		WebDriverWait fill1= new WebDriverWait(Login.driver, 20);
	  	try 
	  	{
	  	WebElement make_order= fill1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.Button")));
	  	make_order.click();
	  	}
	  	catch (Exception e) 
	  	{
	  		WebElement make_order=  fill1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Button")));
		  	make_order.click();
		}
	  	
	  
	  	WebDriverWait confrim= new WebDriverWait(Login.driver, 50);
	  	WebElement confirm_order=  confrim.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]\n" + 
	  			"")));
	  	confirm_order.click();
	  	Thread.sleep(5000);
	 
	  	/*
	  	WebElement confirm_order2=  confrim.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]\n" + 
	  			"")));
	  	confirm_order2.click();
	  	Thread.sleep(8000);
	  	
	  	WebElement back_btn=  confrim.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
	  	back_btn.click();
	  	*/
	  	
	  	Reporter.log("=====Order Template has been Completed sucessfully=====", true);
	  	
	 }
	
	@Test(priority = 30)
	public void Verify_ScanOutTemplate() throws InterruptedException 
	{
		
		//click menu
		Thread.sleep(5000);
		WebDriverWait menu1= new WebDriverWait(Login.driver, 50);
		try {
		     WebElement menu_button=menu1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
		     menu_button.click();
		}
		catch (Exception e) 
		{
			WebElement menu_button=menu1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")));
		     menu_button.click();
		}
	}
		
	@Test(priority = 31)
		public void Verify_ScanOutTemplateDetailPage() throws InterruptedException 
		{
		WebDriverWait menu2= new WebDriverWait(Login.driver, 50);
   WebElement Click_Template=  menu2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[5]/android.view.View\n" + 
   		"")));
   Click_Template.click();
   Thread.sleep(6000);
	
   WebElement Scan_out_Template=  menu2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]\n" + 
			"")));
	Scan_out_Template.click();
	Reporter.log("=====Scan_out Template Started sucessfully=====", true);
	
	
	WebDriverWait detail= new WebDriverWait(Login.driver, 40);
	WebElement Scan_out_detail=  detail.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[4]/android.view.View[1]/android.view.View[1]")));
	Scan_out_detail.click();
		}
	
	@Test(priority = 32)
	public void Verify_ScanOut() throws InterruptedException 
	{
	try 
	{
	
	WebElement Done_Scan_out=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Button"));
	Done_Scan_out.click();
	}
	catch (Exception e) 
	{
		WebElement Done_Scan_out=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.Button"));
		Done_Scan_out.click();
	}
	WebDriverWait sucess= new WebDriverWait(Login.driver, 60);
	WebElement Sussess_popup=  sucess.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button\n" + 
			"")));
	Sussess_popup.click();
	
	WebElement Complete=  sucess.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button\n" + 
			"")));
	Complete.click();
	
	WebElement Cancel_charge_centre=  sucess.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[1]")));
	Cancel_charge_centre.click();
	
	WebDriverWait auto= new WebDriverWait(Login.driver, 40);
	WebElement Auto_Attach_Stock=  auto.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]\n" + 
			"")));
	Auto_Attach_Stock.click();
	Thread.sleep(4000);
	
	
	WebElement Final_Complete=  auto.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button\n" + 
			"")));
	Final_Complete.click();
	Thread.sleep(6000);
	
	WebDriverWait bck= new WebDriverWait(Login.driver, 30);
	try
	{
	WebElement back=  bck.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button\n" + 
			"")));
	back.click();
	Thread.sleep(3000);
	}
	catch (Exception e) 
	{
		WebElement back=  bck.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\n" + 
				"")));
		back.click();
		Thread.sleep(3000);
	}
 	
	WebDriverWait bck1= new WebDriverWait(Login.driver, 30);
	try
	{
 	WebElement back2=  bck1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
 	back2.click();
 	Thread.sleep(3000);
	}
	catch (Exception e) 
	{
		WebElement back2=  bck1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")));
	 	back2.click();
	 	Thread.sleep(3000);
	}
 	
 	Reporter.log("=====Scan_out Template has been Completed sucessfully=====", true);
 	
 	
	}
	
	@Test(priority = 33)
	public void Verify_KitTemplate() throws InterruptedException 
	{
		
		WebDriverWait Kit= new WebDriverWait(Login.driver, 40);
	  	WebElement click_kit=  Kit.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Kit\"]")));
	  	click_kit.click();
		Reporter.log("=====Kit Template Started sucessfully=====", true);
	}
		
	  	
		@Test(priority = 34)
		public void Verify_KitTemplateDetailPage() throws InterruptedException 
		{
		WebDriverWait Kit= new WebDriverWait(Login.driver, 40);
	  	WebElement kit_detail=  Kit.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[4]/android.view.View[1]/android.view.View[1]")));
	  	kit_detail.click();
	  	
	  	Thread.sleep(5000);
	  	WebDriverWait inv= new WebDriverWait(Login.driver,20);
	  	WebElement select_inv=  inv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Select\"]/android.widget.TextView")));
	  	select_inv.click();
	  	Thread.sleep(2000);
	  	
	  	try
	  	{
	  		WebElement select_inv_fnl=  inv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View/android.widget.Button")));
		  	select_inv_fnl.click();
	  	    Thread.sleep(3000);
	  	}
	  	catch (Exception e) 
	  	{
	  		WebElement select_inv_fnl=  inv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View/android.widget.Button")));
		  	select_inv_fnl.click();
		  	Thread.sleep(3000);
		}
		}
	  	
	  	@Test(priority = 35)
		public void Make_Kit() throws InterruptedException 
		{
	  		WebDriverWait inv= new WebDriverWait(Login.driver, 40);
	  	try {
	  	
	  	WebElement make_kit=  inv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Button")));
	  	make_kit.click();
	  	Thread.sleep(15000);
	  	}
	  	catch (Exception e) 
	  	{
	  		WebElement make_kit=  inv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.Button")));
		  	make_kit.click();
		  	Thread.sleep(15000);
		}
	  		
	  	Reporter.log("=====Kit Template has been Completed sucessfully=====", true);
	  	
	}
}
