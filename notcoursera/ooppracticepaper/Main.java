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
        //Brob.addTimesaddEvents (15.44,"Backstroke 100m");
        //Brob.addTimesaddEvents (20.36,"breaststroke 100m");
        //System.out.println(Arrays.toString(Brob.gettimes()));
        Race Race1 = new Race();
        Race1.addswimmersaddtimes(Brob,19.84);
        System.out.println(Arrays.toString(Race1.Swimmer));
        //System.out.println(Arrays.toString(Brob.geteventID()));
    }
}
