/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LED COM
 */
public class Limuzina extends Automjeti implements Vozitet{
    @Override
    public boolean eshteAutomatik(){
        return true;
    }
    @Override
    public int nrShpejtesive(){
        return 6;
    }
    @Override
    public boolean kaTempomat(){
        return false;
    }
    private String ngjyra;
    public Limuzina(String ns,String p,int vp,String n){
        super(ns,p,vp);
        ngjyra=n;
    }
    @Override
    public String toString(){
        return "Limuzina"+super.toString()+": "+ngjyra;
    }
}
