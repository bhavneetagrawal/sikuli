package SikuliConceptTest.SikuliConceptTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Youtube {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   //Launch Chrome
		
			driver.manage().window().maximize();  //Maximize Window
			driver.manage().deleteAllCookies();  //Delete all cookies
		
		//Dynamic Wait
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.youtube.com/watch?v=Sm2ArOlORFQ&start_radio=1&list=RDSm2ArOlORFQ");	
		
		Screen s = new Screen();
		
		Pattern PauseImg = new Pattern("Pause_click.png");
		s.wait(PauseImg,2000);
		s.click();
		s.click();
		
			
		
		
	}

}
