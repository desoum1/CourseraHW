
/**
 * Write a description of Swimmer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Swimmer {

        String name;
            
        String school;
        
        String [] eventID = {"empty", "empty","empty","empty", "empty"};
        
        double [] time = {0.0, 0.0, 0.0, 0.0, 0.0};
    public Swimmer (String name, String school/*, String [] eventID, double time*/ ){
        this.name = name;
        this.school = school;
        this.eventID = eventID;
        this.time = time;
    }
    public void addTimesaddEvents (double swimtime, String SwimeventID){
        //SwimeventID = Swimmer.eventID;
        //Swimtime = Swimmer.time;
        for(int x = 0; x < eventID.length; x++){
            if(eventID [x] == "empty"){
                eventID [x] = SwimeventID;
                time [x] = swimtime;
                break;
            }   
        
        }
    }
    public double [] gettimes (){
        return time;
    }
    public String [] geteventID(){
        return eventID; 
    }
}
