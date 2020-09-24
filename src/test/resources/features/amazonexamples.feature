@birdenfazlaexample @amazon
Feature: Amazonda Urun Arama
  Scenario Outline: TC07_kullanici amazonda dropdown ve aramakutusu kullanarak arama yapar
    Given kullanici "https://amazon.com" sayfasina gider
    And kullanici dropdownda "<kategori>" secer
    And kullanici aramakutusuna "<urunismi>" yazar ve arar
    Then kullanici sonuc sayisini ekrana yazar

    Examples:Test verileri
      | kategori | urunismi  |
      |Automotive|phone holder|
      |Baby      |stroller   |
      |Books     |miserables |
