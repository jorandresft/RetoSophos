package com.sophossolutions.www.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = { "com.sophossolutions.www.steps" }, features = {
        "src/test/resources/com.sophossolutions.www.features/get_rest_photos.feature"
},

        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false,
        plugin = {"pretty", "html:target/reports/html/",
                "junit:target/reports/junit/allcukes.xml",
                "json:target/reports/cukes.json" }
)

public class GetRestPhotos {
}
