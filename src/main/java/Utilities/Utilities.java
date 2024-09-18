package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utilities {
    public static void click(WebDriver driver, By Button){
        WebElement btn= driver.findElement(Button);
        if(btn.isDisplayed())
            btn.click();
    }
    public static void jsClick(WebDriver driver, By element){
        WebElement btn= driver.findElement(element);
        JavascriptExecutor executor= (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()",btn);  //Script is the Javascript that needs to execute.
    }
    public static void sendText(WebDriver driver, By element, String text){
        driver.findElement(element).clear();
        WebElement txtBox= driver.findElement(element);
        if(txtBox.isDisplayed())
            txtBox.sendKeys(text);
    }
    public static void scrollToBottom(WebDriver driver) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
    public static void scrollByPixels(WebDriver driver, int x, int y) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
    }
//    public static void scrollToElement(WebDriver driver, By elementLocator) {         //additional function for scroll, In Page object we can use it like this : By myElementLocator = By.id("myElementId");    Utilities.scrollToElement(driver, myElementLocator);
//        WebElement element = driver.findElement(elementLocator);
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//
//        // Scroll the element into view
//        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
//    }
}
