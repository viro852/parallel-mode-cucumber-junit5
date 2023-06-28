package io.cucumber.skeleton;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;

public class Hooks {


    private static ThreadLocal<WebDriver>threadLocalDriver = new ThreadLocal<>();


    @Before("@START_BROWSER")
    public void before() {
        WebDriver driver = BrowserManager.doBrowserSetup("chrome");
        //set driver
        threadLocalDriver.set(driver);
        System.out.println("Before Test Thread ID: "+Thread.currentThread().getId());
            threadLocalDriver.get().get("https://www.google.com/");
    }


    @After("@QUIT_BROWSER")
    public void after() {
        threadLocalDriver.get().quit();
        System.out.println("After Test Thread ID: "+Thread.currentThread().getId());
        threadLocalDriver.remove();
    }
}
