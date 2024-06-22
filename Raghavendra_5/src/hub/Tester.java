package hub;
import java.awt.AWTException;
import org.openqa.selenium.TakesScreenshot;
import java.util.NoSuchElementException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import java.lang.Math;
import java.io.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver.TargetLocator.*;


public class Tester{
	
	WebDriver driver;
    String s = "clubhouse";
    long d = System.currentTimeMillis();
    String username=(s + d );
	
	@Test(priority=1)
	public void signup1() throws IOException, AWTException, InterruptedException,NoAlertPresentException
	{
		   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
		   driver =new ChromeDriver();
		    
		   driver.get("https://app.hubbleconnected.com/");
		   Xpaths obj=new Xpaths(driver);
		   obj.clickLogin();
		   obj.user("");
		   obj.email("");
		   obj.setPass("");
		   obj.repass("");
		   obj.checkpolicy();
		   obj.checkpromo();
		   driver.manage().window().maximize();	
		   obj.createac();
		   Thread.sleep(2000);
		   //TakesScreenshot scrShot =((TakesScreenshot) driver);
		   //File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		   //File DestFile=new File("C:\\Java");
		   //FileUtils.copyFile(SrcFile, DestFile);
		   //WebElement ele=driver.findElement(By.xpath("//*[contains(text(),'Please fill out this field.')]"));
		   //boolean b=ele.isDisplayed();
		   //String b=driver.switchTo().alert().getText();
		   //System.out.println(b);
		   //if(b="hhh")
		   //{
			//   System.out.println("Error message displayed");
		   //} 
		   //else
		  // {
			//   System.out.println("Error message not displayed");
		   //}
		  driver.navigate().refresh();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
	}
	
	
	
//case2	     
		   // myObj = new Main(); // Create an object of Main
		   // myObj.myPublicMethod();
	
	@Test(priority=2)
	public void signup2() throws IOException, AWTException, InterruptedException,NoAlertPresentException
	{
		driver.navigate().refresh();		   
		   Xpaths obj=new Xpaths(driver);
		   obj.user("User");
		   obj.email("lang3656565@gmail.com");
		   obj.setPass("Qwerty123");
		   obj.repass("Qwerty123");
		   obj.checkpolicy();
		   obj.checkpromo();
		   driver.manage().window().maximize();	
		   obj.createac();
		   Thread.sleep(1000);
		   WebElement ele=driver.findElement(By.className("hubble-error-msg"));
		   boolean b=ele.isDisplayed();
		   System.out.println(b);
		   if(b)
		   {
			   System.out.println("Error message displayed");
		   } 
		   else
		   {
			   System.out.println("Error message not displayed");
		   }
		   
	}

	
	@Test(priority=3)
	public void signup3() throws IOException, AWTException, InterruptedException,NoAlertPresentException
	{
		driver.navigate().refresh();		   
		   Xpaths obj=new Xpaths(driver);
		   obj.user("User");
		   obj.email("lang3656565@gmail.com");
		   obj.setPass("");
		   obj.repass("Qwerty123");
		   obj.checkpolicy();
		   obj.checkpromo();
		   driver.manage().window().maximize();	
		   obj.createac();
		   Thread.sleep(1000);
		   WebElement ele=driver.findElement(By.className("hubble-error-msg"));
		   boolean b=ele.isDisplayed();
		   System.out.println(b);
		   if(b)
		   {
			   System.out.println("Error message displayed");
		   } 
		   else
		   {
			   System.out.println("Error message not displayed");
		   }
		   
	}
	@Test(priority=4)
	public void signup4() throws IOException, AWTException, InterruptedException,NoAlertPresentException
	{
		driver.navigate().refresh();		   
		   Xpaths obj=new Xpaths(driver);
		   obj.user("User");
		   obj.email("");
		   obj.setPass("Qwerty123");
		   obj.repass("Qwerty123");
		   obj.checkpolicy();
		   obj.checkpromo();
		   driver.manage().window().maximize();	
		   obj.createac();
		   Thread.sleep(1000);
		   WebElement ele=driver.findElement(By.className("hubble-error-msg"));
		   boolean b=ele.isDisplayed();
		   System.out.println(b);
		   if(b)
		   {
			   System.out.println("Error message displayed");
		   } 
		   else
		   {
			   System.out.println("Error message not displayed");
		   }
		   
	}
	
