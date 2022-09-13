package Hybrent4_0_0rc1;



import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Receive_Orders 
{
	@Test(priority = 13)
	public void VerifyTap_ReceiveOrder() throws InterruptedException 
	{
	
	WebDriverWait menu= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
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
	 WebDriverWait receive_wait= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
	 WebElement click_receive= receive_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[8]\n" + 
	 		"")));
		 click_receive.click();
		 Thread.sleep(9000);
		 try
		 {
		 WebElement receive_get= receive_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView")));
		String order_text= receive_get.getText();
		assertEquals(order_text, "Receive Orders");
		 }
		 catch (Exception e) 
		 {
			 WebElement receive_get= receive_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView\n" + 
			 		"")));
				String order_text= receive_get.getText();
				assertEquals(order_text, "Receive Orders");// TODO: handle exception
		}
		 
		 /*
	 WebElement click_receive=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[8]/android.view.View\n" + 
	 		""));
	 click_receive.click();
	 Thread.sleep(1000);
	 */
	}
	@Test(priority = 14)
		public void VerifySearch_Order() throws InterruptedException 
			{
		WebDriverWait receive_wait= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
	 WebElement Search_Order=  receive_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText")));
	 Search_Order.sendKeys(Hybrent4_0_0rc1.Cart.po_no);
	 Thread.sleep(2000);
	 
	 WebElement Click_Order=  receive_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View\n" + 
	 		"")));
	 Click_Order.click();
	 Thread.sleep(1000);
			}
	 
	@Test(priority = 15)
	public void Verify_ReceiveOrder() throws InterruptedException 
		{
	 WebDriverWait receive_ord_wait= new WebDriverWait(Login.driver,Duration.ofSeconds(70));
	 WebElement Receive_Order= receive_ord_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[1]\n" + 
	 		"")));
	 Receive_Order.click();
	 Thread.sleep(2500);
	 
	 WebElement Clk_fill_qty=  receive_ord_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]\n" + 
	 		"")));
	 Clk_fill_qty.click();
	 Thread.sleep(1000);	
	 
	 WebElement fill_all_qty=  receive_ord_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[1]\n" + 
	 		"")));
	 fill_all_qty.click();
	 Thread.sleep(1000);
	 
	 WebDriverWait select_inv_wait= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
	 WebElement select_inv=  select_inv_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Apply inventory location for all items\"]/android.widget.TextView\n" + 
	 		"")));
	 select_inv.click();
	 Thread.sleep(4000);
	 
	 try
	 {
	 
		 WebElement select_inv1=  select_inv_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View/android.widget.Button")));
			 select_inv1.click();
			 Thread.sleep(4000);
		
	 }
	 catch (Exception e) 
	 {
		 WebElement select_inv1=  select_inv_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View/android.widget.Button")));
			select_inv1.click();
			Thread.sleep(4000);
	}
	 
	 WebDriverWait select_inv_wait1= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
	 try
	 {
	 WebElement Action=  select_inv_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button\n" + 
	 		"")));
	 Action.click();
	 Thread.sleep(1000);
	 }
	 catch (Exception e) 
	 {
		 WebElement Action=  select_inv_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button\n" + 
			 		"")));
			 Action.click();
			 Thread.sleep(1000);
	}
	 
	 WebElement Complete=  select_inv_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[1]\n" + 
	 		"")));
	 Complete.click();
	 Thread.sleep(8000); 
	 
	} 
}