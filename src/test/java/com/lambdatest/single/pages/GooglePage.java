package com.lambdatest.single.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {
  private String DEFAULT_GOOGLE_URL = "http://localhost:3000/";
  private WebDriver driver;
  private WebElement element;

  public GooglePage(WebDriver driver) {
    this.driver = driver;
  }

  public String getTitle(){
    return driver.getTitle();
  }

  public void searchOnGoogle(String keyword) {
    driver.get(DEFAULT_GOOGLE_URL);
    try 
    {
        Thread.sleep(2000);
    } 
    catch(InterruptedException e)
    {
         // this part is executed when an exception (in this example InterruptedException) occurs
    }
    element = driver.findElement(By.name("q"));
    element.sendKeys(keyword);
  }

  public void submitSearch() throws Exception {
    element.submit();
    Thread.sleep(5000);
  }
}
