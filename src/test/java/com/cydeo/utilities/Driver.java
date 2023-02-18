
    package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

    public class Driver {


        //create a privete constructor

        private Driver() {
        }


        /*

        We make the WebDriver private, because we want to close access from outside the class.
        We are making is static because we will use it in a static method
         */
        private static WebDriver driver; //defaut value = null

    /*

    Create a re-usable utility method which will return the same driver instance once we call it;
    - If an instance doesn't create first , and w\then it will always return same instance
     */

        public static WebDriver getDriver() {

            if (driver == null) {
/*
we will read our browserType from configuration.properies file
This way we can control which browser is opened from outside our code
 */
                String browserType = ConfigurationReader.getProperty("browser");
/*
Depending on the browserType returned from the configuration.properties
switch statement will determine the
 */
                switch (browserType) {

                    case "chrome":
                        //    WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

                        break;

                    case "firefox":
                        //     WebDriverManager.firefoxdriver().setup();
                        driver = new FirefoxDriver();
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

                        break;

                }

            }

            return driver;


        }


        public static void closeDriver() {

            if (driver != null) {
        /*
        This line will terninate the currently existing driver completely. It will not exist
        going forwars.
         */
                driver.quit();

                driver = null;

            }
        }


    }


