public class Main {
    public static void main(String[] args){
        FlightNumber[] allFlights = new FlightNumber[10];
        allFlights[0] = new FlightNumber("Hoth to Alderaan", "HOTH‐ALDERAAN");
        allFlights[1] = new FlightNumber("Tatooine to Endor", "TATOOINE‐ENDOR");
        allFlights[2] = new FlightNumber("Coruscant to Naboo", "CORUSCANT‐NABOO");
        StarShip[] allShips = new StarShip[10];
        allShips[0] = new StarShip("Death Star", "D001");
        allShips[1] = new StarShip("Imperial Destroyer 13", "ID13");
        allShips[2] = new StarShip("Imperial Destroyer 99", "ID99");
        Voyage a = new Voyage("HOTH‐ALDERAAN", 3, false);
        Voyage b = new Voyage("TATOOINE‐ENDOR", 8, true);
        Voyage c = new Voyage("CORUSCANT‐NABOO", 10, false);
        allShips[0].addVoyage(a);
        allShips[1].addVoyage(b);
        allShips[0].addVoyage(c);
        allShips[0].addVoyage(new Voyage("CORUSCANT‐NABOO", 2, false));
        //System.out.println(allShips[0].getShipNumber());
        //System.out.println(allShips[0].getVoyage(1).getDelay());
        //System.out.println(allShips[1].getNumberOfVoyages());
        //System.out.println(allShips[0].averageDelay());
        System.out.println(allShips[0].longestDelay(allFlights));
    }
}