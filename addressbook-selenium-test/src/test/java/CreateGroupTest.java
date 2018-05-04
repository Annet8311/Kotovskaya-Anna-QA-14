

import org.testng.annotations.*;

public class CreateGroupTest extends TestBase {

    @Test
    public void testCreateGroup() throws Exception {
        openAddressbook();

        login();

        goToGroupsPage();

        initGroupCreation();

        fillGroupForm("name", "header", "footer");

        submitGroupCreation();

        returnToGroupsPage();
    }

}
