public class StarShip {
    private String shipName;
    private String shipNumber;
    private int numberOfVoyages;
    private Voyage[] voyageHistory = new Voyage[1000000];
    public StarShip(String name, String num) {
       this.shipName = name;
       this.shipNumber = num;
       this.numberOfVoyages = 0;
    }
    public StarShip() {}
    // All the usual accessor and mutator method can be assumed as given
    Voyage getVoyage(int x) {
       return voyageHistory[x];
    }
    public void addVoyage(Voyage v) {
       voyageHistory[ numberOfVoyages ] = v;
       numberOfVoyages++;
    }
    public double averageDelay() {
       // Returns the average delay for all voyages of the ship
       // Code missing
    }
    public String longestDelay(FlightNumbers[] fn) {
       // Returns the flight number for the voyage with the longest delay
       // Code missing
    }
    public String toString(FlightNumbers[] fn) {
       // Code missing
    }
    public String getShipNumber() {
       return shipNumber;
    }
 } 