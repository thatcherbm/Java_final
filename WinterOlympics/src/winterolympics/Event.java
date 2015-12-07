/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package winterolympics;

import java.io.*;

/**
 *
 * @author thatcherb
 */
public class Event implements Serializable {
    private final String name;
    private boolean isTimed;
    private Competitor[] competitors = new Competitor[6];
    
    
    
    /**
     * Constructor
     * creates a new Event with a name, isTimed attribute, and six competitors 
     * in an array.
     * pre: none
     * post: none
     * @param newName 
     * @param timed 
     * @param name1 
     * @param score1 
     * @param name2 
     * @param score2 
     * @param name3 
     * @param score3 
     * @param name4 
     * @param score4 
     * @param name5 
     * @param score5 
     * @param name6 
     * @param score6 
     */
    public Event(String newName, boolean timed, String name1, double score1,
            String name2, double score2, String name3, double score3,
            String name4, double score4, String name5, double score5,
            String name6, double score6) {
        name = newName;
        isTimed = timed;
        Competitor one, two,three, four, five, six;
        
//        System.out.println(name1 + score1 + name2 + score2 + name3 + score3 + 
//                name4 + score4 + name5 + score5 + name6 + score6);
        
        one = new Competitor(name1, score1);
        two = new Competitor(name2, score2);
        three = new Competitor(name3, score3);
        four = new Competitor(name4, score4);
        five = new Competitor(name5, score5);
        six = new Competitor(name6, score6);
        
        //System.out.println(one + " " + two + " " + three + " " + four + " " + five + " " + six);
        
        competitors[0] = one;
        competitors[1] = two;
        competitors[2] = three;
        competitors[3] = four;
        competitors[4] = five;
        competitors[5] = six;
        
//        for (int i = 0; i < 6; i++) {
//            System.out.println(i + " " + competitors[i]);
//        }
        sortCompetitors();
    }
    
    /**
     * Constructor for use in the Try catch for error messages
     * Pre: none
     * post: an Event with name newName has been created
     * @param newName 
     */
    public Event(String newName) {
        name = newName;
    }
    
    /**
     * returns the name of an event
     * pre: none
     * post: the name of the event has been returned
     * @return 
     */
    public String getName() {
        return(name);
    }
    
    /**
     * Returns the information of the Competitor object in a certain place
     * pre: Competitor array has been sorted by time or score
     * post: the Competitor in a specific place has been returned
     * @param place
     * @return 
     */    
    public Competitor getCompetitor(int place) {
        Competitor retCompetitor = competitors[place];
        return(retCompetitor);
    }
            
    /**
     * Sorts the Competitor Array from fastest to slowest or highest to lowest 
     * depending on the value of isTimed
     */
    private void sortCompetitors() {
        Competitor temp;
        int previousIndex;
        double indScore, prevScore;
        //System.out.println(name);
        
        if (isTimed == true) {    
            //System.out.println(isTimed + "true");
            for (int index = 1; index < competitors.length; index++) {
                temp = competitors[index];
                previousIndex = index - 1;
                indScore = competitors[index].getScore();
                prevScore = competitors[previousIndex].getScore();
                //prevScore > indScore
                while ((prevScore > indScore) && (previousIndex > 0)) {
                    competitors[previousIndex + 1] = competitors[previousIndex];
                    previousIndex -= 1; //decrease index to compare current item
                                        //with the next previous item
                    prevScore = competitors[previousIndex].getScore();
                }                       
                //System.out.println(competitors[previousIndex] + " " + prevScore + " " + temp + " " + indScore);
                if (prevScore > indScore) {
                    //System.out.println(competitors[previousIndex] + " > " + temp);
                    /* Shift item in first element up into next element */
                    competitors[previousIndex + 1] = competitors[previousIndex];
                    /* place current item at index 0 */
                    competitors[previousIndex] = temp;
                    //System.out.println(competitors[previousIndex] + " " + temp + "\n");
                } else {
                    //System.out.println(competitors[previousIndex] + " < " + temp);
                    /* place current item at index ahead of previous item */
                    competitors[previousIndex + 1] = temp;
                    //System.out.println(competitors[previousIndex] + " " + temp + "\n");
                }
            }
        } else {
            //System.out.println(isTimed + "false");
            for (int index = 1; index < competitors.length; index++) {
                //System.out.println("for " + index);
                temp = competitors[index];
                previousIndex = index - 1;
                indScore = competitors[index].getScore();
                prevScore = competitors[previousIndex].getScore();
                while ((prevScore < indScore) && (previousIndex > 0)) {
                    competitors[previousIndex + 1] = competitors[previousIndex];
                    previousIndex -= 1; //decrease index to compare current item
                                        //with the next previous item
                    prevScore = competitors[previousIndex].getScore();
                }       
                
                //System.out.println(competitors[previousIndex] + " " + prevScore + " " + temp + " " + indScore);
                if (prevScore < indScore) {
                    //System.out.println(competitors[previousIndex] + " < " + temp);
                    /* Shift item in first element up into next element */
                    competitors[previousIndex + 1] = competitors[previousIndex];
                    /* place current item at index 0 */
                    competitors[previousIndex] = temp;
                } else {
                    //System.out.println(competitors[previousIndex] + " > " + temp);
                    /* place current item at index ahead of previous item */
                    competitors[previousIndex + 1] = temp;
                }
                //System.out.println(competitors[previousIndex] + " " + temp + "\n");
            }
        }
        
    }    
    
    /**
     * Returns a string describing the event object
     * pre: none
     * post: the string has been returned
     * @return 
     */
    @Override
    public String toString() {
        String eventString;
        eventString = name + "\n" + isTimed + "\n";
        for (int i = 0; i < 6; i++) {
            eventString += i + " " + competitors[i] + "\n";
        }
        
        return(eventString);
    }
    
    
}
