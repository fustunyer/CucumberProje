package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;
    @FindBy ( className = "sg-col-inner")
    public WebElement sonucSayisi;
    @FindBy ( id = "searchDropdownBox" )
    public WebElement dropDown;






   /*
   https://www.ebay.com/'a gidelim ve araba, bebek arabası, bisiklet aramaları yapalım.
İlk önce "ebay.feature" oluşturalım.
Feature'a @ebayarama tag'ı verelim.
Scenario Outline oluşturalım.
 1. Adımda Ebay'a gidelim.
 2. Adımda arama kutusuna kelime ekleyelim ve arayalım
 3. Adımda sonuç sayısını ekrana yazdıralım.
 Examples: bölümüne araba, bebek arabası, bisiklet verilerini(3 tane) ekleyelim.
 Süreniz 20 dk, dünkü amazon örneğinden yararlanabilirsiniz.

 Selenium 28. Ders
1. Örnek : Amazon.com arama
- Amazon.com'a gidiniz ve "headphones" araması yapınız.
            - Kaç tane sonuç bulduğunuzu ekrana yazdırınız.
    Arkadaşlar bu işlem için pages paketinin altında AmazonPage class'ı, stepdefinitions paketinin altında da
     AmazonStepDefinitions class'ı oluşturun.
    bir tane yeni .feature dosyası oluşturun ve amazonsearch.feature olarak adlandırın.
    Senaryonuzu yazın ve testinizi çalıştırın. 20 dk süreniz var.
    TÜM ARKADAŞLARIN ÜZERİNDE ÇALIŞMASI GÜZEL OLUR.
    Kolay gelsin. Başlayabilirsiniz..*/




}
