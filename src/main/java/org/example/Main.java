package org.example;

import config.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Main  extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://ithillel.ua/");
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        List<WebElement> recomendations = driver.findElements(By
                .xpath("//div[@class='courses-section_recommendations']//span[@class='course-bar_label']"));
        Assert.assertTrue(recomendations.size() > 0);
        for (WebElement el : recomendations) {
            System.out.println(el.getText());
        }
        driver.quit();
    }
}