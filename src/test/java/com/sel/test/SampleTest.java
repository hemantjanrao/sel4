package com.sel.test;

import com.sel.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.sel.test.config.ConfigurationManager.configuration;

public class SampleTest extends BaseTest {

    @Test
    public void sampleTest() {
        driver.get(configuration().url());
        WebElement elem = driver.findElement(By.tagName("a"));
        Assert.assertEquals(elem.getText(), "More information...");
    }
}
