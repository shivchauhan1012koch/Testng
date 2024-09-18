package PageObjects;

import Base.Setup;
import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class openProject extends Setup {
    By PolarionRepo_dropdown = By.xpath("(//*[@class='GF0TBHUBJHB'])");
    By Open_Project_or_Project_Group = By.xpath("(//*[@src='/polarion/ria/images/openProject.png?buildId=20220419-1528-22_R1-be3adceb'])");
    By AllProject = By.xpath("(//*[@class='polarion-JSTab-Active'])");
    By SearchBarProjectName = By.xpath("(//*[@class='GF0TBHUBOKB'])");
    By Select_project = By.xpath("(//*[@src='/polarion/ria/images/projectlist/project_closed.gif?buildId=20220419-1528-22_R1-be3adceb'])");
    By ProjectName = By.xpath("(//*[@title='3102023: Automation'])");
    By Home_Button = By.xpath("(//*[@title='Home'])");
    By WelcomeProjectMessage = By.xpath("(//*[@id='polarion_client11'])");

    public void OpeningProject(String Project_Name){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(PolarionRepo_dropdown));
        Utilities.jsClick(driver,PolarionRepo_dropdown);

        wait.until(ExpectedConditions.elementToBeClickable(Open_Project_or_Project_Group));
        Utilities.jsClick(driver,Open_Project_or_Project_Group);

        wait.until(ExpectedConditions.elementToBeClickable(AllProject));
        Utilities.jsClick(driver,AllProject);

        wait.until(ExpectedConditions.elementToBeClickable(SearchBarProjectName));
        Utilities.sendText(driver,SearchBarProjectName,Project_Name);

        wait.until(ExpectedConditions.elementToBeClickable(Select_project));
        Utilities.jsClick(driver, Select_project);

        wait.until(ExpectedConditions.elementToBeClickable(Home_Button));
        Utilities.jsClick(driver,Home_Button);
    }

    public void VerifyProjectName(){
        WebElement ProjectNameVerification= driver.findElement(WelcomeProjectMessage);
        String msg = ProjectNameVerification.getText();
        String expectedMsg = "Welcome to the 3102023: Automation Project";
        Assert.assertEquals(msg,expectedMsg);
    }
}
