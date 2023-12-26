package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import static org.openqa.selenium.By.xpath;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://intellect.icu/paint-classic-online/");
            Thread.sleep(2000 );

            WebElement element = driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div[1]/div/div[1]/div[15]"));
            WebElement element1 = driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div[2]"));
            WebElement element2 = driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div[1]/div/div[1]/div[11]/span"));

            Actions action = new Actions(driver);

            action.moveToElement(element).click(element).moveToElement(element1).clickAndHold().moveByOffset(100, 100).release().build().perform();
            action.moveToElement(element).click(element).moveToElement(element1).moveByOffset(100, 0).clickAndHold().moveByOffset(100, 100).release().build().perform();
            action.moveToElement(element2).click(element2).moveToElement(element1).moveByOffset(50, 0).clickAndHold().moveByOffset(0, -200).release().build().perform();
            action.moveToElement(element2).click(element2).moveToElement(element1).moveByOffset(150, 0).clickAndHold().moveByOffset(0, -200).release().build().perform();
            action.moveToElement(element).click(element).moveToElement(element1).moveByOffset(50, -250).clickAndHold().moveByOffset(100, 100).release().build().perform();


        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }finally {
            Thread.sleep(10000 );
            driver.quit();
        }

    }
}