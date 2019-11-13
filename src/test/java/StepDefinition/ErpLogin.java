package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ErpLogin {
	WebDriver driver;
	@When("^I login into stockAccounting Url on Chrome Browser$")
	public void i_login_into_stockAccounting_Url_on_Chrome_Browser() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./CommonJars/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://webapp.qedge.com/");
	driver.manage().window().maximize();
	
	}

	@When("^I click Reset Button on Login Page$")
	public void i_click_Reset_Button_on_Login_Page() throws Throwable {
driver.findElement(By.name("btnreset")).click();	    
	}

	@When("^I enter admin and master in UserNameField and PasswordField$")
	public void i_enter_admin_and_master_in_UserNameField_and_PasswordField() throws Throwable {
	   driver.findElement(By.name("username")).sendKeys("admin");
	   driver.findElement(By.name("password")).sendKeys("master");
	}

	@When("^I click on Login Button$")
	public void i_click_on_Login_Button() throws Throwable {
	    driver.findElement(By.name("btnsubmit")).click();
	}

	@When("^I wait for LogoutLink$")
	public void i_wait_for_LogoutLink() throws Throwable {
	    Thread.sleep(6000);
	}

	@Then("^I validate the title of the home Page and close the Browser$")
	public void i_validate_the_title_of_the_home_Page_and_close_the_Browser() throws Throwable {
	  if(driver.getTitle().contains("Dashboard « Stock Accounting"))
	  {
		  System.out.println("Login success");
	  }
	  else
	  {
		  System.out.println("Login Fail");
	  }
	  driver.close();
	}


}
