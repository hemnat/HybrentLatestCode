package Hybrent3_8_0rc1;



import static org.testng.Assert.assertEquals;

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
	 WebDriverWait receive_wait= new WebDriverWait(Login.driver, 30);
	 WebElement click_receive= receive_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[8]/android.view.View\n" + 
	 		"")));
		 click_receive.click();
		 Thread.sleep(9000);
		 WebElement receive_get= receive_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]")));
		String order_text= receive_get.getText();
		assertEquals(order_text, "Receive Orders");
		 
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
		WebDriverWait receive_wait= new WebDriverWait(Login.driver, 30);
	 WebElement Search_Order=  receive_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText")));
	 Search_Order.sendKeys(Hybrent3_7_0rc3.Cart.po_no);
	 Thread.sleep(1000);
	 
	 WebElement Click_Order=  receive_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View\n" + 
	 		"")));
	 Click_Order.click();
	 Thread.sleep(1000);
			}
	 
	@Test(priority = 15)
	public void Verify_ReceiveOrder() throws InterruptedException 
		{
	 WebDriverWait receive_ord_wait= new WebDriverWait(Login.driver, 70);
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
	 
	 WebDriverWait select_inv_wait= new WebDriverWait(Login.driver, 70);
	 WebElement select_inv=  select_inv_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Apply inventory location for all items\"]/android.widget.TextView\n" + 
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