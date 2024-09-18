package PageObjects;

import Base.Setup;
import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Project_Creation extends Setup {
    By Expand_Documents_and_Pages = By.xpath("(//*[@src='/polarion/ria/images/tree/T+_lite.svg?buildId=20220419-1528-22_R1-be3adceb'])");
    By Click_Default_Space = By.xpath("(//*[@src='/polarion/ria/images/tree/L+_lite.svg?buildId=20220419-1528-22_R1-be3adceb'])[1]");
    By Click_Project_Creation = By.xpath("(//*[@title='Name (ID): Project Creation'])");
    By Enter_RPM_No = By.xpath("(//*[@id='txtTnum'])");
    By Enter_ProjectName = By.xpath("(//*[@id='txtPrjName'])");
    By Select_Repo = By.xpath("(//*[@value='/Shiv'])");
    By Select_DefaultRepo = By.xpath("(//*[@id='Default Repository'])");
    By Create_Button = By.xpath("(//*[@id='btnSubmit'])");
    By PolarionRepo_dropdown = By.xpath("(//*[@class='GF0TBHUBJHB'])");
    By Open_Project_or_Project_Group = By.xpath("(//*[@src='/polarion/ria/images/openProject.png?buildId=20220419-1528-22_R1-be3adceb'])");
    By AllProject = By.xpath("(//*[@class='polarion-JSTab-Active'])");
    By SearchBarProjectName = By.xpath("(//*[@class='GF0TBHUBOKB'])");
    By Select_project = By.xpath("(//*[@src='/polarion/ria/images/projectlist/project_closed.gif?buildId=20220419-1528-22_R1-be3adceb'])");
    By ProjectName = By.xpath("(//*[@title='3102023: Automation'])");
    By Home_Button = By.xpath("(//*[@title='Home'])");


    public void NavigatetoProjectCreation() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(Home_Button));
        Utilities.jsClick(driver, Expand_Documents_and_Pages);
        Utilities.jsClick(driver, Click_Default_Space);
        Utilities.jsClick(driver, Click_Project_Creation);
    }
    public void CreationOfProject(String RPMno, String Project_Name){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(Select_DefaultRepo));
        Utilities.jsClick(driver,Select_DefaultRepo);
        Utilities.sendText(driver,Enter_RPM_No,RPMno);
        Utilities.sendText(driver,Enter_ProjectName, Project_Name);
        Utilities.jsClick(driver,Create_Button);
    }
}