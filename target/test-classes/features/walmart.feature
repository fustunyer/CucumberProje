@walmart
  Feature: Walmart urun aramasi
    Scenario Outline: TC09_kullanici walmart sayfasinda arama yapar
      Given kullanici "https://walmart.com" sayfasina gider
      And kullanici walmart aramakutusuna "<kelime>" ekler ve arar
      Then kullanici walmart sonuc sayisini ekrana yazdirir
      Examples:
        | kelime |
      |calculater|
      |watch     |
      |flower    |

