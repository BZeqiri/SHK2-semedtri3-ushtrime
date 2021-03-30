/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LED COM
 */
public class SUV extends Automjeti implements Vozitet{
    private String eshte4x4;
    public SUV(String ns,String p,int vp,String e4){
        super(ns,p,vp);
        eshte4x4=e4;
}
    @Override
    public boolean eshteAutomatik(){
        return false;
    }
    @Override
    public int nrShpejtesive(){
        return 5;
    }
    @Override
    public boolean kaTempomat(){
        return true;
    }
    public void setEshte4x4(String e){
        eshte4x4=e;
    }
    public String getEshte4x4(){
        return eshte4x4;
    }@Override
    public String toString(){
        return "SUV"+super.toString()+": "+eshte4x4+" 4x4";
    }
}
