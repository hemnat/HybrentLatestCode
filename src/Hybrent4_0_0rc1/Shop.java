package Hybrent4_0_0rc1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Shop 
{
	@Test(priority = 7)
	public void Verify_Shop() throws InterruptedException 
	{
		Thread.sleep(7000);
	 //click menu
		WebDriverWait menu= new WebDriverWait(Login.driver,Duration.ofSeconds(40));
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
     WebDriverWait shop_wait= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
	 WebElement click_Shop=  shop_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View\n" + 
	 		"")));
	 click_Shop.click();
	 Thread.sleep(10000);
	 WebElement Verify_shop =  shop_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView\n" + 
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
	
   	WebDriverWait cart_wait= new WebDriverWait(Login.driver,Duration.ofSeconds(0));
   	try
   	{
	WebElement add_to_cart= cart_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[1]\n" + 
			"")));
	 add_to_cart.click();
	 Thread.sleep(4000);
   	}
   	catch (Exception e) 
   	{
   		WebElement add_to_cart= cart_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View\n" + 
   				"")));
   		 add_to_cart.click();
   		 Thread.sleep(4000);
	}
	 
	 
	 WebElement add_to_cart1= cart_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[2]\n" + 
	 		"")));
	 add_to_cart1.click();
	Thread.sleep(3000);
	 
	
	WebElement add_to_cart2= cart_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[2]\n" + 
	 		"")));
	 add_to_cart2.click();
	Thread.sleep(2500);
	
	  
	}
	 
}
