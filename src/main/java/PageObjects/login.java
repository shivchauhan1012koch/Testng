package PageObjects;

import Base.Setup;
import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class login extends Setup {
    By Username= By.xpath("(//*[@id='username'])");
    By Password= By.xpath("(//*[@id='password'])");
    By RememberUN= By.xpath("(//*[@id='rememberUsername'])");
    By Sign_on_Button= By.xpath("(//*[@id='loginButton'])");
    By UN_Block = By.xpath("(//*[@name='j_username'])");
    By PW_Block = By.xpath("(//*[@name='j_password'])");
    By SignInbtn = By.xpath("(//*[@id='submitButton'])");
    By DiamondBtn = By.xpath("(//*[@src='/polarion/ria/images/logos/repo_logo.png'])");
    By Home_Button = By.xpath("(//*[@title='Home'])");

//    public void EnterCD(){
//        Utilities.sendText(driver,UN_Block,"");
//        Utilities.sendText(driver,PW_Block,"");
//        Utilities.jsClick(driver,SignInbtn);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.elementToBeClickable(Home_Button));
//        Utilities.jsClick(driver,DiamondBtn);
//    }

    public void EnterCredentials(String UN, String PW){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(Username));
        Utilities.sendText(driver,Username,UN);

        wait.until(ExpectedConditions.elementToBeClickable(Password));
        Utilities.sendText(driver,Password,PW);
    }
    public void ClickSignOn(){
        Utilities.jsClick(driver,Sign_on_Button);
    }
    public void ClickDiamondButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(Home_Button));
        Utilities.jsClick(driver,DiamondBtn);
    }
}
