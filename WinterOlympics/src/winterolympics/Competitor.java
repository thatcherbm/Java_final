/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package winterolympics;

import java.io.Serializable;

/**
 *
 * @author thatcherb
 */
public class Competitor implements Serializable {
    private String name;
    private double score;
    
    /**
     * Methods: Constructor(name,score), getName, getScore, 
     */
    
    /**
     * constructor
     * creates new Competitor with a name and a score
     * pre: none
     * post: a new Competitor has been created
     * @param newName
     * @param newScore 
     */
    public Competitor(String newName, double newScore) {
        name = newName;
        score = newScore;
    }
    
    /**
     * Returns the name of a competitor
     * pre: none
     * post: the name has been returned
     * @return 
     */
    public String getName() {
        return(name);
    }
    
    /**
     * returns the score of a competitor
     * pre: none
     * post: the score has been returned
     * @return 
     */
    public double getScore() {
        return(score);
    }
    
    /**
     * Returns a string describing the competitor object
     * pre: none
     * post: the string has been returned
     * @return 
     */
    @Override
    public String toString() {
        String compString = name + " " + score;
        
        return(compString);
    }
}
