package Tests;

import TestBase.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


@Tag("REGRESSION")
public class SeleniumTest extends TestBase {

    @ParameterizedTest
    @DisplayName("Test verifies if page title matches with expected - Siiportal ")
    @Tag("Siiportal")
    @ValueSource(strings = {"Kemp Login Screen"})
    public void shouldCheckPageTitle_1(String title) {
        getDriver().get("https://siiportal.sii.pl");
        String ActualTitle = getDriver().getTitle();
        assertThat(title, equalTo(ActualTitle));
    }

    @ParameterizedTest
    @DisplayName("Test verifies if page title matches with expected - Onet ")
    @Tag("Onet")
    @ValueSource(strings = {"Onet – Jesteś na bieżąco"})
    public void shouldCheckPageTitle_2(String title) {
        getDriver().get("https://www.onet.pl/");
        String ActualTitle = getDriver().getTitle();
        assertThat(title, equalTo(ActualTitle));
    }

    @ParameterizedTest
    @DisplayName("Test verifies if page title matches with expected - Kotuszkowo ")
    @Tag("Kotuszkowo")
    @ValueSource(strings = {"Kotuszkowo- blog o kotach"})
    public void shouldCheckPageTitle_3(String title) {
        getDriver().get("http://kotuszkowo.pl/");
        String ActualTitle = getDriver().getTitle();
        assertThat(title, equalTo(ActualTitle));
    }

    @ParameterizedTest
    @DisplayName("Test verifies if page title matches with expected - Filmweb ")
    @Tag("Filmweb")
    @ValueSource(strings = {"Filmweb - filmy takie jak Ty!"})
    public void shouldCheckPageTitle_4(String title) {
        getDriver().get("https://www.filmweb.pl/");
        String ActualTitle = getDriver().getTitle();
        assertThat(title, equalTo(ActualTitle));
    }

    @ParameterizedTest
    @DisplayName("Test verifies if page title matches with expected - Selenium documentation ")
    @Tag("Selenium documentation")
    @ValueSource(strings = {"WebDriver :: Documentation for Selenium"})
    public void shouldCheckPageTitle_5(String title) {
        getDriver().get("https://www.selenium.dev/documentation/en/webdriver/");
        String ActualTitle = getDriver().getTitle();
        assertThat(title, equalTo(ActualTitle));
    }
}
