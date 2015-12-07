package winterolympics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thatcherb
 */

import java.util.ArrayList;
import java.io.*;

public class Olympics implements Serializable {
    private String year, location;
    private ArrayList<Event> events = new ArrayList<Event>();
    
    /**
     * Constructor
     * generates a new Olympics Object with a year and location.
     * pre: none
     * post: a new Olympics object has been created
     * @param yr
     * @param loc 
     */
    public Olympics(String yr, String loc) {
        year = yr;
        location = loc;
    }
    
    /**
     * Returns the year of the Olympics object
     * pre: none
     * post: the year has been returned
     * @return 
     */
    public String getYear() {
        return(year);
    }
    
    /**
     * Returns the location of the current Olympics
     * pre: none
     * post: the location has been returned
     * @return 
     */
    public String getLocation() {
        return(location);
    }
    
    /**
     * Adds an event to the events ArrayList, used by NewEventGUI
     * pre: none
     * post: an event has been added to the ArrayList
     * @param newEventName
     * @param isTimed
     * @param comp1Name
     * @param comp1Score
     * @param comp2Name
     * @param comp2Score
     * @param comp3Name
     * @param comp3Score
     * @param comp4Name
     * @param comp4Score
     * @param comp5Name
     * @param comp5Score
     * @param comp6Name
     * @param comp6Score 
     */
    public void addEvent(String newEventName, boolean isTimed, 
            String comp1Name, double comp1Score, String comp2Name, double comp2Score, 
            String comp3Name, double comp3Score, String comp4Name, double comp4Score, 
            String comp5Name, double comp5Score, String comp6Name, double comp6Score) {
        
        events.add(new Event(newEventName, isTimed, comp1Name, comp1Score, 
        comp2Name, comp2Score, comp3Name, comp3Score, comp4Name, comp4Score, 
        comp5Name, comp5Score, comp6Name, comp6Score));
    }
    
    /**
     * Overloaded add event for use in the file import
     * pre: none
     * post: an event has been added to the ArrayList
     * @param newEvent 
     */
    public void addEvent(Event newEvent) {
        events.add(newEvent);
    }
    
    /**
     * sets event newEvent to index i, for use in alphabetical sort
     * pre: none
     * post: an event has been added to the ArrayList at index i
     * @param newEvent 
     */
    public void setEvent(int i, Event newEvent) {
        events.set(i, newEvent);
    }
    
    /**
     * returns the name of Event i
     * pre: none
     * post: the name of event i has been returned.
     * @param i
     * @return 
     */
    public String getEventName(int i) {
        String item;
        
        Event current = events.get(i);
        item = current.getName();
        
        return(item);
    }
    
    /**
     * returns Event i
     * pre: none
     * post: event i has been returned.
     * @param i
     * @return 
     */
    public Event getEvent(int i) {
        
        Event retEvent = events.get(i);
        
        return(retEvent);
    }
    
    /**
     * returns the number of events objects in the Olympics
     * pre: none
     * post: the number of events has been returned
     * @return 
     */
    public int getEventsSize() {
        return(events.size());
    }
    
    /**
     * returns a string displaying the top 3 competitors and their medals
     * pre: the competitors in the event have been sorted fastest to slowest
     * or highest score to lowest score
     * post: the string is returned
     * @return 
     */
    public String getMedalists(int i) {
        String medalists;
        Event thisEvent = events.get(i);
//        for (int j = 0; j < 6; j++) {
//            System.out.println(thisEvent.getCompetitor(j).getName());
//        }
        Competitor gold = thisEvent.getCompetitor(0);
        Competitor silver = thisEvent.getCompetitor(1);
        Competitor bronze = thisEvent.getCompetitor(2);
        
        medalists = "GOLD MEDAL:\n";
        medalists += gold.getScore() + " - " + gold.getName();
        
        medalists += "\nSILVER MEDAL:\n";
        medalists += silver.getScore() + " - " + silver.getName();
        
        medalists += "\nBRONZE MEDAL:\n";
        medalists += bronze.getScore() + " - " + bronze.getName();
        //System.out.println(medalists);
        return(medalists);
    }
}
