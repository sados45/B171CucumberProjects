package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // Cucumber ile Junitin entegre olmasini saglayan scenario calistirici notasyonu

@CucumberOptions(features = "src/test/resources/features", //features package inin yolu (content root)
                 glue = "stepDefinitions", //stepDefinitions package ismi
                  tags = "@gr1" // hangi scenariolari bu tagi belitirsek o scenariolar calisir.
)


public class Runner {
/*
    @CucumberOptions() bu notasyon sayesinde hangi scenariolari çalıştıracağımızı ve hangi raporları
    alacağımızı belirtiriz
    dryRun parametresi eğer true seçilirse scenariolari çalıştırmadan feature file daki steplerin
    stepDefinition class'ındaki methodlar ile uyuşuğ uyuşmadığını kontrol eder ve browser'ı çalıştırmaz
     */

}
