package Hybrent3_4_0;

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

public class Claim {
	
	String sku_no;
	String case_no;

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
	
	
	@Test(priority = 25)
	public void Start_New_Claim() throws InterruptedException 
	{
		
		//click menu
				Thread.sleep(5000);
				WebDriverWait menu= new WebDriverWait(Login.driver, 30);
				try {
					WebElement menu_button=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")));
				     menu_button.click();
					
				}
				catch (Exception e) 
				{
					WebElement menu_button=menu.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
				     menu_button.click();	
				}
	   
				WebDriverWait btn_click= new WebDriverWait(Login.driver, 30);
				try
				{
	  WebElement start_new_claim=  btn_click.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[9]/android.view.View\n" + 
	  		"")));
	  start_new_claim.click();
	  Thread.sleep(6000);
	  Reporter.log("=====Claims Started=====", true);
				}
	  catch (Exception e) 
	 {
		WebElement start_new_claim=  btn_click.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[10]/android.view.View\n" + 
						  		"")));
		start_new_claim.click();
		Thread.sleep(6000);
		Reporter.log("=====Claims Started=====", true);
	}
	  
	  WebDriverWait select_ptnt= new WebDriverWait(Login.driver, 80);
	  WebElement select_patient=  select_ptnt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Select Patient\"]/android.widget.TextView\n" + 
	  		"")));
	  select_patient.click();
	  Thread.sleep(2500);
	  
	  WebElement select_patient1=  select_ptnt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button")));
	  select_patient1.click();
	  Thread.sleep(2500);;
	 
	  WebElement Click_Start_cliam=  select_ptnt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button\n" + 
	  		"")));
	  Click_Start_cliam.click();
	  Thread.sleep(2500);
	  
	  WebElement select_physician=  select_ptnt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Select Physician\"]/android.widget.TextView\n" + 
	  		"")));
	  select_physician.click();
	  Thread.sleep(3000);
	  
	  WebElement select_physician1=  select_ptnt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.widget.Button\n" + 
	  		"")));
	  select_physician1.click();
	  Thread.sleep(3000);
	  
	  /*
	  WebElement lenght_of_need=  select_ptnt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[6]/android.widget.Spinner\n" + 
	  		"")));
	  lenght_of_need.click();
	  
	  WebElement lenght_of_need1=  select_ptnt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]\n" + 
	  		"")));
	  lenght_of_need1.click();
	  
	  WebElement indicate_diagnostic=  select_ptnt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[7]/android.widget.Spinner")));
	  indicate_diagnostic.click();
	  
	  WebElement indicate_diagnostic1= select_ptnt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]\n" + 
	  		"")));
	  indicate_diagnostic1.click();
	  
	  WebElement Dx_Type=  select_ptnt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[8]/android.widget.Spinner\n" + 
	  		"")));
	  Dx_Type.click();
	  
	  WebElement Dx_Type1= select_ptnt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]\n" + 
	  		"")));
	  Dx_Type1.click();
	  */
	    
				
	  WebElement Add_Dme=  select_ptnt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")));
	  Add_Dme.click();
	  Thread.sleep(12000);
	  
	 // WebDriverWait find_ele= new WebDriverWait(Login.driver, 50);
	 // WebElement until_ele=  find_ele.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText\n" + 
	  	//	"")));
	  	  
	  @SuppressWarnings("rawtypes")
	TouchAction ts1 = new TouchAction(Login.driver);
	  ts1.longPress(PointOption.point(1000,617))
	    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
	    .moveTo(PointOption.point(450,617)).release().perform();
	  
	  WebDriverWait add_data= new WebDriverWait(Login.driver, 80);
	  WebElement Add=  add_data.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[1]/android.view.View\n" + 
	  		"")));
	  Add.click();
	  
	  WebElement proceed=  add_data.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.Button")));
	  proceed.click();
	  
	  WebElement Action=  add_data.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")));
	  Action.click();
	  
	  WebElement save=  add_data.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[4]\n" + 
	  		"")));
	  save.click();
	  
	  /*
	  WebElement click_patient_signature=  add_data.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[2]\n" + 
	  		"")));
	  click_patient_signature.click();
	  */
	  
	  WebElement Create_patient_Signature=  add_data.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Image")));
		 Dimension size1 = Create_patient_Signature.getSize();
		    System.out.println(size1.height+"height");
		    System.out.println(size1.width+"width");
		     System.out.println(size1);
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
			 
			 
	    WebDriverWait save1= new WebDriverWait(Login.driver, 80);	 
		 WebElement save_sign=  save1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[4]/android.widget.Button[2]\n" + 
		 		"")));
		 save_sign.click();
		 Thread.sleep(3000);
		 
		 /*
		 WebElement Action_button=  save1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button\n" + 
		 		"")));
		 Action_button.click();
			 Thread.sleep(3000);
			 
		WebElement Save_Claim=  save1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[4]")));
		Save_Claim.click();
		Thread.sleep(3000);
		*/
		
				
		WebElement ok_popup=  save1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]")));
		ok_popup.click();
		Thread.sleep(3000);
		
	  	
	}
}
