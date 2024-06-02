package Tests;

import Pages.HomePage;
import Pages.ProductsPages;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class SeleniumTest {
    public static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest test;

    @BeforeTest
    public static void Setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);

        HomePage.click_hamburger_menu();
        HomePage.click_orderProducts_link();
    }

    @Test
    public void ValidateTitles_OnlineProducts() throws InterruptedException, IOException {
        test = extent.createTest("Validate Shoe Titles on Products page", "This test validates the different shoe types are correct on Online Products Page");
        ProductsPages.Formalshoes_VerifyTitle();
        ProductsPages.Sportshoes_VerifyTitle();
        ProductsPages.Sneakers_VerifyTitle();
    }

    @Test
    public void ValidateFirstFormalShoes() throws InterruptedException, IOException {
        test = extent.createTest("Validate first formal shoe name", "This test validates first formal shoes on products page");
        ProductsPages.Formalshoes_firstshoe_verify();
    }

    @Test
    public void ValidateFirstSportsShoes() throws InterruptedException, IOException {
        test = extent.createTest("Validate first SportShoes shoe name", "This test validates first Sport shoes on products page");
        ProductsPages.Sportshoes_firstshoe_verify();
    }

    @Test
    public void ValidateFirstSneakerShoes() throws InterruptedException, IOException {
        test = extent.createTest("Validate SneakerShoes shoe name", "This test validates first Sneaker shoes on products page");
        ProductsPages.Sneakers_firstshoe_verify();
    }

    @AfterSuite
    public static void cleanup() {
        if (driver != null) {
            driver.quit();
        }
        if (extent != null) {
            extent.flush();
        }
    }
}
