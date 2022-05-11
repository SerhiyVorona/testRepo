package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceBook {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement newAccountBTN= driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        newAccountBTN.click();
        Thread.sleep(5000);
        WebElement firstName= driver.findElement(By.xpath("//*[@name='firstname']"));
        firstName.clear();
        firstName.sendKeys("Cat");
        WebElement lastName= driver.findElement(By.xpath("//*[@name='lastname']"));
        lastName.clear();
        lastName.sendKeys("Cat");
        WebElement email= driver.findElement(By.xpath("//*[@name='reg_email__']"));
        email.clear();
        email.sendKeys("mrkittypan22@gmail.com");
        Thread.sleep(3000);
        WebElement confEmail=driver.findElement(By.xpath("(//*[@class='inputtext _58mg _5dba _2ph-'])[4]"));
        confEmail.sendKeys("mrkittypan22@gmail.com");

        WebElement password= driver.findElement(By.xpath("//*[@name='reg_passwd__']"));
        password.clear();
        password.sendKeys("MrKiTtY2015!");
        WebElement birthMonth=driver.findElement(By.xpath("//*[@name='birthday_month']"));
        Select select=new Select(birthMonth);
        select.selectByVisibleText("Oct");
        WebElement birthDay=driver.findElement(By.xpath("//*[@name='birthday_day']"));
        Select select1=new Select(birthDay);
        select1.selectByVisibleText("29");
        WebElement birthYear=driver.findElement(By.xpath("//*[@name='birthday_year']"));
        Select select2=new Select(birthYear);
        select2.selectByVisibleText("1993");
        WebElement genderMale=driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
        genderMale.click();
        WebElement submitBTN=driver.findElement(By.xpath("//*[@name='websubmit']"));
        submitBTN.click();
        Thread.sleep(2000);
        WebElement text=driver.findElement(By.xpath("(//*[text()='Enter the code from your email'])[2]"));
        String actual=text.getText();
        String expected="Enter the code from your email";
        if (actual.equalsIgnoreCase(expected)){
            System.out.println("Test completed correctly");
        }else {
            System.out.println("Something went wrong");
        }
        driver.quit();



    }
}
