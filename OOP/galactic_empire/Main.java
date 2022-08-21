public class Main {
    public static void main(String[] args){
        StarShip[] allShips = new StarShip[10];
        allShips[0] = new StarShip("Death Star", "D001");
        allShips[1] = new StarShip("Imperial Destroyer 13", "ID13");
        allShips[2] = new StarShip("Imperial Destroyer 99", "ID99");
        Voyage a = new Voyage("HOTH‐ALDERAAN", 3, false);
        Voyage b = new Voyage("TATOOINE‐ENDOR", 8, true);
        Voyage c = new Voyage("CORUSCANT‐NABOO", 10, true);
        allShips[0].addVoyage(a);
        allShips[1].addVoyage(b);
        allShips[0].addVoyage(c);
        allShips[0].addVoyage(new Voyage("CORUSCANT‐NABOO", 6, false));
        System.out.println(allShips[0].getShipNumber());
        //System.out.println(allShips[0].getVoyage(1).getDelay());
        //System.out.println(allShips[1].getNumberOfVoyages());
    }
}
