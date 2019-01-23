package test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Test_3 {

		public static void main(String[] args) {
			try{
				System.setProperty("webdriver.chrome.driver", "C:/Users/divya nistala/Downloads/chromedriver_win32/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
		        //Navigate to home page		
		        driver.get("url");			
		        
		        // In the test 3 div, assert that "Option 1" is the default selected value
		        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]")).getText(), "Option 1");
		        
		        // Select "Option 3" from the select list
		        driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]")).click();		        
		        driver.findElement(By.xpath("//*[@id=\"test-3-div\"]/div/div/a[3]")).click();
		        
			} catch (Exception E){
				E.printStackTrace();
			}
			
		}

	}


