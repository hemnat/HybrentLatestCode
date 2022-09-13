package Hybrent4_0_0rc1;


import static org.testng.Assert.assertEquals;

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

public class Inventory_Transfer 
{

	static int endPoint11;
	static int ScreenPlace11;
	static int startPoint11;

	@Test(priority = 45)
	public void VerifyInventoryTransferButtonTap() throws InterruptedException 
	{

		//click menu
		Thread.sleep(5000);
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

		WebElement menu_view=  menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View"))); 

		Dimension size11 = menu_view.getSize();
		System.out.println(size11.height+"height");
		System.out.println(size11.width+"width");
		System.out.println(size11);
		startPoint11 = (int) (size11.height * 0.65);
		endPoint11 = (int) (size11.height *0.1);
		ScreenPlace11 =(int) (size11.width*0.5);  
		TouchAction ts11 = new TouchAction(Login.driver);
		ts11.press(PointOption.point(ScreenPlace11,startPoint11))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
		.moveTo(PointOption.point(ScreenPlace11,endPoint11)).release().perform();
		Thread.sleep(1000);
		WebDriverWait inv_rcv= new WebDriverWait(Login.driver,Duration.ofSeconds(30));

		WebElement Click_Inventory_Recieve=  inv_rcv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.TextView\n" + 
				"")));
		Click_Inventory_Recieve.click();
		Thread.sleep(9000);
		Reporter.log("=====Inventory Transfer Started sucessfully=====", true);


		try
		{
			WebElement InvTrs_get= inv_rcv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView")));
			String InvTrs_text= InvTrs_get.getText();
			assertEquals(InvTrs_text, "Inventory Transfer");
		}
		catch (Exception e) 
		{
			WebElement InvTrs_get= inv_rcv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView\n" + 
					"")));
			String InvTrs_text= InvTrs_get.getText();
			assertEquals(InvTrs_text, "Inventory Transfer");
		}
	}


	@Test(priority = 46)
	public void VerifyAddItemTransfer() throws InterruptedException 
	{
		WebDriverWait inv_rcv1= new WebDriverWait(Login.driver,Duration.ofSeconds(40));
		try
		{
			WebElement Add_item=  inv_rcv1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.widget.Button\n" + 
					"")));
			Add_item.click();
			Thread.sleep(7000);
		}
		catch (Exception e)
		{
			WebElement Add_item=  inv_rcv1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")));
			Add_item.click();
			Thread.sleep(7000);
		}


		TouchAction ts1 = new TouchAction(Login.driver);
		ts1.press(PointOption.point(1014,570))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		.moveTo(PointOption.point(650,570)).release().perform();

		try
		{
			WebElement add_btn=  inv_rcv1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.widget.TextView\n" + 
					"")));
			add_btn.click();
			Thread.sleep(4000);
		}
		catch (Exception e) 
		{
			WebElement add_btn=  inv_rcv1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View")));
			add_btn.click();
			Thread.sleep(4000);
		}

		WebDriverWait inv_rcvn= new WebDriverWait(Login.driver,Duration.ofSeconds(40));

		try
		{
			WebElement procced_btn=  inv_rcvn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.widget.Button")));
			procced_btn.click();
			Thread.sleep(8000);
		}
		catch (Exception e) 
		{
			WebElement procced_btn=  inv_rcvn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.Button\n" + 
					"")));
			procced_btn.click();
			Thread.sleep(8000);
		}

		WebElement click_create=  inv_rcvn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")));
		click_create.click();

		WebDriverWait stk_info= new WebDriverWait(Login.driver,Duration.ofSeconds(40));
		WebElement select_to_inv=  stk_info.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Select\"]")));
		select_to_inv.click();
		Thread.sleep(3000);
	}

	@Test(priority = 47)
	public void VerifyCompleteInventoryTransfer() throws InterruptedException 
	{

		WebDriverWait select_t= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
		try
		{
			WebElement select_inv=  select_t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View/android.widget.Button\n" + 
					"")));
			select_inv.click();
		}
		catch (Exception e) 
		{
			WebElement select_inv=  select_t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View/android.widget.Button")));
			select_inv.click();
		}

		WebElement complete=  select_t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button\n" + 
				"")));
		complete.click();

		WebDriverWait slt_inv= new WebDriverWait(Login.driver,Duration.ofSeconds(50));
		WebElement pop_up=  slt_inv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]")));
		pop_up.click();

	}


}
