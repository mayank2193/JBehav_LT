package com.lambdatest.single.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.lambdatest.single.pages.GooglePage;

public class GoogleSteps {
  private GooglePage page;

  public GoogleSteps(WebDriver driver) {
    page = new GooglePage(driver);
  }

  @When("I type query as \"$keyword\"")
  public void searchGoogle(String keyword) {
    page.searchOnGoogle(keyword);
  }

  @Then("I submit")
  public void submit() throws Exception {
    page.submitSearch();
  }

  @Then("I should see title \"$keyword\"")
  public void titleShouldContain(String keyword) {
    Assert.assertEquals(keyword, page.getTitle());
  }
}
