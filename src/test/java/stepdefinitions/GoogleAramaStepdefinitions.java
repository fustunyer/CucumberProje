package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.awt.image.Kernel;

public class GoogleAramaStepdefinitions {
    GooglePage googlePage=new GooglePage();

    @Given("kullanici google sayfasina gider")
    public void kullanici_google_sayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("google_link"));
    }

    @Given("techproeducation aramasi yapar")
    public void techproeducation_aramasi_yapar() {
    googlePage.aramaKutusu.sendKeys(ConfigurationReader.getProperty("google_kelime")+ Keys.ENTER);

    }

    @Then("sayfa basligini kontrol eder")
    public void sayfa_basligini_kontrol_eder() throws InterruptedException {
        Thread.sleep(2000);
        String baslik=Driver.getDriver().getTitle();
        Assert.assertTrue(baslik.contains(ConfigurationReader.getProperty("google_kelime")));


    }

}
