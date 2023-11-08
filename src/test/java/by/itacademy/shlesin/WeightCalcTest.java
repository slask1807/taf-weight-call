package by.itacademy.shlesin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeightCalcTest {
    @Test
    public void testFormWithEmptyValues() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        By inputCalculateBy = By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input");
        WebElement inputCalculateWebelement = driver.findElement(inputCalculateBy);
        inputCalculateWebelement.click();

        By bGetWarningTextBy = By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b");
        WebElement bGetWarningTextWebelement = driver.findElement(bGetWarningTextBy);

        String actual = bGetWarningTextWebelement.getText();
        String expected = ("Не указано имя.\nРост должен быть в диапазоне 50-300 см.\nВес должен быть в диапазоне 3-500 кг.\nНе указан пол.");
        Assertions.assertEquals(actual, expected);
    }
}
