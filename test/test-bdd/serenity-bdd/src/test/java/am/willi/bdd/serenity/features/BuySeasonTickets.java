package am.willi.bdd.serenity.features;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/buy_tickets/buy_season_tickets.feature")
public class BuySeasonTickets {}
