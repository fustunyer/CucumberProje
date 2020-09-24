package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("amazon_link"));
    }

   @Given("kullanici aramakutusunua headphones yazar ve arar")
    public void kullanici_aramakutusunua_headphones_yazar_ve_arar() {
        amazonPage.aramaKutusu.sendKeys(ConfigurationReader.getProperty("amazon_kelime")+ Keys.ENTER);

    }
    @Then("kullanici sonuc sayisini ekrana yazdirir.")
    public void kullanici_sonuc_sayisini_ekrana_yazdirir() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(amazonPage.sonucSayisi.getText());
    }
    @Given("kullanici aramakutusunua camera yazar ve arar")
    public void kullanici_aramakutusunua_camera_yazar_ve_arar() {
      amazonPage.aramaKutusu.sendKeys("camera"+Keys.ENTER);
    }
    @Given("kullanici aramakutusuna {string} yazar ve arar")
    public void kullanici_aramakutusuna_yazar_ve_arar(String string) {
        amazonPage.aramaKutusu.sendKeys(string+Keys.ENTER);
    }
    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {
       Driver.getDriver().get(string);
    }

    @Given("kullanici dropdownda {string} secer")
    public void kullanici_dropdownda_secer(String string) {
        Select select=new Select(amazonPage.dropDown);
        select.selectByVisibleText(string);

    }

    @Then("kullanici sonuc sayisini ekrana yazar")
    public void kullanici_sonuc_sayisini_ekrana_yazar() {
        System.out.println(amazonPage.sonucSayisi.getText());
    }


}
