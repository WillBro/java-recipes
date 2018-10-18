package am.willi.bdd.screenplay.trains.search.builders;

import am.willi.bdd.screenplay.trains.search.DepartureDay;
import am.willi.bdd.screenplay.trains.search.FindOneWayTickets;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FindOneWayTicketsBuilder {

    private String departure;
    private String destination;

    public FindOneWayTicketsBuilder from(String departure) {
        this.departure = departure;
        return this;
    }

    public FindOneWayTicketsBuilder to(String destination) {
        this.destination = destination;
        return this;
    }

    public Performable leaving(DepartureDay departureDay) {
        return instrumented(FindOneWayTickets.class, departure, destination, departureDay);
    }
}