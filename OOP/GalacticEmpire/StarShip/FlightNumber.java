public class FlightNumber {
    private String flightName; // eg: Coruscant to Tatooine
    private String flightCode; // eg: CORUSCANT‐TATOOINE
    public FlightNumber(String a, String b) {
        this.flightName = a;
        this.flightCode = b;
    }
    public String getFlightCode() {
        return flightCode;
    }
    public String getFlightName() {
        return flightName;
    }
}