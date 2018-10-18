package am.willi.bdd.screenplay.trains.search;

import am.willi.bdd.screenplay.trains.search.builders.FindOneWayTicketsBuilder;
import am.willi.bdd.screenplay.trains.search.builders.FindReturnTicketsBuilder;
import am.willi.bdd.screenplay.trains.search.builders.FindSeasonTicketsBuilder;

public class FindTickets {
    public static FindOneWayTicketsBuilder forAOneWayTrip() {
        return new FindOneWayTicketsBuilder();
    }

    public static FindReturnTicketsBuilder forAReturnTrip() {
        return new FindReturnTicketsBuilder();
    }

    public static FindSeasonTicketsBuilder forASeasonTicket() {
        return new FindSeasonTicketsBuilder();
    }

}
