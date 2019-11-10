package SeleniumUtil;


import Base.Base;
import Base.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class SeleniumUtil  {
    public static WebDriver driver= Driver.driver ();

    private final long SHORT_EXPLICIT_WAIT_TIME = 5;
    public void navigate (String string){
        driver.navigate ().to (string);
    }

    public WebElement findElement(By locator) {

        return driver.findElement(locator);
    }

    public  void sendKeys(By locator, String text) {
        clear(locator);
        findElement(locator).sendKeys(text);
    }

    public void clear(By locator) {
        findElement(locator).clear();
    }

    public void click(By locator) {
        findElement(locator).click();
    }

    public String getText(By locator) {
        return findElement(locator).getText();
    }

    public boolean isDisplayed(By locator) {
        return findElement(locator).isDisplayed();
    }

    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }

    public void waitForVisibility(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, SHORT_EXPLICIT_WAIT_TIME);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void screenShot() throws IOException {

        String fileLocation= "C:\\Users\\mcengiz.LISAACADEMY\\Desktop\\Comp\\Screen Shots\\";
        String fileName="ScreenShot";
        String fileExtension=".png";

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File(fileLocation+fileName+" "+Base.timeStamp+fileExtension));
    }
}
