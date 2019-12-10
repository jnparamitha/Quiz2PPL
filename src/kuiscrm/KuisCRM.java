/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuiscrm;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
/**
/**
 *
 * @author JIHAN_NABILLA_
 */
public class KuisCRM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException 
    {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver","D:\\APK2\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://demo.1crmcloud.com/login.php";

        driver.get(baseUrl);

        driver.findElement(By.id("login_user")).sendKeys("admin");
        driver.findElement(By.id("login_pass")).sendKeys("admin");
        driver.findElement(By.id("login_button")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=DetailView&record=1']")).click();
        
        
//        System.out.println(tagName);

//        driver.close();

        System.exit(0);
    }
}
