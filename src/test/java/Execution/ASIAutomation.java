package Execution;

import org.testng.annotations.Test;
import pages.Login;

public class ASIAutomation extends Base {

    @Test
    public void SmokeTest() {
        Login.LaunchApplication(driver);


    }
}
