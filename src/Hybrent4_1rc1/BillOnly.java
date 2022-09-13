package Hybrent4_1rc1;

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


public class BillOnly 
{

	String sku_no;
	String case_no;
	static int endPoint11;
	static int ScreenPlace11;
	static int startPoint11;

	public static String getAlphaNumericString(int n) 
	{ 

		// chose a Character random from this String 
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123";


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

	@Test(priority = 51)
	public void VerifyBillOnlyButtonTap() throws InterruptedException 
	{

		//click menu
		Thread.sleep(5000);
		WebDriverWait menu= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
		try {
			WebElement menu_button=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
			menu_button.click();
			Thread.sleep(1000);
		}
		catch (Exception e) 
		{
			WebElement menu_button=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")));
			menu_button.click();
			Thread.sleep(1000);
		}

		WebDriverWait click= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
		try {

			WebElement click_Bill_only= click.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[7]/android.widget.TextView\n" + 
					"")));
			click_Bill_only.click();
			Thread.sleep(12000);
			Reporter.log("=====BillOnly Started=====", true);
		}
		catch (Exception e) 
		{
			WebElement click_Bill_only= click.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[8]/android.widget.TextView\n" + 
					"")));
			click_Bill_only.click();
			Thread.sleep(12000);
			Reporter.log("=====BillOnly Started=====", true);
		}

		try
		{
			WebElement BillOnly_get= click.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView\n" + 
					"")));
			String BillOnly_text= BillOnly_get.getText();
			assertEquals(BillOnly_text, "Bill Only Cases");
		}
		catch (Exception e) 
		{
			WebElement BillOnly_get= click.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView\n" + 
					"")));
			String BillOnly_text= BillOnly_get.getText();
			assertEquals(BillOnly_text, "Bill Only Cases");
		}
	}

	@Test(priority = 52)
	public void VerifyAddCases() throws InterruptedException 
	{

		WebDriverWait add_cse= new WebDriverWait(Login.driver,Duration.ofSeconds(50));
		WebElement add_case=  add_cse.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.widget.Button\n" + 
				"")));
		add_case.click();
		Thread.sleep(12000);

		WebElement select_patient=   add_cse.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Select\"]/android.widget.TextView")));
		select_patient.click();
		Thread.sleep(2000);

		WebElement select_patient1=   add_cse.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.Button\n" + 
				"")));
		select_patient1.click();
		Thread.sleep(2000);

		WebElement select_physician=   add_cse.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[2]\n" + 
				"")));
		select_physician.click();
		Thread.sleep(2000);

		WebDriverWait add_cse1= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
		WebElement select_physician1=  add_cse1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")));
		select_physician1.click();
		Thread.sleep(2000);

		WebElement select_vendor= add_cse1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[4]/android.view.View[2]\n" + 
				"")));
		select_vendor.click();
		Thread.sleep(2000);

		WebElement select_vendor1=  add_cse1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]\n" + 
				"")));
		select_vendor1.click();
		Thread.sleep(4000);


	}

	@Test(priority = 53)
	public void VerifyAddNewItemBillOnly() throws InterruptedException 
	{
		WebDriverWait add_cse2= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
		WebElement Add_items=add_cse2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")));
		Add_items.click();
		Thread.sleep(2000);


		WebElement Add_bill_only_item=  add_cse2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[2]\n" + 
				"")));
		Add_bill_only_item.click();
		Thread.sleep(1000);

		try
		{
			WebElement enter_sku= add_cse2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText\n" + 
					"")));
			sku_no= BillOnly.getAlphaNumericString(5);
			enter_sku.sendKeys(sku_no);
			Thread.sleep(1000);
		}
		catch (Exception e) 
		{ 
			WebElement enter_sku= add_cse2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText\n" + 
					"")));
			sku_no= BillOnly.getAlphaNumericString(5);
			enter_sku.sendKeys(sku_no);
			Thread.sleep(1000);
		}

		WebDriverWait add_cse3= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
		try
		{
			WebElement enter_decription= add_cse3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.widget.EditText\n" + 
					"")));
			enter_decription.sendKeys("for testing");
			Thread.sleep(1000);
		}
		catch (Exception e) 
		{

			WebElement enter_decription= add_cse3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.widget.EditText\n" + 
					"")));
			enter_decription.sendKeys("for testing");
			Thread.sleep(1000);
		}

		try
		{
			WebElement select_uom_dropdown= add_cse3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[4]/android.view.View[2]")));
			select_uom_dropdown.click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{

			WebElement select_uom_dropdown= add_cse3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[4]/android.widget.Spinner")));
			select_uom_dropdown.click();
			Thread.sleep(2000);
		}

		try
		{
			WebElement select_uom= add_cse3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]\n" + 
					"")));
			select_uom.click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{

			WebElement select_uom= add_cse3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")));
			select_uom.click();
			Thread.sleep(2000);
		}

		try
		{

			WebElement enter_price= add_cse3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[5]/android.widget.EditText\n" + 
					"")));
			enter_price.click();
			enter_price.sendKeys("1.02");
			Thread.sleep(1000);
		}
		catch (Exception e) 
		{
			WebElement enter_price= add_cse3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[5]/android.widget.EditText\n" + 
					"")));
			enter_price.click();
			enter_price.sendKeys("1.02");
			Thread.sleep(1000);
		}

		WebDriverWait add_cse4= new WebDriverWait(Login.driver,Duration.ofSeconds(30));

		try
		{
			WebElement submit=  add_cse4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\n" + 
					"")));
			submit.click();
			Thread.sleep(15000);
		}
		catch (Exception e) 
		{
			WebElement submit=  add_cse4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.widget.Button\n" + 
					"")));
			submit.click();
			Thread.sleep(15000);
		}
	}

	@Test(priority = 54)
	public void GenerateOrderBillOnly() throws InterruptedException 
	{ 
		WebDriverWait add_cse3= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
		WebElement save_and_next= add_cse3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")));
		save_and_next.click();
		Thread.sleep(12000);

		WebElement alert_ok= add_cse3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button\n" + 
				"")));
		alert_ok.click();
		Thread.sleep(12000);

		WebElement menu_view=  add_cse3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View"))); 
		Dimension size11 = menu_view.getSize();
		System.out.println(size11.height+"height");
		System.out.println(size11.width+"width");
		System.out.println(size11);
		startPoint11 = (int) (size11.height * 0.7);
		endPoint11 = (int) (size11.height *0.1);
		ScreenPlace11 =(int) (size11.width*0.5);    
		TouchAction ts1 = new TouchAction(Login.driver);
		ts1.press(PointOption.point(ScreenPlace11,startPoint11)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(ScreenPlace11,endPoint11)).release().perform();

	}

	@Test(priority = 55)
	public void VendorSignature() throws InterruptedException 
	{ 
		WebDriverWait add_sign= new WebDriverWait(Login.driver, 30);
		WebElement Add_Signature= add_sign.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.Button")));
		Add_Signature.click();
		Thread.sleep(1000);

		WebElement Create_vendor_Signature= add_sign.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Image\n" + 
				"")));
		Dimension size1 = Create_vendor_Signature.getSize();
		System.out.println(size1.height+"height");
		System.out.println(size1.width+"width");
		System.out.println(size1);
		int startPoint1 = (int) (size1.height * 1);
		int endPoint1 = (int) (size1.height *0.3);
		int ScreenPlace1 =(int) (size1.width*0.5); 
		int ScreenPlace2 =(int) (size1.width*0.8);  

		@SuppressWarnings("rawtypes")
		TouchAction ts2 = new TouchAction(Login.driver);
		ts2.press(PointOption.point(ScreenPlace1,startPoint1))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		.moveTo(PointOption.point(ScreenPlace1,endPoint1)).release().perform();
		Thread.sleep(1000);
		ts2.press(PointOption.point(ScreenPlace2,startPoint1))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		.moveTo(PointOption.point(ScreenPlace2,endPoint1)).release().perform();
		Thread.sleep(1000);

		WebElement close_sign=  add_sign.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.widget.Button[2]")));
		close_sign.click();
		Thread.sleep(4000);


		ts2.press(PointOption.point(ScreenPlace1,startPoint1))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		.moveTo(PointOption.point(ScreenPlace1,endPoint1)).release().perform();
	}

	@Test(priority = 56)
	public void HospitalSignature() throws InterruptedException 
	{ 
		WebDriverWait add_sign1= new WebDriverWait(Login.driver,Duration.ofSeconds(30));
		WebElement Add_hostpital_Signature=  add_sign1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[4]/android.widget.Button\n" + 
				"")));
		Add_hostpital_Signature.click();
		Thread.sleep(1000);
		
		WebElement Create_hostpital_Signature= add_sign1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Image\n" + 
				"")));
		Dimension size1 = Create_hostpital_Signature.getSize();
		System.out.println(size1.height+"height");
		System.out.println(size1.width+"width");
		System.out.println(size1);
		int startPoint1 = (int) (size1.height * 1);
		int endPoint1 = (int) (size1.height *0.3);
		int ScreenPlace1 =(int) (size1.width*0.5); 
		int ScreenPlace2 =(int) (size1.width*0.8);  

		@SuppressWarnings("rawtypes")
		TouchAction ts2 = new TouchAction(Login.driver);
		ts2.press(PointOption.point(ScreenPlace1,startPoint1))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		.moveTo(PointOption.point(ScreenPlace1,endPoint1)).release().perform();
		Thread.sleep(1000);
		ts2.press(PointOption.point(ScreenPlace2,startPoint1))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		.moveTo(PointOption.point(ScreenPlace2,endPoint1)).release().perform();
		Thread.sleep(1000);
		
		
		/*
		WebElement Create_hostpital_Signature=  add_sign1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[4]/android.widget.Button\n" + 
				"")));
		Create_hostpital_Signature.click();
		Thread.sleep(2000);
		Dimension size1 = Create_hostpital_Signature.getSize();
		TouchAction ts1 = new TouchAction(Login.driver);
		int startPoint1 = (int) (size1.height * 1);
		int endPoint1 = (int) (size1.height *0.3);
		int ScreenPlace1 =(int) (size1.width*0.5); 
		int ScreenPlace2 =(int) (size1.width*0.8); 
		ts1.press(PointOption.point(ScreenPlace1,startPoint1))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		.moveTo(PointOption.point(ScreenPlace1,endPoint1)).release().perform();
		Thread.sleep(1000);
		ts1.press(PointOption.point(ScreenPlace2,startPoint1))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		.moveTo(PointOption.point(ScreenPlace2,endPoint1)).release().perform();
		Thread.sleep(1000);

		ts1.press(PointOption.point(ScreenPlace2,startPoint1))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		.moveTo(PointOption.point(ScreenPlace2,endPoint1)).release().perform();
		Thread.sleep(1000);
		*/

		WebElement close_sign=  add_sign1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.widget.Button[2]")));
		close_sign.click();
		Thread.sleep(4000);

		WebElement Generate_po=   add_sign1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.widget.Button\n" + 
				"")));
		Generate_po.click();
		Thread.sleep(2000);	 

		WebElement SubmitForApproval=   add_sign1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[1]")));
		SubmitForApproval.click();
		Thread.sleep(2000);

		WebElement Backbutton=   add_sign1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
		Backbutton.click();
		Thread.sleep(10000);


	}

	/*
		 WebElement Generate_po=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button"));
		 select_inventory.click();
		 Thread.sleep(1000);

		 WebElement Final_select=  Login.driver.findElement(By.xpath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button"));
		 Final_select.click();
		 Thread.sleep(1000);

		 WebElement Add=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button[2]"));
		 Add.click();
		Thread.sleep(2000);

		WebElement increase_qty=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[4]/android.view.View[2]/android.widget.Button\n" + 
			 		""));
		increase_qty.click();
		Thread.sleep(2000);

		WebElement increase_qty1=  Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[4]/android.view.View[2]/android.widget.Button\n" + 
				 		""));
		increase_qty1.click();
		Thread.sleep(2000);


		WebElement complete= Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button"));
		complete.click();
		Thread.sleep(2000);

		WebElement complete1= Login.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button"));
		complete1.click();
		Thread.sleep(2000);
	 */

}

