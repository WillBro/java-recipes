package am.willi.bdd.screenplay.trains.search.builders;

import am.willi.bdd.screenplay.trains.search.FindSeasonTickets;
import am.willi.bdd.screenplay.trains.search.SeasonTicketDuration;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FindSeasonTicketsBuilder {

    private SeasonTicketDuration duration;
    private String departure;
    private String destination;

    public FindSeasonTicketsBuilder from(String departure) {
        this.departure = departure;
        return this;
    }

    public FindSeasonTicketsBuilder ofDuration(SeasonTicketDuration seasonTicketDuration) {
        this.duration = seasonTicketDuration;
        return this;
    }

    public Performable to(String destination) {
        return instrumented(FindSeasonTickets.class, departure, destination, duration);
    }
}