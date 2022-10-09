public class Voyage {
    private String flightNumber;
    // Unique alpha‐numeric identifier for the particular flight route
    private int delay;
    // Minutes late in arriving at destination
    private boolean rebelRelated;
    // Equals true if the voyage was disrupted by an attack from the rebel alliance,
    // otherwise false.
    // Constructor which initialises all 3 of the above data items
    public Voyage(String FlightNum, int time, boolean rebel){
        this.flightNumber = FlightNum;
        this.delay = time;
        this.rebelRelated = rebel;
    }
    public int getDelay(){
        return delay;
    }
    public String getflightNumber(){
        return flightNumber;
    }
    public boolean getrebelRelated(){
        return rebelRelated;
    }
}