package Runner;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasspathResource("features")

@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "StepsDefinations")

/* -------- HTML/JSON REPORT -------- */
@ConfigurationParameter(
        key = PLUGIN_PROPERTY_NAME,
        value = "pretty, html:target/HTMLReports/cucumber-report.html, "
        		+ "json:target/JSONReports/cucumber.json, junit:target/JUnitReports/reports-junit.xml"
)

/* -------- PARALLEL EXECUTION -------- */

@ConfigurationParameter(
        key = "cucumber.execution.parallel.enabled",
        value = "true"
)

@ConfigurationParameter(
        key = "cucumber.execution.parallel.config.strategy",
        value = "fixed"
)

@ConfigurationParameter(
        key = "cucumber.execution.parallel.config.fixed.parallelism",
        value = "2"

)
/* -------- TAGS (SMOKE TEST) as same tag defined in feature file that helps to run specific scenarios -------- */
/*@ConfigurationParameter(
        key = FILTER_TAGS_PROPERTY_NAME,
        value = "@smoketest"
)*/
public class TestRunner {
}