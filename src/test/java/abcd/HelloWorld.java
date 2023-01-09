package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Temp\\Programs\\ForJob\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/");
    }
}
