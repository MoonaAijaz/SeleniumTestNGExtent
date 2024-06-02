package Pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.IOException;

import static Tests.SeleniumTest.driver;
import static Tests.SeleniumTest.test;

public class ProductsPages {

    public static String formalshoes_xpath = "//div[@class='container']//h2[@class='FormalShoesTitle']";
    public static String Sportshoes_xpath = "//div[@class='container']//h2[@class='SportsShoesTitle']";
    public static String Sneakers_xpath = "//div[@class='container']//h2[@class='SneakerShoesTitle']";
    public static String Formalshoes_dropdownxpath = "/html/body/div[2]/center/div/i[1]";
    public static String Sportshoes_dropdownxpath = "/html/body/div[3]/center/div/i[1]";
    public static String Sneakers_dropdownxpath = "/html/body/div[4]/center/div/i[1]";
    public static String Formalshoes_firstshoename = "/html/body/div[2]/table/tbody/tr[1]/td[1]";
    public static String Sportshoes_firstshoename = "/html/body/div[3]/table/tbody/tr[1]/td[1]";
    public static String Sneakers = "/html/body/div[4]/table/tbody/tr[1]/td[1]";

    public static void Formalshoes_VerifyTitle() throws IOException {
        String expectedtitleFS = "Formal Shoes";
        String actualtitleFS = driver.findElement(By.xpath(formalshoes_xpath)).getText().trim();
        try {
            Assert.assertEquals(actualtitleFS, expectedtitleFS);
            test.log(Status.PASS, "Test Passed for Formal Shoes title Verification");
        } catch (AssertionError e) {
            test.fail("Title verification failed for Formal Shoes");

        }
    }

    public static void Sportshoes_VerifyTitle() throws IOException {
        String expectedtitleSS = "Sports Shoes";
        String actualtitleSS = driver.findElement(By.xpath(Sportshoes_xpath)).getText().trim();
        try {
            Assert.assertEquals(actualtitleSS, expectedtitleSS);
            test.log(Status.PASS, "Test Passed for Sports Shoes title Verification");
        } catch (AssertionError e) {
            test.fail("Title verification failed for Sports Shoes");
        }
    }

    public static void Sneakers_VerifyTitle() throws IOException {
        String expectedtitleSN = "Sneakers";
        String actualtitleSN = driver.findElement(By.xpath(Sneakers_xpath)).getText().trim();
        try {
            Assert.assertEquals(actualtitleSN, expectedtitleSN);
            test.log(Status.PASS, "Test Passed for Sneakers title Verification");
        } catch (AssertionError e) {
            test.fail("Title verification failed for Sneakers");

        }
    }

    public static void Formalshoes_firstshoe_verify() throws InterruptedException, IOException {
        Thread.sleep(2000);
        String expectedFirstFormalshoe = "Classic Cheltenham";
        driver.findElement(By.xpath(Formalshoes_dropdownxpath)).click();
        String actualFirstFormalshoe = driver.findElement(By.xpath(Formalshoes_firstshoename)).getText().trim();
        try {
            Assert.assertEquals(actualFirstFormalshoe, expectedFirstFormalshoe);
            test.log(Status.PASS, "Test Passed for First Formal Shoes i.e Classic Cheltenham");
        } catch (AssertionError e) {
            test.fail("First shoe verification failed for Formal Shoes");

        }
    }

    public static void Sportshoes_firstshoe_verify() throws InterruptedException, IOException {
        Thread.sleep(2000);
        String expectedFirstSportshoe = "Ultimate";
        driver.findElement(By.xpath(Sportshoes_dropdownxpath)).click();
        String actualFirstSportshoe = driver.findElement(By.xpath(Sportshoes_firstshoename)).getText().trim();
        try {
            Assert.assertEquals(actualFirstSportshoe, expectedFirstSportshoe);
            test.log(Status.PASS, "Test Passed for First Sport Shoes i.e Ultimate");
        } catch (AssertionError e) {
            test.fail("First shoe verification failed for Sports Shoes");

        }
    }

    public static void Sneakers_firstshoe_verify() throws InterruptedException, IOException {
        Thread.sleep(2000);
        String expectedFirstSneakershoe = "Archivo";
        driver.findElement(By.xpath(Sneakers_dropdownxpath)).click();
        String actualFirstSneakershoe = driver.findElement(By.xpath(Sneakers)).getText().trim();
        try {
            Assert.assertEquals(actualFirstSneakershoe, expectedFirstSneakershoe);
            test.log(Status.PASS, "Test Passed for First Sneaker Shoes i.e Archivo");
        } catch (AssertionError e) {
            test.fail("First shoe verification failed for Sneakers");

        }
    }
}
