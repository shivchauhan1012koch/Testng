package Test_Scenerios;

import Base.Setup;
import PageObjects.Project_Creation;
import PageObjects.login;
import PageObjects.openProject;
import org.testng.annotations.Test;

public class CreateProject extends Setup {
//    static Logger logger = LogManager.getLogger(CreateProject.class);
    String UN= "Pol_aut_test_1@molex.com";
    String PW= "Ulreztknaf5283)";
    String RPMno= "12022024";
    String Project_Name= "Automation";

    @Test(priority = 1)
    public void signIn(){
        login LI= new login();
//        LI.EnterCD();
        LI.EnterCredentials(UN,PW);
        LI.ClickSignOn();
        LI.ClickDiamondButton();
    }
    @Test(priority = 2)
    public void CreationOfProject(){
        Project_Creation PC=new Project_Creation();
        PC.NavigatetoProjectCreation();
        PC.CreationOfProject(RPMno,Project_Name);
    }
//    @Test(priority = 3)
//    public void OpenProject(){
//        openProject OP=new openProject();
//        OP.OpeningProject(Project_Name);
//        OP.VerifyProjectName();
//    }
}
