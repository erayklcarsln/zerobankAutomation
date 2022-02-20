package com.zerobank.page;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    public void navigateTo(String tab) {
        String tabLocator = tab;
        //     String moduleLocator2 = "//span[@class='title title-level-1' and contains(text(),'"+ module + "')]";

        try {
            BrowserUtils.waitForClickablility(By.partialLinkText(tabLocator), 5);
            WebElement tabElement = Driver.get().findElement(By.partialLinkText(tab));
            new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.partialLinkText(tabLocator), 5);
        }
    }
}
