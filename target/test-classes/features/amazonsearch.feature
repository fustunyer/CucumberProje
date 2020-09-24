@urunarama
Feature: Amazon arama

    Background:
    Given kullanici amazon sayfasina gider
  @amazon
  Scenario: TC02_kullanici amazonda arama yapar
    And kullanici aramakutusunua headphones yazar ve arar
    Then kullanici sonuc sayisini ekrana yazdirir.
  @amazoncamera
  Scenario: TC03_kullanici amazonda arama yapar
    And kullanici aramakutusunua camera yazar ve arar
    Then kullanici sonuc sayisini ekrana yazdirir.

