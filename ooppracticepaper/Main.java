import java.util.Arrays;
/**
 * Write a description of Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main {
    public static void main(String[] args){
        Swimmer Brob = new Swimmer("Brob","school_1");
        Swimmer John = new Swimmer("John","school_1");
        Swimmer Glib = new Swimmer("Glib","school_1");
        Swimmer Nerb = new Swimmer("Nerb","school_2");
        Swimmer E = new Swimmer("E","school_2");
        Swimmer Pok = new Swimmer("Pok","school_2");
        Swimmer Qek = new Swimmer("Qek","school_3");
        Swimmer Mert = new Swimmer("Mert","school_3");
        
        Swimmer Furt = new Swimmer("Furt","school_1");
        Swimmer Leckee = new Swimmer("Leckee","school_1");
        Swimmer Noorp = new Swimmer("Noorp","school_1");
        Swimmer Biysu = new Swimmer("Biysu","school_1");
        Swimmer UTI = new Swimmer("UTI","school_1");
        Swimmer H = new Swimmer("H","school_1");
        Swimmer Robert = new Swimmer("Robert","school_1");
        Swimmer Aabattery = new Swimmer("Aabattery","school_1");
        
        //Brob.addTimesaddEvents (15.44,"Backstroke 100m");
        //Brob.addTimesaddEvents (20.36,"breaststroke 100m");
        //System.out.println(Arrays.toString(Brob.gettimes()));
        //Race Race1 = new Race();
        //Race1.addswimmersaddtimes(Brob,19.84);
        //System.out.println(Arrays.toString(Race1.Swimmer));
        
        Event event1 = new Event("event1",2);
        event1.addSwimmers(Brob,19.84,0);
        event1.addSwimmers(John,18.96,0);
        event1.addSwimmers(Glib,17.43,0);
        event1.addSwimmers(Nerb,16.22,0);
        event1.addSwimmers(E,15.71,0);
        event1.addSwimmers(Pok,14.82,0);
        event1.addSwimmers(Qek,13.45,0);
        event1.addSwimmers(Mert,12.99,0);
        
        event1.addSwimmers(Furt,11.47,1);
        event1.addSwimmers(Leckee,10.19,1);
        event1.addSwimmers(Noorp,9.81,1);
        event1.addSwimmers(Biysu,8.06,1);
        event1.addSwimmers(UTI,7.69,1);
        event1.addSwimmers(H,6.00,1);
        event1.addSwimmers(Robert,5.34,1);
        event1.addSwimmers(Aabattery,4.44,1);
        
        //System.out.println(event1.races[0].Swimmer[0].name);
        //System.out.println(event1.races[0].Swimmer[1].name);
        //...
        System.out.println(Arrays.toString(event1.races[0].time));
        event1.fillFinals();
        //System.out.println("final times and swimmers sorted by best time");
        
        //System.out.println(Arrays.toString(Brob.geteventID()));
    }
}
