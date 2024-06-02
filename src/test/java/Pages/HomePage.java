package Pages;

import org.openqa.selenium.By;

import static Tests.SeleniumTest.driver;

public class HomePage {
    public static String hamburger_menu = "//input[@type='checkbox']";
    public static String OnlineProducts_link = "//ul[@id='menu']//a[3]";

    public static void click_hamburger_menu() {
        driver.findElement(By.xpath(hamburger_menu)).click();

    }

    public static void click_orderProducts_link() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(OnlineProducts_link)).click();

    }



    }

