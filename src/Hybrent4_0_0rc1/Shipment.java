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

public class Shipment 
{

	@Test(priority = 21)
	public void VerifyShipmentButtonTap() throws InterruptedException 
	{

		// Login.wait till the element is not visible.
		//click menu
		Thread.sleep(8000);
		WebDriverWait menu_btn= new WebDriverWait(Login.driver,Duration.ofSeconds(40));
		try {
			WebElement menu_button=menu_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")));
			menu_button.click();
		}
		catch (Exception e) 
		{
			WebElement menu_button=menu_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
			menu_button.click();
		}



		WebElement menu_view=  menu_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View"))); 
		Dimension size = menu_view.getSize();
		System.out.println(size.height+"height");
		System.out.println(size.width+"width");
		System.out.println(size);
		int startPoint = (int) (size.height * 0.73);
		int endPoint = (int) (size.height *0.1);
		int ScreenPlace =(int) (size.width*0.5);  
		TouchAction ts = new TouchAction(Login.driver);
		ts.press(PointOption.point(ScreenPlace,startPoint))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
		.moveTo(PointOption.point(ScreenPlace,endPoint)).release().perform();
		Thread.sleep(1500);
		WebDriverWait detail_page= new WebDriverWait(Login.driver,Duration.ofSeconds(40));
		WebElement click_shipment=  detail_page.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.TextView\n" + 
				"")));
		click_shipment.click();
		Thread.sleep(4000);
		Reporter.log("=====Shipment Started sucessfully=====", true);
	}

	@Test(priority = 22)
	public void VerifyShipmentDeatailPage() throws InterruptedException 
	{	

		WebDriverWait detail_page= new WebDriverWait(Login.driver,Duration.ofSeconds(50));
		try
		{
			WebElement shipment_get= detail_page.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView")));
			String shipment_text= shipment_get.getText();
			assertEquals(shipment_text, "Shipments");
		}
		catch (Exception e) 
		{
			WebElement shipment_get= detail_page.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView\n" + 
					"")));
			String shipment_text= shipment_get.getText();
			assertEquals(shipment_text, "Shipments");
		}



		WebElement click_detail= detail_page.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.TextView[1]\n" + 
				"")));
		click_detail.click();
	}

	@Test(priority = 23)
	public void ReceiveShipment() throws InterruptedException 
	{
		WebDriverWait detail_page= new WebDriverWait(Login.driver,Duration.ofSeconds(50));
		WebElement fill_qty=  detail_page.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button\n" + 
				"")));
		fill_qty.click();

		WebElement fill_all_qty=  detail_page.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[1]\n" + 
				"")));
		fill_all_qty.click();

		WebDriverWait selt_inv= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
		WebElement select_inv=  selt_inv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Apply inventory location for all items\"]/android.widget.TextView\n" + 
				"")));
		select_inv.click();
		Thread.sleep(3000);

		try
		{
			WebElement select_inv1= selt_inv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View/android.widget.Button")));
			select_inv1.click();

			Thread.sleep(3000);
		}
		catch (Exception e) 
		{
			WebElement select_inv1= selt_inv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View/android.widget.Button")));
			select_inv1.click();
			Thread.sleep(3000);
		}

		WebElement Action=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button"));
		Action.click();
		WebElement receive=  selt_inv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button\n" + 
				"")));
		receive.click();
		Thread.sleep(4000);

		try
		{
			WebElement click_shipment1=  selt_inv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText\n" + 
					"")));
			click_shipment1.click();
		}
		catch (Exception e) 
		{
			WebDriverWait popup= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
			WebElement yes_popup=  popup.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[2]")));
			yes_popup.click();

			WebElement min=  popup.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText")));
			min.sendKeys("5");

			WebElement max=  popup.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText")));
			max.sendKeys("15");

			WebElement par=  popup.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.widget.EditText")));
			par.sendKeys("7");

			WebElement add_to_inventory=  popup.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button[2]")));
			add_to_inventory.click();
			Reporter.log("=====Shipment has been Completed sucessfully=====", true);

		}


	}


}






