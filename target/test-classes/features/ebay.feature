Feature: Ebay arama
    @ebayarama
   Scenario Outline: TC07_kullanici ebay sitesinde urun aramasi yapar
      Given kullanici e bay sitesine gider
      And kullanici arama kutusuna "<urunler>" yazar ve arar
      Then kullanici sonuc sayisini ekrana yazdirir
     Examples:
     | urunler |
     |araba    |
     |bebek arabasi|
     |bisiklet     |
