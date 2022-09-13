package Hybrent3_8_0rc1;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Cart 
{
	   public static String po_no;
		
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
	@Test(priority = 9)
	public void Verify_Cart() throws InterruptedException 
	{
		Thread.sleep(5000);
		WebDriverWait cart_wait1= new WebDriverWait(Login.driver, 30);
		try
		{
		WebElement clk_add_to_cart= cart_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]\n" + 
				"")));
		 clk_add_to_cart.click();
		 Thread.sleep(12000);
		 WebElement cart_get= cart_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]\n" + 
		 		"")));
		 String cart_text= cart_get.getText();
		 assertEquals(cart_text, "Cart");
		}
		catch (Exception e) 
		{
			WebElement clk_add_to_cart= cart_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]")));
			clk_add_to_cart.click();
			Thread.sleep(12000);
			 WebElement cart_get= cart_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]\n" + 
			 		"")));
			String cart_text= cart_get.getText();
		    assertEquals(cart_text, "Cart");
		}
	}
	
	@Test(priority = 10)
	public void Verify_ADDItemsFromCart() throws InterruptedException 
	{
		WebDriverWait cart_wait1= new WebDriverWait(Login.driver, 20);
		WebElement clk_add_items= cart_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.widget.Button\n" + 
				"")));
		clk_add_items.click();
		Thread.sleep(7000);
		 WebElement cart_get= cart_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[1]\n" + 
		 		"")));
		 String cart_text= cart_get.getText();
		assertEquals(cart_text, "Add More Items");
		
		 @SuppressWarnings("rawtypes")
			TouchAction ts = new TouchAction(Login.driver);
		   	 ts.longPress(PointOption.point(1000,1015))
		    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		    .moveTo(PointOption.point(450,1015)).release().perform();
			
		   	WebDriverWait cart_wait= new WebDriverWait(Login.driver, 70);
			WebElement add_to_cart= cart_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[1]/android.view.View\n" + 
					"")));
			 add_to_cart.click();
			 Thread.sleep(2500);
			 
			 try
			 {
			 WebElement add_to_cart1= cart_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.widget.Button[2]")));
			add_to_cart1.click();
			Thread.sleep(2500);
			 }
			 catch (Exception e) 
			 {
				 WebElement add_to_cart1= cart_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]\n" + 
					 		"")));
				add_to_cart1.click();
				Thread.sleep(2500);
			}
			
			/*
			WebElement add_to_cart2= cart_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]\n" + 
					 		"")));
			add_to_cart2.click();
			Thread.sleep(2000);
			*/
			 
		WebDriverWait cart_wait2= new WebDriverWait(Login.driver, 20);
		try
		{
		WebElement cancel_btn= cart_wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.Button\n" + 
				"")));
		cancel_btn.click();
		Thread.sleep(3000);
		}
		catch (Exception e) 
		{
			WebElement cancel_btn= cart_wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Button")));
			cancel_btn.click();
			Thread.sleep(3000);
		}
	}
	
	@Test(priority = 11)
	public void Create_Order() throws InterruptedException 
	{
	 
		WebDriverWait order_wait1= new WebDriverWait(Login.driver, 30);
		WebElement use_my_po_= order_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[4]/android.widget.ListView/android.view.View[4]/android.view.View[2]/android.view.View")));
		use_my_po_.click();
		Thread.sleep(500);
			 
		WebElement enter_orderno_= order_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[4]/android.widget.ListView/android.view.View[5]/android.widget.EditText\n" + 
			 		"")));
		po_no="AutoPO"+Cart.getAlphaNumericString(6);
		enter_orderno_.sendKeys(po_no);
		WebElement use_my_po1_= order_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]\n" + 
				"")));
		use_my_po1_.click();
        Thread.sleep(2000);
			 
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
}
