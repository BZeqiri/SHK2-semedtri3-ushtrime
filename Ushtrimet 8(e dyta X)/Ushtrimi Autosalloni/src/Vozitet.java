/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LED COM
 */
public interface Vozitet {
    public int nrShpejtesive();
    default boolean kaTempomat(){
        return true;
    }
}