	@Test(priority=5)
	public void signup5() throws IOException, AWTException, InterruptedException,NoAlertPresentException
	{
		driver.navigate().refresh();		   
		   Xpaths obj=new Xpaths(driver);
		   obj.user("");
		   obj.email("lang3656565@gmail.com");
		   obj.setPass("Qwerty123");
		   obj.repass("Qwerty123");
		   obj.checkpolicy();
		   obj.checkpromo();
		   driver.manage().window().maximize();	
		   obj.createac();
		   Thread.sleep(1000);
		   WebElement ele=driver.findElement(By.className("hubble-error-msg"));
		   boolean b=ele.isDisplayed();
		   System.out.println(b);
		   if(b)
		   {
			   System.out.println("Error message displayed");
		   } 
		   else
		   {
			   System.out.println("Error message not displayed");
		   }
		   
	}	
	
	@Test(priority=6)
	public void signup6() throws IOException, AWTException, InterruptedException,NoAlertPresentException
	{
		driver.navigate().refresh();		   
		   Xpaths obj=new Xpaths(driver);
		   obj.user("User");
		   obj.email("lang3656565@gmail.com");
		   obj.setPass("");
		   obj.repass("Qwerty123");
		   obj.checkpolicy();
		   obj.checkpromo();
		   driver.manage().window().maximize();	
		   obj.createac();
		   Thread.sleep(1000);
		   WebElement ele=driver.findElement(By.className("hubble-error-msg"));
		   boolean b=ele.isDisplayed();
		   System.out.println(b);
		   if(b)
		   {
			   System.out.println("Error message displayed");
		   } 
		   else
		   {
			   System.out.println("Error message not displayed");
		   }
		   
	}	
	
	@Test(priority=7)
	public void signup7() throws IOException, AWTException, InterruptedException,NoAlertPresentException
	{
		driver.navigate().refresh();		   
		   Xpaths obj=new Xpaths(driver);
		   obj.user("User");
		   obj.email("lang3656565@gmail.com");
		   obj.setPass("Qwerty123");
		   obj.repass("");
		   obj.checkpolicy();
		   obj.checkpromo();
		   driver.manage().window().maximize();	
		   obj.createac();
		   Thread.sleep(1000);
		   WebElement ele=driver.findElement(By.className("hubble-error-msg"));
		   boolean b=ele.isDisplayed();
		   System.out.println(b);
		   if(b)
		   {
			   System.out.println("Error message displayed");
		   } 
		   else
		   {
			   System.out.println("Error message not displayed");
		   }
		   
	}	
	
	@Test(priority=8)
	public void signup8() throws IOException, AWTException, InterruptedException,NoAlertPresentException
	{
		driver.navigate().refresh();		   
		   Xpaths obj=new Xpaths(driver);
		   obj.user("User");
		   obj.email("lang3656565@gmail.com");
		   obj.setPass("Qwerty123");
		   obj.repass("");
		   obj.checkpromo();
		   driver.manage().window().maximize();	
		   obj.createac();
		   Thread.sleep(1000);
		   WebElement ele=driver.findElement(By.className("hubble-error-msg"));
		   boolean b=ele.isDisplayed();
		   System.out.println(b);
		   if(b)
		   {
			   System.out.println("Error message displayed");
		   } 
		   else
		   {
			   System.out.println("Error message not displayed");
		   }
		   
	}
	
	@Test(priority=9)
	public void signup9() throws IOException, AWTException, InterruptedException,NoAlertPresentException
	{
		driver.navigate().refresh();		   
		   Xpaths obj=new Xpaths(driver);
		   obj.user("User");
		   obj.email("lang3656565@gmail.com");
		   obj.setPass("Qwerty123");
		   obj.repass("Qwerty123");
		   obj.checkpolicy();
		   driver.manage().window().maximize();	
		   obj.createac();
		   Thread.sleep(1000);
		   WebElement ele=driver.findElement(By.className("hubble-error-msg"));
		   boolean b=ele.isDisplayed();
		   System.out.println(b);
		   if(b)
		   {
			   System.out.println("Error message displayed");
		   } 
		   else
		   {
			   System.out.println("Error message not displayed");
		   }
		   
	}	
	
	@Test(priority=10)
	public void signup10() throws IOException, AWTException, InterruptedException,NoAlertPresentException
	{
		driver.navigate().refresh();		   
		   Xpaths obj=new Xpaths(driver);
		   obj.user("User");
		   obj.email("lang3656565@gmail.com");
		   obj.setPass("Qwerty123");
		   obj.repass("Qwerty123");
		   driver.manage().window().maximize();	
		   obj.createac();
		   Thread.sleep(1000);
		   WebElement ele=driver.findElement(By.className("hubble-error-msg"));
		   boolean b=ele.isDisplayed();
		   System.out.println(b);
		   if(b)
		   {
			   System.out.println("Error message displayed");
		   } 
		   else
		   {
			   System.out.println("Error message not displayed");
		   }
		   
	}
	
