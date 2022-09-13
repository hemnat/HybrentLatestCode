package Hybrent3_7_0rc2;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Shop2 
{
	@Test(priority = 7)
	public void Verify_Shop() throws InterruptedException 
	{
		Thread.sleep(10000);
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
	 WebElement Verify_shop =  shop_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]\n" + 
	 		"")));
	 String get_shop=Verify_shop.getText();
	 assertEquals(get_shop, "Shop");
  }
	 
	 @Test(priority = 8)
	public void Verify_ItemAddToCart() throws InterruptedException 
		{
	 @SuppressWarnings("rawtypes")
	TouchAction ts = new TouchAction(Login.driver);
   	 ts.longPress(PointOption.point(1000,617))
    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
    .moveTo(PointOption.point(450,617)).release().perform();
	
   	WebDriverWait cart_wait= new WebDriverWait(Login.driver, 70);
   	try
   	{
	WebElement add_to_cart= cart_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[1]\n" + 
			"")));
	 add_to_cart.click();
	 Thread.sleep(2500);
   	}
   	catch (Exception e) 
   	{
   		WebElement add_to_cart= cart_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View\n" + 
   				"")));
   		 add_to_cart.click();
   		 Thread.sleep(2500);
	}
	 
	 
	 WebElement add_to_cart1= cart_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]\n" + 
	 		"")));
	 add_to_cart1.click();
	 Thread.sleep(5000);
	 
	 /*
	WebElement add_to_cart2= cart_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]\n" + 
	 		"")));
	 add_to_cart2.click();
	 Thread.sleep(2000);
	  */
		}
	 
	 /*
	 WebElement add_to_cart3= Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View[9]/android.widget.Button[2]"));
		 add_to_cart3.click();
		 Thread.sleep(500);
		 
		
		  WebElement add_to_cart4= Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View[9]/android.widget.Button[2]"));
		 add_to_cart4.click();
		 Thread.sleep(500);
		 */
	
}
