package test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Test_5 {

		public static void main(String[] args) {
			try{
				System.setProperty("webdriver.chrome.driver", "C:/Users/divya nistala/Downloads/chromedriver_win32/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
		        //Navigate to home page		
		        driver.get("url");			
		        
		        //Wait for a button to be displayed (note: the delay is random) and then click it
		        while (true)
		        {
		        	 if(driver.findElement(By.xpath("//*[@id=\"test5-button\"]")).isDisplayed())
		        	 {
		        	     driver.findElement(By.xpath("//*[@id=\"test5-button\"]")).click();
		        	     break;
		        	 }
		        }
		       
		        //Once you've clicked the button, assert that a success message is displayed
		        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"test5-alert\"]")).getText(), "You clicked a button!");
		        
		        //Assert that the button is now disabled
		        Assert.assertFalse("assertion failed", driver.findElement(By.xpath("//*[@id=\"test5-button\"]")).isEnabled());

			} catch (Exception E){
				E.printStackTrace();
			}
			
		}

	}


