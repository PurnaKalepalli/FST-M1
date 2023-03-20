package stepDefinitions;

import io.cucumber.java.en.Then;

public class closeBrowser extends BaseClass {
    @Then("^close the browser$")
            public void close(){
        driver.quit();
    }

}
