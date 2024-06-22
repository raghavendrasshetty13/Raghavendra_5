package hub;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver.TargetLocator.*;

public class Xpaths {
	//signup
	@FindBy(xpath=("//a[contains(.,' Sign Up')]"))
	public WebElement uname;
	
	//username
	@FindBy(xpath=("//input[@placeholder='Username']"))
	WebElement username;
	
	//email
	@FindBy(xpath=("//input[@placeholder='Email']"))
	WebElement email;
	
	//password
	@FindBy(xpath=("//input[@placeholder='Password']"))
	WebElement password;
	
	//confirm
	@FindBy(xpath=("//input[@placeholder='Confirm Password']"))
	WebElement confirm;

	//privacypolicy
	@FindBy(className=("consent1"))
	WebElement checkpolicy;
	
	//promotion
	@FindBy(className=("consent2"))
	WebElement checkpro;
	
	//Create account
	@FindBy(className=("hubble-font-bold"))
	WebElement create;
	
	//Privacy link
	@FindBy(linkText=("Privacy Policy"))
	WebElement privacy;
   	
	//Terms and condition
	@FindBy(linkText=("Terms of Service"))
	WebElement terms;
	
	//Cockies
	@FindBy(linkText=("Cookie Policy"))
	WebElement cockies;
	
	//Store
	@FindBy(linkText=("Store"))
	WebElement store;
	
	//Support
	@FindBy(linkText=("Support"))
	WebElement support;
	
	//mailinator
	@FindBy(name="search")
    WebElement mailinator; 
	
	//Signup
    @FindBy(xpath = "//button[contains(@value,'Search for public inbox for free')]")
	WebElement mailclick;
    
    //mail
    @FindBy(xpath = "//td[contains(@class,'ng-binding')]")
    WebElement clickonmail;
    
    //GettheCode
    @FindBy(xpath="//td[contains(@align,'centre')]")
    WebElement getcode;
    
    //scroll inside
    @FindBy(linkText=("You're almost there!"))
    WebElement scrollinside;
    
    //Paste code
    @FindBy(className=("hubble-signup-bodybg"))
    WebElement pastecode;
    
    //Verify
    @FindBy(xpath = "//*[text()=' Verify')]")
    WebElement verifybutton;
    
    //ResendOtp
    @FindBy(linkText=("Resend verification code"))
    WebElement resendotp;
    


    

	

	
	WebDriver driver;
	public Xpaths(WebDriver driver)
	{
    PageFactory.initElements(driver,this);
    }
	
	public void email(String mail)
	{
	email.sendKeys(mail);
	}
	
	public void setPass(String pwd)
	{
	password.sendKeys(pwd);
	}
    public void repass(String pwd1)
    {
    confirm.sendKeys(pwd1);
    }
    public void checkpolicy()
    {
    checkpolicy.click();
    }
    public void checkpromo()
    {
    checkpro.click();
    }
    public void clickLogin()
    {
	uname.click();
    }
    public void user(String user)
    {
    username.sendKeys(user);
    }
    public void createac()
    {
    create.click();
    }
    public void privacy1()
    {
    privacy.click();	
    }
    public void terms1()
    {
    terms.click();
    }
    public void coockies1()
    {
    cockies.click();
    }
    public void store1()
    {
    store.click();
    }
    public void support1()
    {
    support.click();
    }  
    public void mailinator2(String mailinator3)
    {
    mailinator.click();
    }
    
    public void mailclick2()
    {
    mailclick.click();
    }
    
    public void clickonmail2()
    {
    clickonmail.click();
    }
    
    public String getcode1()
    {
    return getcode.getText();	
    }
    
    public void scrollinside1()
    {
    scrollinside.click();
    }
    
    public void pastecode1()
    {
    pastecode.click();
    }
    
    public void verifybutton1()
    {
    verifybutton.click();
    }
    
    public void resendotp1()
    {
    resendotp.click();
    }  

    
  


   public void clearall()
   {
	   username.clear();
	   email.clear();
	   password.clear();
	   confirm.clear();
   }
}







