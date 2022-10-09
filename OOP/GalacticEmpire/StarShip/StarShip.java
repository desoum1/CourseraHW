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
        double sumDelay = 0;
        int delayCount;
        for (int x = 0; x < numberOfVoyages  ; x++){
            sumDelay += voyageHistory[x].getDelay();
        }
        
        double averageDelay = sumDelay / numberOfVoyages;
        return averageDelay;
    }
    //checks for longest dealy non rebel and then conversts code to actual name
    public String longestDelay(FlightNumber[] allFlights) {
        int longestDelay = 0;
        String code= "";
        for (int x = 0; x < numberOfVoyages  ; x++){ 
            if(voyageHistory[x].getrebelRelated() == false){
                  if(longestDelay < voyageHistory[x].getDelay()){
                            longestDelay = voyageHistory[x].getDelay();
                            code = voyageHistory[x].getflightNumber();
                  }
            }
        }
        for (int i = 0; i<allFlights.length; i++){
            if (allFlights[i].getFlightCode() == code){
                return allFlights[i].getFlightName();
            }
        }
        return "No flights found";
    }
}