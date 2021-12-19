
/**
 * Write a description of Event here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Event {
        
        private String eventID;
        private int numberOfRaces;
        private Race[] races;
        private Race finals;
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
        public void addSwimmers(String[] swimmer_array,double[] time_array){
            // fills the qualifying heats with swimmers
        }
        public void fillFinals()
        {
            // fills the finals race with the best 8 from the qualifying heats
        }
        // more methods()
}
