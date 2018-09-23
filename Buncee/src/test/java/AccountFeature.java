import javafx.scene.layout.Priority;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.io.FileInputStream;
import java.io.IOException;

public class AccountFeature extends SubBase {

    public AccountFeature() throws IOException {
    }

    @Test(priority = 1, enabled = true)

    private void LoginToAccount() throws Exception {
        try {
            loginToAccount();
//takeTheScreenshot("test");
        } catch (Exception e) {
            takeTheScreenshot(new Object() {
            }.getClass().getEnclosingMethod().getName());

        }
//    @Test
//    public void LogoutFromAccount() throws InterruptedException {
//        loginToAccount();
//        logoutToAccount();
//
//}
    }

}