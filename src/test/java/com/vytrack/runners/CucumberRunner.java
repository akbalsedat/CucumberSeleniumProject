package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
<<<<<<< HEAD
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        strict = true,
        dryRun = false
)
public class CucumberRunner {

=======
        glue = "com/vytrack/step_definitions", // set: The paths of the step definition files
        features = "src/test/resources/features", // set: The paths of the feature files
        plugin = {"pretty",
                "html:target/cucumber-reports"
        },
        dryRun = false,
        strict = true,
        monochrome = true, // Display the console Output in much readable way
       // tags = "@driver" // to run scenarios that have this tags
       // tags = "not @driver" // run every other scenarios except this
        tags = "@login_with_params"
)
public class CucumberRunner {
>>>>>>> New Calendar Future File
}
