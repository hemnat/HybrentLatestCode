package Hybrent4_0_0rc1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class Warehouse 
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

	@Test(priority = 36)
	public void Verify_WarehouseShop() throws InterruptedException 
	{
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
		System.out.println(size.height+" height");
		System.out.println(size.width+" width");
		System.out.println(size);
		int startPoint = (int) (size.height * 0.9);
		int endPoint = (int) (size.height *0.3);
		int ScreenPlace =(int) (size.width*0.5);  
		TouchAction ts = new TouchAction(Login.driver);
		ts.press(PointOption.point(ScreenPlace,endPoint))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
		.moveTo(PointOption.point(ScreenPlace,startPoint)).release().perform();
		Thread.sleep(1500);

		WebDriverWait shop_wait= new WebDriverWait(Login.driver,Duration.ofSeconds(40));
		WebElement click_shop=  shop_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View")));
		click_shop.click();
		Thread.sleep(10000);
		Reporter.log("=====Shop Started sucessfully=====", true);
	}

	@Test(priority = 37)
	public void Verify_Warehousefacility() throws InterruptedException 
	{
		WebDriverWait itemAdd= new WebDriverWait(Login.driver,Duration.ofSeconds(20));
		WebElement Click_facility=itemAdd.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.TextView[1]")));
		Click_facility.click();
		Thread.sleep(3000);

		WebElement Close_facility=itemAdd.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.Button")));
		Close_facility.click();
		Thread.sleep(4000);


	}

	@Test(priority = 38)
	public void Verify_WarehouseitemAddInShop() throws InterruptedException 
	{

		WebDriverWait itemAdd= new WebDriverWait(Login.driver,Duration.ofSeconds(20));
		WebElement search_item=itemAdd.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText")));
		search_item.sendKeys("internal_mobile");
		Thread.sleep(5000);

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

	@Test(priority = 39)
	public void Verify_WarehouseItemInCart() throws InterruptedException 
	{
		Thread.sleep(8000);
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

		WebElement click_home=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]")));
		click_home.click();
		Thread.sleep(8000);


		WebDriverWait cart_wait1= new WebDriverWait(Login.driver,Duration.ofSeconds(30));

		String invalidcharacter= "\"\"";
		String first= "//android.view.View[@content-desc=";
		String second="]";
		String Final= first+invalidcharacter+second;
		System.out.println(Final);

		WebElement clk_add_to_cart= cart_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Final)));
		clk_add_to_cart.click();
		Thread.sleep(12000);

		try
		{
			WebElement cart_get= cart_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView\n" + 
					"")));
			String cart_text= cart_get.getText();
			assertEquals(cart_text, "Cart");
		}
		catch(Exception e)
		{				
			WebElement cart_get= cart_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView")));
			String cart_text= cart_get.getText();
			assertEquals(cart_text, "Cart");
		}
	}
	@Test(priority = 40)
	public void Create_WarehouseOrder() throws InterruptedException 
	{
		WebDriverWait order_wait1= new WebDriverWait(Login.driver,Duration.ofSeconds(50));
		try 
		{
			WebElement use_my_po_= order_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[4]/android.widget.ListView/android.view.View[6]/android.view.View")));
			use_my_po_.click();
			Thread.sleep(500);
		}
		catch (Exception e) 
		{

			WebElement use_my_po_= order_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[4]/android.widget.ListView/android.view.View[5]/android.view.View\n" + 
					"")));
			use_my_po_.click();
			Thread.sleep(500);
		}

		try
		{
			WebElement enter_orderno_= order_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[4]/android.widget.ListView/android.view.View[7]/android.widget.EditText")));
			po_no="InternalPO"+Cart.getAlphaNumericString(6);
			enter_orderno_.sendKeys(po_no);
			WebElement use_my_po1_= order_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[4]/android.widget.ListView/android.view.View[7]/android.widget.EditText")));
			use_my_po1_.click();
			Thread.sleep(2000);

		}
		catch(Exception e)
		{
			WebElement enter_orderno_= order_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[4]/android.widget.ListView/android.view.View[6]/android.widget.EditText\n" + 
					"")));
			po_no="InternalPO"+Cart.getAlphaNumericString(6);
			enter_orderno_.sendKeys(po_no);
			WebElement use_my_po1_= order_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[4]/android.widget.ListView/android.view.View[6]/android.widget.EditText\n" + 
					"")));
			use_my_po1_.click();
			Thread.sleep(2000);

		}


		WebDriverWait po_wait= new WebDriverWait(Login.driver,Duration.ofSeconds(30));

		try
		{
			WebElement generate_po_= po_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.widget.Button\n" + 
					"")));
			generate_po_.click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			WebElement generate_po_= po_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.widget.Button")));
			generate_po_.click();
			Thread.sleep(1000);
		}

		WebElement sure_generate_po_= po_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[2]\n" + 
				"")));
		sure_generate_po_.click();
		Thread.sleep(5000);
	}

	@Test(priority = 41)
	public void Verify_Warehouseorder() throws InterruptedException 
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

	@Test(priority = 42)
	public void Verify_WarehouseModuleTap() throws InterruptedException 
	{

		//click menu
		Thread.sleep(8000);
		WebDriverWait menu= new WebDriverWait(Login.driver,Duration.ofSeconds(20));

		try {
			WebElement menu_button=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")));
			menu_button.click();
		}
		catch (Exception e) 
		{
			WebElement menu_button=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
			menu_button.click();
		}

		WebElement menu_view=  menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View"))); 
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

		try
		{
			WebElement Click_warehouse=  menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[5]/android.widget.TextView\n" + 
					"")));
			Click_warehouse.click();
			Thread.sleep(5000);
			Reporter.log("=====Warehouse Started sucessfully=====", true);
		}
		catch (Exception e) 
		{
			WebElement Click_warehouse=  menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[6]/android.widget.TextView\n" + 
					"")));
			Click_warehouse.click();
			Thread.sleep(5000);
			Reporter.log("=====Warehouse Started sucessfully=====", true);
		}

	}

	@Test(priority = 43)
	public void Verify_WarehouseOrder() throws InterruptedException 
	{
		WebDriverWait vorder= new WebDriverWait(Login.driver,Duration.ofSeconds(20));

		WebElement select_facility=vorder.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.TextView")));
		select_facility.click();

		WebElement select_facility1=vorder.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("Cardiology Facility (22)")));
		select_facility1.click();

		WebElement search_facility=vorder.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText")));
		search_facility.sendKeys("single_ware");

		WebElement search_click=vorder.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.Button")));
		search_click.click();

		WebElement Final_Select=vorder.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.widget.Button")));
		Final_Select.click();
		Thread.sleep(3000);

		WebElement Apply_filter=vorder.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button[2]")));
		Apply_filter.click();
		Thread.sleep(3000);

	}

	@Test(priority = 44)
	public void Verify_CreatedWarehouseOrder() throws InterruptedException 
	{
		WebDriverWait order= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
		WebElement SearchOrder=order.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText")));
		SearchOrder.sendKeys(po_no);
		Thread.sleep(3000);

		WebElement ClickSearchOrder=order.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.Button[2]")));
		ClickSearchOrder.click();
		Thread.sleep(5000);
	}

	@Test(priority = 45)
	public void Verify_WarehouseOrderDetail() throws InterruptedException 
	{
		WebDriverWait Detail= new WebDriverWait(Login.driver,Duration.ofSeconds(20));
		WebElement ClickOrderDetail=Detail.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[4]/android.view.View/android.widget.TextView[1]")));
		ClickOrderDetail.click();
		Thread.sleep(7000);

		WebElement menu_view=  Detail.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]"))); 
		Dimension size11 = menu_view.getSize();
		System.out.println(size11.height+"height");
		System.out.println(size11.width+"width");
		System.out.println(size11);
		int startPoint11 = (int) (size11.height * 0.7);
		int endPoint11 = (int) (size11.height *0.1);
		int ScreenPlace11 =(int) (size11.width*0.5);    
		TouchAction ts1 = new TouchAction(Login.driver);
		ts1.press(PointOption.point(ScreenPlace11,startPoint11)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(ScreenPlace11,endPoint11)).release().perform();
		Thread.sleep(1000);

		WebDriverWait Intitem= new WebDriverWait(Login.driver,Duration.ofSeconds(20));
		WebElement Click_Intitem=Intitem.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.widget.TextView")));
		Click_Intitem.click();
	}
	@Test(priority = 46)
	public void Select_WarehouseInventory() throws InterruptedException 
	{
		WebDriverWait Slt_Inv= new WebDriverWait(Login.driver,Duration.ofSeconds(30));

		WebElement Slt_Inv1=Slt_Inv.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("Select")));
		Slt_Inv1.click();
		Thread.sleep(2500);

		WebElement final_Inv_Select=Slt_Inv.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.widget.Button")));
		final_Inv_Select.click();
		Thread.sleep(2500);
	}

	@Test(priority = 47)
	public void IncreaseItemQuantity() throws InterruptedException 
	{
		WebDriverWait increase= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
		WebElement Increase_qty=increase.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.view.View[@content-desc=\"\"]/android.widget.TextView")));
		Increase_qty.click();
		Thread.sleep(2000);

		Increase_qty.click();
		Thread.sleep(2000);

		Increase_qty.click();
		Thread.sleep(2000);

		Increase_qty.click();
		Thread.sleep(2000);

		Increase_qty.click();
		Thread.sleep(2000);

		Increase_qty.click();
		Thread.sleep(2000);

		Increase_qty.click();
		Thread.sleep(2000);

		Increase_qty.click();
		Thread.sleep(2000);

		Increase_qty.click();
		Thread.sleep(2000);

		Increase_qty.click();
		Thread.sleep(2000);

		Increase_qty.click();
		Thread.sleep(2000);

		Increase_qty.click();
		Thread.sleep(2000);

		Increase_qty.click();
		Thread.sleep(2000);

		Increase_qty.click();
		Thread.sleep(2000);

		WebElement click_save=increase.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button")));
		click_save.click();
		Thread.sleep(7000);

	}

	@Test(priority = 48)
	public void AddToScanout() throws InterruptedException 
	{
		WebDriverWait More= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
		WebElement Select_item=More.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.widget.CheckBox")));
		Select_item.click();
		Thread.sleep(2000);

		WebElement click_more=More.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button")));
		click_more.click();
		Thread.sleep(2000);

		WebElement click_AddToScanout=More.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[4]")));
		click_AddToScanout.click();
		Thread.sleep(6000);
	}

	@Test(priority = 49)
	public void VerifyPicked() throws InterruptedException 
	{
		WebDriverWait Picked= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
		WebElement click_picked=Picked.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("Picked")));
		click_picked.click();
		Thread.sleep(4000);
	}

	@Test(priority = 50)
	public void VerifyDeleteAllItem() throws InterruptedException 
	{
		WebDriverWait Delete= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
		WebElement click_more=Delete.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button")));
		click_more.click();
		Thread.sleep(2000);

		WebElement DeleteAllItem=Delete.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[3]")));
		DeleteAllItem.click();
		Thread.sleep(2000);

		WebElement confirm_delete=Delete.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[2]")));
		confirm_delete.click();
		Thread.sleep(7000);

		WebDriverWait Delete1= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
		try
		{
			WebElement back_button=Delete1.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")));
			back_button.click();
			Thread.sleep(20000);
		}
		catch(Exception e)
		{
			WebElement back_button=Delete1.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
			back_button.click();
			Thread.sleep(20000);

		}
	}
	@Test(priority = 51)
	public void VerifyWarehosueItemInScanout() throws InterruptedException 
	{
		WebDriverWait menu_btn= new WebDriverWait(Login.driver,Duration.ofSeconds(20));
		try 
		{

			WebElement menu_button=menu_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
			menu_button.click();
		}
		catch (Exception e) 
		{
			WebElement menu_button=menu_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")));
			menu_button.click();
		}


		try
		{
			WebElement scan_out=  menu_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[7]/android.view.View")));
			scan_out.click();
			Thread.sleep(5000);
			Reporter.log("=====ScanOut Started=====", true);
		}
		catch (Exception e) 
		{
			WebElement scan_out=  menu_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[8]/android.view.View")));
			scan_out.click();
			Thread.sleep(5000);
			Reporter.log("=====ScanOut Started=====", true);
		}

		try
		{
			WebElement scanout_get= menu_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView\n" + 
					"")));
			String scanout_text= scanout_get.getText();
			assertEquals(scanout_text, "Scan Out");
		}

		catch (Exception e) 
		{
			WebElement scanout_get= menu_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView")));
			String scanout_text= scanout_get.getText();
			assertEquals(scanout_text, "Scan Out");
		}
	}



	@Test(priority = 52)
	public void SelectWarehosueFacilityInScanout() throws InterruptedException 
	{
		WebDriverWait Select= new WebDriverWait(Login.driver,Duration.ofSeconds(40));

		WebElement select_facility=Select.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.TextView")));
		select_facility.click();

		WebElement select_facility1=Select.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("Cardiology Facility (22)")));
		select_facility1.click();

		WebElement search_facility=Select.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText")));
		search_facility.sendKeys("single_ware");

		WebElement search_click=Select.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.Button")));
		search_click.click();

		WebElement Final_Select=Select.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.widget.Button")));
		Final_Select.click();
		Thread.sleep(3000);

		WebElement Apply_filter=Select.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button[2]")));
		Apply_filter.click();
		Thread.sleep(5000);
	}

	

	@Test(priority = 53)
	public void Verify_Complete_ScanOutForWarehouseItem() throws InterruptedException 
	{
		WebDriverWait complete_t= new WebDriverWait(Login.driver,Duration.ofSeconds(20));

		try 
		{
			WebElement complete= complete_t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.Button\n" + 
					"")));
			complete.click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			WebElement complete= complete_t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button\n" + 
					"")));
			complete.click();
			Thread.sleep(2000);
		}

		WebElement Cancel_charge=  complete_t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[1]")));
		Cancel_charge.click();

		WebElement auto_attach= complete_t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[2]\n" + 
				"")));
		auto_attach.click();
		Thread.sleep(2000);


		WebElement complete1= complete_t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button[2]\n" + 
				"")));
		complete1.click();
	}
}

