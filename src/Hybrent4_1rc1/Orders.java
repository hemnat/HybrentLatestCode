package Hybrent4_1rc1;



import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Orders {
	
 
	 
	@Test(priority = 12)
	public void Verify_Order() throws InterruptedException 
	{
		Thread.sleep(6000); 
		WebDriverWait po_wait= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
		 //WebElement Refresh_Order=  po_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View")));
		 //Refresh_Order.click();
		 //Thread.sleep(8000);
		
		try
		{
		WebElement get_order= po_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView")));
		String order_text= get_order.getText();
		assertEquals(order_text, "Search Orders");
		}
		catch(Exception e)
		{
			WebElement get_order= po_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView")));
			String order_text= get_order.getText();
			assertEquals(order_text, "Search Orders");
		}
		 
		 WebDriverWait order_wait= new WebDriverWait(Login.driver,Duration.ofSeconds(70));
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
		 Thread.sleep(10000);
		 }
		 catch (Exception e) 
		 {
			 WebElement Back_Order=  order_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button\n" + 
				 		"")));
			  Back_Order.click();			 
			  Thread.sleep(10000);
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
			
	
}
