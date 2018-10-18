package am.willi.bdd.screenplay.trains.search.builders;

import am.willi.bdd.screenplay.trains.search.DepartureDay;
import am.willi.bdd.screenplay.trains.search.FindReturnTickets;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FindReturnTicketsBuilder {

    private String departure;
    private String destination;
    private DepartureDay departureDay;

    public FindReturnTicketsBuilder from(String departure) {
        this.departure = departure;
        return this;
    }

    public FindReturnTicketsBuilder to(String destination) {
        this.destination = destination;
        return this;
    }

    public FindReturnTicketsBuilder leaving(DepartureDay departureDay) {
        this.departureDay = departureDay;
        return this;
    }

    public Performable andReturningAfter(int returningAfterDayCount) {
        return instrumented(FindReturnTickets.class, departure, destination, departureDay, returningAfterDayCount);
    }

}