	@Test(priority=11)
	public void signup11() throws IOException, AWTException, InterruptedException,NoAlertPresentException
	{
		driver.navigate().refresh();		   
		   Xpaths obj=new Xpaths(driver);
		   obj.user("Uhhvser");
		   obj.email("lang3656565@gmail.com");
		   obj.setPass("Qwerty1234");
		   obj.repass("Qwerty123");
		   obj.checkpolicy();
		   obj.checkpromo();
		   driver.manage().window().maximize();	
		   obj.createac();
		   Thread.sleep(1000);
		   WebElement ele=driver.findElement(By.className("hubble-error-msg"));
		   boolean b=ele.isDisplayed();
		   System.out.println(b);
		   if(b)
		   {
			   System.out.println("Error message displayed");
		   } 
		   else
		   {
			   System.out.println("Error message not displayed");
		   }
		   
	}
		   
		
	



	@Test(priority=12)
    public void signup12 () throws IOException, AWTException, InterruptedException,NoAlertPresentException
    {
	   driver.navigate().refresh();		   
	   Xpaths obj=new Xpaths(driver);
	   
	   obj.support1();
	   String t = driver.getTitle();
	   String parent=driver.getWindowHandle();
	   
	   driver.switchTo().window(parent);
	   System.out.println(t);
    }
	   
