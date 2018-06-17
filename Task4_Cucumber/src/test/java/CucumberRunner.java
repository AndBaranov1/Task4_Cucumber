import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


/**
 * Created by 1 on 16.06.2018.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"}, glue = {"steps"},
        plugin = {
                "util.AllureReporter",
        }
)
public class CucumberRunner {

}
