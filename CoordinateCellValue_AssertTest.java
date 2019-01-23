package test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Test_6 {

		public static void main(String[] args) {
			try{
				System.setProperty("webdriver.chrome.driver", "C:/Users/divya nistala/Downloads/chromedriver_win32/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
		        //Navigate to home page		
		        driver.get("url");
		        
		        //method to find the value of the cell at coordinates 2, 2 (staring at 0 in the top left corner)
				System.out.println("Value of the cell at coordinates 2,2 is " + ValueofCell(driver, 2,2)); 
				
				//Assert that the value of the cell is "Ventosanzap"
				Assert.assertEquals(ValueofCell(driver, 2,2), "Ventosanzap");
		        
			} catch (Exception E){
				E.printStackTrace();
			}
			
		}
		
		//Method that allows you to find the value of any cell on the grid
		public static String ValueofCell(WebDriver driver, int i, int j) {

			WebElement table = driver.findElement(By.xpath("//*[@id=\"test-6-div\"]/div/table"));
	        WebElement webList = table.findElement(By.xpath("//*[@id=\"test-6-div\"]/div/table/tbody/tr["+ (i+1) +"]/td["+ (j+1) +"]"));
	        String value = webList.getText();
	        return value;
			
		}

	}


