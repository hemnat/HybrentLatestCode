package Hybrent3_5_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Orders {
	
   String po_no;
	
	
	public static String getAlphaNumericString(int n) 
    { 
  
        // chose a Character random from this String 
        String AlphaNumericString = "0123456789";
                                    
  
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
  
	@Test(priority = 2)
	public void Verify_Shop() throws InterruptedException 
	{
	 
		Thread.sleep(8000);
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
	 
	 //click shop
		WebDriverWait shop_wait= new WebDriverWait(Login.driver, 30);
	 WebElement click_Shop=  shop_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View\n" + 
	 		"")));
	 click_Shop.click();
	 Thread.sleep(7000);
	 
	 @SuppressWarnings("rawtypes")
	TouchAction ts = new TouchAction(Login.driver);
   	 ts.longPress(PointOption.point(1000,617))
    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
    .moveTo(PointOption.point(450,617)).release().perform();
	
   	WebDriverWait cart_wait= new WebDriverWait(Login.driver, 70);
	WebElement add_to_cart= cart_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View\n" + 
			"")));
	 add_to_cart.click();
	 Thread.sleep(2500);
	 
	 WebElement add_to_cart1= cart_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]\n" + 
	 		"")));
	 add_to_cart1.click();
	 Thread.sleep(2500);
	 
	WebElement add_to_cart2= cart_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]\n" + 
	 		"")));
	 add_to_cart2.click();
	 Thread.sleep(2000);
	 
	 /*
	 WebElement add_to_cart3= Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View[9]/android.widget.Button[2]"));
		 add_to_cart3.click();
		 Thread.sleep(500);
		 
		
		  WebElement add_to_cart4= Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View[9]/android.widget.Button[2]"));
		 add_to_cart4.click();
		 Thread.sleep(500);
		 */
		 
	 }
	
	@Test(priority = 3)
	public void Item_added_in_cart() throws InterruptedException 
	{
		WebDriverWait cart_wait1= new WebDriverWait(Login.driver, 30);
		WebElement clk_add_to_cart= cart_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]")));
		 clk_add_to_cart.click();
	}
	 
	@Test(priority = 4)
	public void Create_Order() throws InterruptedException 
	{
	 
		WebDriverWait order_wait1= new WebDriverWait(Login.driver, 30);
		 WebElement use_my_po_= order_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[4]/android.widget.ListView/android.view.View[4]/android.view.View[2]/android.view.View")));
		 use_my_po_.click();
			 Thread.sleep(500);
			 
			 WebElement enter_orderno_= order_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[4]/android.widget.ListView/android.view.View[5]/android.widget.EditText\n" + 
			 		"")));
			 po_no="AutoPO"+Orders.getAlphaNumericString(6);
			 enter_orderno_.sendKeys(po_no);
			 
			 /*
			 WebElement enter_orderno_= Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[4]/android.widget.ListView/android.view.View[6]/android.widget.EditText"));
			 enter_orderno_.clear();
			 po_no="APO"+Orders.getAlphaNumericString(4);
			 enter_orderno_.sendKeys(po_no);
			 */
			 
			 WebDriverWait po_wait= new WebDriverWait(Login.driver, 30);
			 WebElement generate_po_= po_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Button\n" + 
			 		"")));
			 generate_po_.click();
			 Thread.sleep(500);
			 
			 WebElement sure_generate_po_= po_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]")));
			 sure_generate_po_.click();
				 Thread.sleep(5000);
				 
				 /*
				 WebElement min_po_value= Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]"));
				 min_po_value.click();
					 Thread.sleep(500);
					 
					 WebElement po_delay= Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]"));
					 po_delay.click();
						 Thread.sleep(2000);
						 
						 WebElement remaining_budget= Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]\n" + 
									""));
							remaining_budget.click();
							Thread.sleep(2000);
							*/
	 
	}
	
	@Test(priority = 5)
	public void Verify_Order() throws InterruptedException 
	{
		 WebDriverWait po_wait= new WebDriverWait(Login.driver, 30);
		 WebElement Refresh_Order=  po_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View")));
		 Refresh_Order.click();
		 Thread.sleep(8000);
		 
		 WebDriverWait order_wait= new WebDriverWait(Login.driver, 70);
		 /*
		 WebElement Verify_Order=  order_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText\n" + 
		 		"")));
		 Verify_Order.sendKeys(po_no);
		 Thread.sleep(1000);
		 */
		 
		 WebElement Click_Verify_Order= order_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View\n" + 
		 		"")));
		 Click_Verify_Order.click();			 
		 Thread.sleep(7000);
		 
		 try
		 {
		 WebElement Back_Order=  order_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\n" + 
		 		"")));
		 Back_Order.click();			 
		 Thread.sleep(8000);
		 }
		 catch (Exception e) 
		 {
			 WebElement Back_Order=  order_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button\n" + 
				 		"")));
			  Back_Order.click();			 
			  Thread.sleep(8000);
		}
		 
		 
	    }
	   	
	/*
	@Test(priority = 6)
		public void Approve_Order() throws InterruptedException 
		{
		WebDriverWait order_wait= new WebDriverWait(Login.driver, 30);
	    WebElement Approve_Order=  order_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button")));
	    Approve_Order.click();
		Thread.sleep(7000);
		
		/*
		  WebElement ramaning_budget=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]"));
		  ramaning_budget.click();
		   Thread.sleep(4500);
		   }
		   */
		

		
		
	@Test(priority = 7)
		public void Recieve_Order() throws InterruptedException 
		{
		
		WebDriverWait menu= new WebDriverWait(Login.driver, 30);
		try {
			WebElement menu_button=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
		     menu_button.click();
			
		}
		catch (Exception e) 
		{
			WebElement menu_button=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")));
		     menu_button.click();	
		};
			 
			 //click shop
		 WebDriverWait receive_wait= new WebDriverWait(Login.driver, 70);
		 WebElement click_receive= receive_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[8]/android.view.View\n" + 
		 		"")));
			 click_receive.click();
			 Thread.sleep(4000);
			 /*
		 WebElement click_receive=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[8]/android.view.View\n" + 
		 		""));
		 click_receive.click();
		 Thread.sleep(1000);
		 */
		 
		 WebElement Search_Order=  receive_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText")));
		 Search_Order.sendKeys(po_no);
		 Thread.sleep(1000);
		 
		 WebElement Click_Order=  receive_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View\n" + 
		 		"")));
		 Click_Order.click();
		 Thread.sleep(1000);
		 
		 WebDriverWait receive_ord_wait= new WebDriverWait(Login.driver, 70);
		 WebElement Receive_Order= receive_ord_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[1]\n" + 
		 		"")));
		 Receive_Order.click();
		 Thread.sleep(1000);
		 
		 WebElement Clk_fill_qty=  receive_ord_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button")));
		 Clk_fill_qty.click();
		 Thread.sleep(1000);	
		 
		 WebElement fill_all_qty=  receive_ord_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[1]\n" + 
		 		"")));
		 fill_all_qty.click();
		 Thread.sleep(1000);
		 
		 WebDriverWait select_inv_wait= new WebDriverWait(Login.driver, 70);
		 WebElement select_inv=  select_inv_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View\n" + 
		 		"")));
		 select_inv.click();
		 Thread.sleep(4000);
		 
		 try
		 {
		 
			 WebElement select_inv1=  select_inv_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View/android.widget.Button\n" + 
				 		"")));
				 select_inv1.click();
				 Thread.sleep(4000);
			
		 }
		 catch (Exception e) 
		 {
			 WebElement select_inv1=  select_inv_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View/android.widget.Button")));
				select_inv1.click();
				Thread.sleep(4000);
		}
		 
		 WebElement Action=  select_inv_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button\n" + 
		 		"")));
		 Action.click();
		 Thread.sleep(1000);
		 
		 WebElement Complete=  select_inv_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[1]\n" + 
		 		"")));
		 Complete.click();
		 Thread.sleep(5000);
		 
		 
		 
		} 
}
