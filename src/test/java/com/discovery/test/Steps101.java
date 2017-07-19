package com.discovery.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps101 {
WebDriver driver;
@Given("^I want to open webdriver and connect to the gmail login page$")
public void I_want_to_open_webdriver_and_connect_to_the_gmail_login_page() throws Throwable {
    // Express the Regexp above with the code you wish you had
	System.setProperty("webdriver.chrome.driver", "C:/data/Selenium/Software/chromedriver.exe");
	driver = new ChromeDriver();
    driver.get("https://accounts.google.com/signin/v2/identifier?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=ServiceLogin#identifier");
    driver.manage().window();
   Thread.sleep(6000);
	
}
@When("^I enter userid as \"([^\"]*)\"  and click next button$")
public void I_enter_userid_as_and_click_next_button(String arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
	driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys(arg1);
	driver.findElement(By.xpath(".//*[@id='identifierNext']")).click();
Thread.sleep(2000);

}

@When("^I enter password as \"([^\"]*)\" and click submit button$")
public void I_enter_password_as_and_click_submit_button(String arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
	driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(arg1);
	driver.findElement(By.xpath(".//*[@id='passwordNext']")).click();

	Thread.sleep(10000);	
}

@Then("^I verify the inbox$")
public void I_verify_the_inbox() throws Throwable {
    // Express the Regexp above with the code you wish you had
 String text = driver.findElement(By.xpath(".//*[@id=':i']/span")).getText();
Assert.assertEquals(text, "Gmail");
}




}



