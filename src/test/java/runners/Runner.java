package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports"},//rapor olusturma icin
        features = "src/test/resources/features",//features klasorunun adresi
        glue="stepdefinitions",//testlerin icinde oldugu paketin adi
        tags = "@walmart",//sectiginiz tag a ait testler calisir.
        dryRun = false
        //dryRun=False olursa testleri calistirir
        //dryRun=true olursa gerekli olan methodlari bulur ve size oneride bulunur.
)

public class Runner {
}
