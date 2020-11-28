package stepdefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
public class Hooks {
    // TestNG'deki @BeforeMethod gibi çalışır.
    // Her senaryodan önce çalışır.
    @Before
    public void setUp(){
        System.out.println("setUp Çalıştı.");
    }
    // TestNG'deki @AfterMethod gibi çalışır.
    // Her senaryodan sonra çalışır.
    @After
    public void tearDown(Scenario scenario){
        System.out.println("tearDown çalıştı.");
        // ekran görüntüsü almak için bu sabit kodu kullanabiliriz.

        Driver.closeDriver();
    }
}
//java -Dwebdriver.chrome.driver="C:\Users\Fatih USTUNYER\Downloads\Selenıum" -jar selenium-server-standalone-3.141.59.jar -role node -hub //http:192.168.1.33:4444//grid/register