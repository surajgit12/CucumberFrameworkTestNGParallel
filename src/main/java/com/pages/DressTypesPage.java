package com.pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DressTypesPage {

	private WebDriver driver;
	private static Actions actions;


	private By dressesTypesLink = By.xpath("//*[@id='block_top_menu']/ul/li[2]/a");
	private By dressesTypesOptionLink = By.cssSelector("#block_top_menu > ul > li:nth-child(2) > ul>li>a");
	private By casualDresses = By.xpath(" //*[@id='block_top_menu']/ul/li[2]/ul/li[1]/a");
	private By eveningDresses = By.xpath(" //*[@id='block_top_menu']/ul/li[2]/ul/li[2]/a");
	private By summerDresses = By.xpath(" //*[@id='block_top_menu']/ul/li[2]/ul/li[3]/a");

	private By clickOnCasualDresses = By.xpath("//*[@id='block_top_menu']/ul/li[2]/ul/li[1]/a");

	public DressTypesPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement dressesMenuOptionIsAvailable() {
          return driver.findElement(dressesTypesLink);

	}

	public void dressesTypesOptionLinksOptions() throws InterruptedException {

		actions = new Actions(driver);
		WebElement element =driver.findElement(dressesTypesLink);
		  Thread.sleep(30);
		actions.moveToElement(element).build().perform();
	}

	public boolean movedToCasualDressesOption() throws InterruptedException {
		  Thread.sleep(30);
		return driver.findElement(casualDresses).isDisplayed();
	}

	public boolean movedToEveningDressesOption() {
		return driver.findElement(eveningDresses).isDisplayed();
	}

	public boolean movedToSummerDresses() {
		return driver.findElement(summerDresses).isDisplayed();
	}
	
	public void multipleDressesOptionIsVisible( ) {
		List<WebElement> multipleDressList = driver.findElements(dressesTypesOptionLink);
		for(WebElement e : multipleDressList) {
			System.out.println(e.getText());
		}
		driver.findElement(summerDresses).isDisplayed();
	}

	public void clickOnCasualDressesOptionLink() throws InterruptedException {
		  Thread.sleep(30);
		WebElement CasualDresses = driver.findElement(clickOnCasualDresses);
		CasualDresses.click();
	}

	public String getTheTitlePageOfCasualDresses() {
		return driver.getTitle();
	}
	
	
}
