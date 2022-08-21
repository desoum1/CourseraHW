public class StarShip {
    private String shipName;
    private String shipNumber;
    private int numberOfVoyages;
    private Voyage[] voyageHistory = new Voyage[1000000];
    public StarShip(String name, String num) {
        this.shipName = name;
        this.shipNumber = num;
        this.numberOfVoyages = 0;
        //constructor
    }
    public StarShip() {}
    // All the usual accessor and mutator method can be assumed as given
    Voyage getVoyage(int x) {
        return voyageHistory[x];
    }
    public int getNumberOfVoyages(){
        return numberOfVoyages;
    }
    public void addVoyage(Voyage v) {
        voyageHistory[ numberOfVoyages ] = v;
        numberOfVoyages++;
    }
    public String getShipNumber(){
        return shipNumber;
    }
    
    
    public double averageDelay() {
        int sumDelay = 0;
        int delayCount;
        for (int x = 0; x < voyageHistory.length; x++){
            System.out.println(x);
            sumDelay += voyageHistory[x].getDelay();
        }
        
        double averageDelay = sumDelay / numberOfVoyages;
        return averageDelay;
    }
    /*
    public String longestDelay(FlightNumbers[] fn) {
        // Returns the flight number for the voyage with the longest delay
        // Code missing
    }
    public String toString(FlightNumbers[] fn) {
        // Code missing
    }
    */
}