package am.willi.bdd.serenity.features;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/consult_the_timetables/download_the_timetables.feature")
public class DownloadTheTimetables {}
