Feature: US002 BlueRentalCar Sayfasinda Login Islemi

  Scenario: TC01 Verilen Email ve Password ile Login olunur
    Given kullanici blueRentalCar sayfasina gider
    But login butonuna tiklar
    Then email ve password bilgileri ile login olur
    And sayfayi kapatir
  @gr1
    Scenario: TC02 Verilen Email ve Password ile Login olunur.
      Given kullanici blueRentalCar sayfasina gider
      But login butonuna tiklar
      Then email ve password bilgilerini girer
      And sayfayi kapatir