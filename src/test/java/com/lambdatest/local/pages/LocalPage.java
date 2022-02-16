package com.lambdatest.local.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocalPage {
  private String DEFAULT_LOCAL_URL = "http://localhost:3000/";
  private WebDriver driver;
  private WebElement element;

  public LocalPage(WebDriver driver) {
    this.driver = driver;
  }

  public String getPageSource(){
    return driver.getPageSource();
  }

  public void openHealthCheck() {
    driver.get(DEFAULT_LOCAL_URL);
    try 
    {
        Thread.sleep(2000);
    } 
    catch(InterruptedException e)
    {
         // this part is executed when an exception (in this example InterruptedException) occurs
    }
  }
}
