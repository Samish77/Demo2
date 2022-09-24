package P1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;



public class P2 {
int i=10;
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\SBGI\\Desktop\\chromedriver_win32\\chromedriver.exe");  
		    WebDriver driver=new ChromeDriver();  
		      
		// Launch website  
		    driver.navigate().to("http://www.google.com/");  
		    System.out.println(driver.getTitle());

	}

}
