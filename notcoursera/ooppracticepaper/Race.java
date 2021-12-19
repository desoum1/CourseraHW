
/**
 * Write a description of Race here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Race {
    Swimmer [] Swimmer = {null, null, null, null, null, null, null, null};
    //new Swimmer [8];    
    double [] time = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
    public Race (){
        this.Swimmer = Swimmer;
        this.time = time ;
    }
    public void addswimmersaddtimes(Swimmer swimmer, double Time){
         for(int i = 0; i < Swimmer.length; i++){
            if(Swimmer[i] == null){
                Swimmer[i] = swimmer;
                time[i] = Time;
                break;
            }
            }
    }
    
}
