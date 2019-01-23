package test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Test_4 {

		public static void main(String[] args) {
			try{
				System.setProperty("webdriver.chrome.driver", "C:/Users/divya nistala/Downloads/chromedriver_win32/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
		        //Navigate to home page		
		        driver.get("url");			
		        
		        // In the test 4 div, assert that the first button is enabled and that the second button is disabled
		        Assert.assertTrue("assertion failed", driver.findElement(By.xpath("//*[@id=\"test-4-div\"]/button[1]")).isEnabled());
		        Assert.assertFalse("assertion failed", driver.findElement(By.xpath("//*[@id=\"test-4-div\"]/button[2]")).isEnabled());
		        
			} catch (Exception E){
				E.printStackTrace();
			}
			
		}

	}


