package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.EbayPage;
import utilities.Driver;

public class EbayStepDefinitions {
    EbayPage ebayPage= new EbayPage();
    @Given("kullanici e bay sitesine gider")
    public void kullanici_e_bay_sitesine_gider() {
        Driver.getDriver().get("https://www.ebay.com/");
    }


    @And("kullanici arama kutusuna {string} yazar ve arar")
    public void kullanici_arama_kutusuna_yazar_ve_arar(String string) {
        ebayPage.aramaKutusu.sendKeys(string+ Keys.ENTER);

    }
    @Then("kullanici sonuc sayisini ekrana yazdirir")
    public void kullanici_sonuc_sayisini_ekrana_yazdirir() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(ebayPage.sonuc.getText());


    }

}
