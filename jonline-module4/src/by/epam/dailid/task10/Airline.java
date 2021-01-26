package by.epam.dailid.task10;

import java.util.Arrays;
import java.util.Objects;

public class Airline {
    private String finalDestination;
    private int flightNumber;
    private String airplaneType;
    private float timeOfDeparture;
    private String [] daysOfFlights;

    public Airline(String finalDestination,int  flightNumber, String airplaneType, float timeOfDeparture,
                   String [] daysOfFlights){

        this.finalDestination = finalDestination;
        this.flightNumber = flightNumber;
        this.airplaneType = airplaneType;
        this.timeOfDeparture = timeOfDeparture;
        this.daysOfFlights = daysOfFlights;

    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public void setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public float getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(float timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public String[] getDaysOfFlights() {
        return daysOfFlights;
    }

    public void setDaysOfFlights(String[] daysOfFlights) {
        this.daysOfFlights = daysOfFlights;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "finalDestination='" + finalDestination + '\'' +
                ", flightNumber=" + flightNumber +
                ", airplaneType='" + airplaneType + '\'' +
                ", timeOfDeparture=" + timeOfDeparture +
                ", daysOfFlights=" + Arrays.toString(daysOfFlights) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airline)) return false;
        Airline airline = (Airline) o;
        return getFlightNumber() == airline.getFlightNumber() &&
                Float.compare(airline.getTimeOfDeparture(), getTimeOfDeparture()) == 0 &&
                getFinalDestination().equals(airline.getFinalDestination()) &&
                getAirplaneType().equals(airline.getAirplaneType()) &&
                Arrays.equals(getDaysOfFlights(), airline.getDaysOfFlights());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFinalDestination(), getFlightNumber(), getAirplaneType(), getTimeOfDeparture());
        result = 31 * result + Arrays.hashCode(getDaysOfFlights());
        return result;
    }
}

