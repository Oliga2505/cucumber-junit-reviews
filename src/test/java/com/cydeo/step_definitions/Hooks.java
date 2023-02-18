package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.AfterClass;

public class Hooks {

    @Before //it should come from cucumber java Not JUNIT
    public void setUp(){

        System.out.println("SET UP BEFORE EACH SCENARIO");
    }

@After //it should come from cucu,ber java
    public void tearDown() {

        BrowserUtils.sleep(3);
        Driver.closeDriver();


    }
}
