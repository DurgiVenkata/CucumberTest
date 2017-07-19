package com.discovery.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class GmailLoginSteps {

	WebDriver driver;
	
	
	@Given("^Loading Selenium WebDriver ChromeDriver$")
	public void givenMethod()throws Exception {
	    System.setProperty("webdriver.chrome.driver", "C:/data/Selenium/Software/chromedriver.exe");
	   driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "C:/data/Selenium/Software/geckodriver.exe");
		 //   driver = new FirefoxDriver();


	    driver.get("https://accounts.google.com/signin/v2/identifier?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=ServiceLogin#identifier");
	    driver.manage().window();
	   Thread.sleep(6000);
	   
	   

	
	}

	
	@When("^Enter User id and Password and Submit$")
	public void submitGmailLogin()throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("ravi.venkat50@gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierNext']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("guntur@123");
		driver.findElement(By.xpath(".//*[@id='passwordNext']")).click();
		Thread.sleep(4000);

	} 
	
	@Then("^Login to Gmail Main Page,See The Inbox$")
	public void validate()throws Exception {
	//	String text = driver.findElement(By.xpath(".//*[@id=':j5']/div/div[2]/span/a")).getText();
		String text = driver.findElement(By.xpath(".//*[@id=':j5']/div/div[2]/span/a")).getText();
		 System.out.println(text);
			Assert.assertEquals(text, "Inbox");
			//driver.quit();
		
	}
	 
	


}

