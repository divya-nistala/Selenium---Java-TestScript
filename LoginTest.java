package test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Test_1 {

		public static void main(String[] args) {
			try{
				System.setProperty("webdriver.chrome.driver", "C:/Program Files/nodejs/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
		        //Navigate to home page		
		        driver.get("url");			
		     
		        //Maximize window		
		        driver.manage().window().maximize();
		        
		        //Assert that both the email address and password inputs are present as well as the login button
		        Assert.assertTrue("assertion failed", driver.findElement(By.id("inputEmail")).isDisplayed());
		        Assert.assertTrue("assertion failed", driver.findElement(By.id("inputPassword")).isDisplayed());
		        Assert.assertTrue("assertion failed",driver.findElement(By.xpath("//*[@id='test-1-div']/form/button")).isDisplayed());
		        		        
		        //Enter Email Address
		        driver.findElement(By.id("inputEmail")).click();
		        driver.findElement(By.id("inputEmail")).sendKeys("sampleId@gmail.com");
		        
		        //Enter Password
		        driver.findElement(By.id("inputPassword")).click();
		        driver.findElement(By.id("inputPassword")).sendKeys("password");
		        
		        //Click Submit
		        driver.findElement(By.xpath("//*[@id='test-1-div']/form/button")).click();

			} catch (Exception E){
				E.printStackTrace();
			}
			
		}

	}


