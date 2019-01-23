package test;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Test_2 {

		public static void main(String[] args) {
			try{
				System.setProperty("webdriver.chrome.driver", "C:/Users/divya nistala/Downloads/chromedriver_win32/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
		        //Navigate to home page		
		        driver.get("url");			
		     
		        WebElement weblist = driver.findElement(By.xpath("//*[@id=\"test-2-div\"]/ul"));
		        List <WebElement> listItems = weblist.findElements(By.tagName("li"));
		        String listitem2 = listItems.get(1).getText();
		        
		        //In the test 2 div, assert that there are three values in the listgroup
		        Assert.assertEquals(3 , listItems.size());
		        
		        //Assert that the second list item's value is set to "List Item 2"
		        Assert.assertEquals("List Item 2", listitem2.substring(0,(listitem2.length())-2));
		        
		        //Assert that the second list item's badge value is 6
		        Assert.assertEquals("6", driver.findElement(By.xpath("//*[@id=\"test-2-div\"]/ul/li[2]/span")).getText());
		      
			} catch (Exception E){
				E.printStackTrace();
			}
			
		}

	}


