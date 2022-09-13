package Hybrent4_1rc1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ReplenishBin 
{
	String po_no;
	 
	public void Replenish_Bin() throws InterruptedException 
	{
		Thread.sleep(9000);
	 //click menu
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
	 
	 //click BillandReplace
		WebDriverWait click= new WebDriverWait(Login.driver, 70);
	 WebElement click_ReplenishBin= click.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[5]/android.view.View\n" + 
	 		"")));
	 click_ReplenishBin.click();
	 Thread.sleep(5000);
	 
	 WebElement Select_inv=click.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Aims Inventory\"]/android.widget.TextView\n" + 
	 		"")));
	 Select_inv.click();
	 Thread.sleep(3000);
	 
	 WebElement Select_inv1=click.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[5]/android.widget.Button\n" + 
	 		"")));
		 Select_inv1.click();
		 Thread.sleep(3000);
	 
	 @SuppressWarnings("rawtypes")
	TouchAction ts = new TouchAction(Login.driver);
 	 ts.longPress(PointOption.point(1000,617))
  .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
  .moveTo(PointOption.point(450,617)).release().perform();
 	 Thread.sleep(2000);
	 
 	WebDriverWait click1= new WebDriverWait(Login.driver, 40);
 	try
 	{
 		WebElement add_to_cart= click1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[1]/android.view.View\n" + 
 				"")));
 		 add_to_cart.click();
 		 Thread.sleep(6000);
 	
 	}
 	catch (Exception e) 
 	{
 		WebElement add_to_cart= click1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[1]/android.view.View\n" + 
 	 			"")));
 		 add_to_cart.click();
 		 Thread.sleep(6000);
 		 
	}
	 
 	WebDriverWait click2= new WebDriverWait(Login.driver, 40);
 	try
 	{
	WebElement cancel= click2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.Button")));
	cancel.click();
 	}
 	catch (Exception e) 
 	{
 		WebElement cancel= click2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Button\n" + 
 				"")));
 		cancel.click();
	}
	
  }
	
	public void Generate_BillAndReplace_PO() throws InterruptedException 
	{
	   
	   WebDriverWait po_wait= new WebDriverWait(Login.driver, 70);
	   WebElement use_my_po_= po_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[3]/android.widget.ListView/android.view.View[3]/android.view.View[2]")));
	   use_my_po_.click();
	   Thread.sleep(500);
			 
		WebElement enter_orderno_= po_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[3]/android.widget.ListView/android.view.View[4]/android.widget.EditText\n" + 
				"")));
		//po_no="BillndReplace"+Orders.getAlphaNumericString(5);
		enter_orderno_.sendKeys(po_no);
		
		WebDriverWait po_wait1= new WebDriverWait(Login.driver, 30);
		try
		{
		WebElement generate_po_= po_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.Button\n" + 
				"")));
		generate_po_.click();
		Thread.sleep(500);
		}
		catch (Exception e) 
		{
			WebElement generate_po_= po_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Button\n" + 
					"")));
			generate_po_.click();
			Thread.sleep(500);
		}
			 
		WebElement sure_generate_po_= po_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]")));
		sure_generate_po_.click();
				 Thread.sleep(500);
		
		/*		 
		WebElement remaining_budget= Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]"));
		remaining_budget.click();
		Thread.sleep(2000);
		*/
					 
	 
	}
	
	
	public void Verify_BillAndReplace_PO() throws InterruptedException 
	{
		 WebDriverWait verify_wait= new WebDriverWait(Login.driver, 70);
		 WebElement Verify_Order=  verify_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText\n" + 
		 		"")));
		 Verify_Order.sendKeys(po_no);
		 Thread.sleep(5000);
		 
		 WebElement Click_Verify_Order=  verify_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View\n" + 
		 		"")));
		 Click_Verify_Order.click();			 
		 Thread.sleep(5000);
		 @SuppressWarnings("rawtypes")
		TouchAction ts = new TouchAction(Login.driver);
		 ts.press(PointOption.point(600,600))
		    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		    .moveTo(PointOption.point(600,1250)).release().perform();
		 Thread.sleep(1500);
		 
		 try
		 {
		 WebElement Back_button=verify_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button\n" + 
		 		"")));
		 Back_button.click();
		 Thread.sleep(6000);
		 }
		 catch (Exception e) 
		 {
			 WebElement Back_button=verify_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\n" + 
			 		"")));
			 Back_button.click();
			 Thread.sleep(6000);
		}
		 
	    }
		
	@Test(priority = 11)
		public void Recieve_BillAndReplace_PO() throws InterruptedException 
		{
		
		 WebDriverWait menu= new WebDriverWait(Login.driver, 70);
			try {
				WebElement menu_button=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
			     menu_button.click();
				
			}
			catch (Exception e) 
			{
				WebElement menu_button=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")));
			     menu_button.click();	
			}
			 
			 WebDriverWait receive_wait= new WebDriverWait(Login.driver, 70);
		 WebElement click_receive=  receive_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[8]/android.view.View\n" + 
		 		"")));
		 click_receive.click();
		 Thread.sleep(1000);
		 
		 WebElement Search_Order=  receive_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText")));
		 Search_Order.sendKeys(po_no);
		 Thread.sleep(1000);
		 
		 WebElement Click_Order=  receive_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View\n" + 
		 		"")));
		 Click_Order.click();
		 Thread.sleep(1000);
		 
		 WebElement Receive_Order=  receive_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[1]\n" + 
		 		"")));
		 Receive_Order.click();
		 Thread.sleep(1000);
		 
		 WebDriverWait fill_wait= new WebDriverWait(Login.driver, 70);
		 
		 WebElement Clk_fill_qty=  fill_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button")));
		 Clk_fill_qty.click();
		 Thread.sleep(1000);	
		 
		 WebElement fill_all_qty=   fill_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[1]\n" + 
		 		"")));
		 fill_all_qty.click();
		 Thread.sleep(1000);
		 
		 WebElement Action=   fill_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button\n" + 
		 		"")));
		 Action.click();
		 Thread.sleep(1000);
		 
		 WebElement Complete=   fill_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[1]\n" + 
		 		"")));
		 Complete.click();
		 Thread.sleep(7000);
		 
		 WebDriverWait serial_wait= new WebDriverWait(Login.driver, 70);
		 WebElement enter_receive_serial= serial_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.widget.EditText")));
		 //enter_receive_serial.sendKeys(Orders.getAlphaNumericString(5));
		 Thread.sleep(1000);
		 
		 WebElement enter_lot_no= serial_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View/android.widget.EditText\n" + 
		 		"")));
		 //enter_lot_no.sendKeys(Orders.getAlphaNumericString(5));
		 Thread.sleep(1000);
			 
		// Create object of SimpleDateFormat class and decide the format
		 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
		  WebElement enter_expiry_date= serial_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View/android.widget.EditText")));
		  enter_expiry_date.sendKeys(date1);
		  Thread.sleep(1000);
		  
		  WebElement select_inv_rec= serial_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Select\"]/android.widget.TextView\n" + 
		  		"")));
		  select_inv_rec.click();
		  Thread.sleep(4000);
		  
		  WebElement select_inv_rec1= serial_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View/android.widget.Button\n" + 
		  		"")));
		  select_inv_rec1.click();
		  Thread.sleep(2000);
		  
		  WebElement Click_receive= serial_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.widget.Button")));
		  Click_receive.click();
		  Thread.sleep(7000);
		  
		  try
		  {
		  WebElement Back_order=  serial_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\n" + 
			 		"")));
			 Back_order.click();
			 Thread.sleep(3000);
		  }
		  catch (Exception e) 
		  {
			  WebElement Back_order=  serial_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button\n" + 
				 		"")));
				 Back_order.click();
				 Thread.sleep(3000);
		}
		 
		} 
}