   /*
	// This will return the number of windows opened by Webdriver and will return Set of St//rings
	Set<String>s1=driver.getWindowHandles();
	 
	// Now we will iterate using Iterator
	Iterator<String> I1= s1.iterator();
	 
	while(I1.hasNext())
	{
	 
	   String child_window=I1.next();
	 
	// Here we will compare if parent window is not equal to child window then we            will close
	 
	if(!parent.equals(child_window))
	{
	driver.switchTo().window(child_window);
	 
	System.out.println(driver.switchTo().window(child_window).getTitle());
	 
	driver.close();
	}
	 
	}
	// once all pop up closed now switch to parent window
	driver.switchTo().window(parent);
	 
	}
*/
@Test(priority=13)
public void signup13 () throws IOException, AWTException, InterruptedException,NoAlertPresentException
{
	   driver.navigate().refresh();		   
	   Xpaths obj=new Xpaths(driver);
	   obj.coockies1();
	   Thread.sleep(2000);
	   String f = driver.getTitle();
	   String parent=driver.getWindowHandle();
	   driver.switchTo().window(parent);
	   System.out.println(f);
}

@Test(priority=14)
public void signup14 () throws IOException, AWTException, InterruptedException,NoAlertPresentException
{
	   driver.navigate().refresh();		   
	   Xpaths obj=new Xpaths(driver);
	   obj.privacy1();
	   Thread.sleep(3000);
	   String parent=driver.getWindowHandle();
	   String h = driver.getTitle();
	   driver.switchTo().window(parent);
	   System.out.println(h);

}


@Test(priority=15)
public void signup15 () throws IOException, AWTException, InterruptedException,NoAlertPresentException
{
	   driver.navigate().refresh();		   
	   Xpaths obj=new Xpaths(driver);   
	   obj.terms1();
	   Thread.sleep(9000);
	   String parent=driver.getWindowHandle();
	   String h = driver.getTitle();
	   driver.switchTo().window(parent);
	   System.out.println(h);

}





//@Test(priority=16)
//public void signup16 () throws IOException, AWTException, InterruptedException,NoAlertPresentException
//{
//	   driver.navigate().refresh();
//	   Xpaths obj=new Xpaths(driver);
//	   obj.store1();
//	   Thread.sleep(3000);
//	   String parent=driver.getWindowHandle();
//	   String h = driver.getTitle();
//	   driver.switchTo().window(parent);
//	   System.out.print(h);
//}


@Test(priority=16)
public void signup16 () throws IOException, AWTException, InterruptedException,NoAlertPresentException
{
	driver.navigate().refresh();
    String s = "clubhouse";
    long d = System.currentTimeMillis();
    String username=(s + d );		   
	   Xpaths obj=new Xpaths(driver);
	   obj.user(username);
	   obj.email(username + "@mailinator.com");
	   obj.setPass("Qwerty123");
	   obj.repass("Qwerty123");
	   obj.checkpolicy();
	   obj.checkpromo();
	   obj.createac();
	   driver.manage().window().maximize();	
	   Thread.sleep(1000);
  //   driver.findElement(By.cssSelector(�body�)).sendKeys(Keys.CONTROL+ �t�)
	   ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	   driver.switchTo().window(tabs2.get(1));
	   driver.get("https://mailinator.com/");
    // driver.switchTo().window(tabs2.get(0));
	   driver.findElement(By.name("search")).sendKeys(username);	
	   obj.mailclick2();
	   Thread.sleep(2000);
	   obj.clickonmail2();
	   Thread.sleep(2000);
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(00,60)");
	   Thread.sleep(2000);
	   driver.switchTo().frame(0);
	   JavascriptExecutor bj = (JavascriptExecutor) driver;
	   bj.executeScript("window.scrollBy(00,120)");
	   Thread.sleep(3000);
	   Actions act = new Actions(driver);
	   //WebElement ele=driver.findElement(By.xpath("//td[@align='center']"));
	   WebElement ele=driver.findElement(By.xpath("//div[@style='cursor: auto ; color: #59afe0 ; font-family: sans-serif ; font-size: 20px ; font-weight: 700 ; line-height: 36px ; text-align: center']"));
	   //WebElement ele=driver.findElement(By.className("mj-column-per-100 outlook-group-fix"));
	   //act.doubleClick(ele).perform();
       String l=ele.getText();
       System.out.println(l);
       driver.switchTo().window(tabs2.get(0));
       Thread.sleep(2000);
       obj.pastecode1();
       Thread.sleep(3000);
       //driver.findElement(By.xpath("//*[placeholder='Enter Verification Code']")).sendKeys(Keys.CONTROL+"v");
       //driver.findElement(By.className("input-group-addon")).sendKeys(Keys.CONTROL+"v");
       driver.findElement(By.xpath("//input[@placeholder='Enter Verification Code']")).sendKeys(l);
       //obj.verifybutton1();
       Thread.sleep(3000);
       //driver.findElement(By.xpath("//button[contains(text(),'Verify']")).click();
       driver.findElement(By.xpath("//input[@placeholder='Enter Verification Code']")).sendKeys(Keys.ENTER);    
       //WebElement el =driver.findElement(By.cssSelector("[style='width: 350px']"));
       //el.click();
       //Thread.sleep(2000);
       //js.executeScript("document.querySelector('.document').scrollTop");     
	   //String c=obj.getcode1();
	   //System.out.println(c);
    }

@Test(priority=17)
public void signup17 () throws IOException, AWTException, InterruptedException,NoAlertPresentException
{
	driver.get("https://app.hubbleconnected.com/");
	driver.navigate().refresh();
	
		   
	   Xpaths obj=new Xpaths(driver);
	   obj.clickLogin();
	   obj.user(username);
	   obj.email(username + "@mailinator.com");
	   obj.setPass("Qwerty123");
	   obj.repass("Qwerty123");
	   obj.checkpolicy();
	   obj.checkpromo();
	   obj.createac();
	   driver.manage().window().maximize();	
	   Thread.sleep(3000);
	   obj.resendotp1();
	   Thread.sleep(4000);
	   ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	   driver.switchTo().window(tabs2.get(1));
	   driver.get("https://mailinator.com/");
    // driver.switchTo().window(tabs2.get(0));
	   driver.findElement(By.name("search")).sendKeys(username);	
	   obj.mailclick2();
	   Thread.sleep(2000);
	   obj.clickonmail2();
	   Thread.sleep(2000);
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(00,60)");
	   Thread.sleep(2000);
	   driver.switchTo().frame(0);
	   JavascriptExecutor bj = (JavascriptExecutor) driver;
	   bj.executeScript("window.scrollBy(00,120)");
	   Thread.sleep(3000);
	   Actions act = new Actions(driver);
	   //WebElement ele=driver.findElement(By.xpath("//td[@align='center']"));
	   WebElement ele=driver.findElement(By.xpath("//div[@style='cursor: auto ; color: #59afe0 ; font-family: sans-serif ; font-size: 20px ; font-weight: 700 ; line-height: 36px ; text-align: center']"));
	   //WebElement ele=driver.findElement(By.className("mj-column-per-100 outlook-group-fix"));
	   //act.doubleClick(ele).perform();
       String l=ele.getText();
       System.out.println(l);
       driver.switchTo().window(tabs2.get(0));
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@placeholder='Enter Verification Code']")).sendKeys(l);
       driver.findElement(By.xpath("//input[@placeholder='Enter Verification Code']")).sendKeys(Keys.ENTER); 
}

}









