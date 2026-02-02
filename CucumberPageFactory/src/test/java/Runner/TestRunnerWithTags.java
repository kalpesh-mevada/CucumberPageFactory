	package Runner;
	
	import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
	import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
	import static io.cucumber.junit.platform.engine.Constants.FEATURES_PROPERTY_NAME;
	import static io.cucumber.junit.platform.engine.Constants.FILTER_TAGS_PROPERTY_NAME;
	import org.junit.platform.suite.api.ConfigurationParameter;
	import org.junit.platform.suite.api.SelectClasspathResource;
	import org.junit.platform.suite.api.Suite;
	
	@Suite
	@SelectClasspathResource("TagsDemo/Tags.feature")
	@ConfigurationParameter(
	        key = GLUE_PROPERTY_NAME,
	        value = "TagSteps"
	)
	//================Tags========================
	
	  @ConfigurationParameter( key = FILTER_TAGS_PROPERTY_NAME, 
	  value =  "(@smoke or @regression) or @important" )
	/*
	 * @ConfigurationParameter( key = FILTER_TAGS_PROPERTY_NAME, value =
	 * "@smoke or @regression" )
	 */
	/*
	 * @ConfigurationParameter( key = FILTER_TAGS_PROPERTY_NAME, value =
	 * "@smoke or @regression" )
	 */
	
	/*
	 * @ConfigurationParameter( key = FILTER_TAGS_PROPERTY_NAME, value =
	 * "@smoke and @regression" )
	 */
	/*
	 * @ConfigurationParameter( key = FILTER_TAGS_PROPERTY_NAME, value =
	 * "@smoke and not @regression" )
	 */
	/* It will execute run all scenarios mentioned in feature file
	 * @ConfigurationParameter( key = FILTER_TAGS_PROPERTY_NAME, value = "(@mustRun"
	 * )
	 */
	 
	public class TestRunnerWithTags {
	}