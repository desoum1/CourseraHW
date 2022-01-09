 import java.util.Arrays;
/**
 * Write a description of Event here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Event {
        
        String eventID;
        int numberOfRaces;
        Race[] races;
        Race finals;
        public Event(String ID, int numberOfRaces)
        {
            eventID = ID;
            races = new Race[numberOfRaces];
            for(int i = 0; i < numberOfRaces; i++)
            {
                races[i] = new Race();
            }
            finals = new Race();
        }
        
        public void addSwimmers(Swimmer newswimmer,double newtime,int raceindex){
            
            // fills the qualifying heats with swimmers
            races[raceindex].addswimmersaddtimes(newswimmer,newtime);
        }
        public void fillFinals()
        {
            // fills the finals race with the best 8 from the qualifying heats
            int i,j;
            Swimmer swapSwimmer;
            double swapTime;
            double[] tempTime = timeCombine(races[0].time,races[1].time);
            Swimmer[] tempSwimmer = nameCombine(races[0].Swimmer,races[1].Swimmer);
            String[] tempSwimmernames;
            for(i = 0; i < 15; i++)
            {
                for(j = 0; j < 15; j++)
                {
                        if(tempTime[j] > tempTime[j + 1]) // if wrong order then…
                    {
                        swapSwimmer = tempSwimmer[j]; // swap the swimmer and…
                        tempSwimmer[j] = tempSwimmer[j + 1];
                        tempSwimmer[j + 1] = swapSwimmer;
                        swapTime = tempTime[j]; // swap the time
                        tempTime[j] = tempTime[j + 1];
                        tempTime[j + 1] = swapTime;
                        
                    }
                }
            }
            
            
            for(int k = 0; k < 8; k++)
            {
                finals.addswimmersaddtimes(tempSwimmer[k],tempTime[k]);
                System.out.println(tempSwimmer[k].name);
            }
            d
        }
        
        public double[] timeCombine(double[] array1,double[] array2)
        {
           double[] timeall = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 
           0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
           //for times in bith arrays,add to combinedarray 
           for(int i = 0; i < 8; i++){
             timeall[i] = array1[i];
            }
           for(int i = 0; i < 8; i++){
             timeall[i+8] = array2[i];
           }
           return timeall;
        }
        public Swimmer[] nameCombine(Swimmer[] array1, Swimmer[] array2)
        {
           Swimmer[] nameall ={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
           for(int j = 0; j < 8; j++){
             nameall[j] = array1[j];
            }
           for(int j = 0; j < 8; j++){
             nameall[j+8] = array2[j];
           }
           return nameall;
        }
        
        // more methods()
}
