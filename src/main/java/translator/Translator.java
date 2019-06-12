package translator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Translator {

    private WebDriver driver;

    //selectors
    private By div_source = By.cssSelector("#source");
    private By translation = By.cssSelector(".tlid-translation.translation");
    private By div_languageFrom = By.cssSelector(".sl-sugg > div:nth-child(2) > div:nth-child(1)");
    private By slSearchBox = By.cssSelector("#sl_list-search-box");
    private By esCheckmark = By.cssSelector(".language_list_item_icon.sl_list_es_s_checkmark");

    private By div_languageTo = By.cssSelector(".tl-sugg > div:nth-child(2) > div:nth-child(1)");
    private By tlSearchBox = By.cssSelector("#tl_list-search-box");
    private By enCheckmark = By.cssSelector(".language_list_item_icon.tl_list_en_s_checkmark");

    public String translate(String source, String target, String esPhrase){
        String url = "https://translate.google.com/";
        System.setProperty("webdriver.gecko.driver", Translator.class.getResource("/geckodriver.exe").getPath());

        driver = new FirefoxDriver();

        driver.navigate().to(url);

        //language from
        driver.findElement(div_languageFrom).click();
        driver.findElement(slSearchBox).click();
        driver.findElement(slSearchBox).sendKeys(source);
        driver.findElement(esCheckmark).click();

        //languaje to
        driver.findElement(div_languageTo).click();
        driver.findElement(tlSearchBox).click();
        driver.findElement(tlSearchBox).sendKeys(target);
        driver.findElement(enCheckmark).click();

        driver.findElement(div_source).sendKeys(esPhrase);

        sleep(3000);

        String enPhrase = driver.findElement(translation).getText();

        closeDriver();

        return enPhrase;
    }

    public void closeDriver() {
        if(driver != null) {
            driver.close();
        }
    }

    public void sleep(long seconds){
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}