package tests.client;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.CLIENT_ENROLLMENT_PAGE_URL;
import static constants.Constant.Urls.CLIENT_RESET_PASSWORD_URL;

public class ClientTest extends BaseTest {

    @Test
    public void verifyReturnAndSubmitButtons() {
        basePage.goToUrl(CLIENT_RESET_PASSWORD_URL);
    }

}
