/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LED COM
 */
public abstract class Automjeti implements Vozitet {
    private String nrShasis;
    private String prodhuesi;
    private int vitiProdhimit;
    public Automjeti(String ns,String p,int vp){
        nrShasis=ns;
        prodhuesi=p;
        vitiProdhimit=vp;
    }
    public String getNrShasis(){
        return nrShasis;
    }    
    public void setProdhuesi(String p){
        prodhuesi=p;
    }
    public String getProdhuesi(){
        return prodhuesi;
    }
    public void setVitiProdhimit(int vp){
        vitiProdhimit=vp;
    }
    public int getVitiProdhimit(){
        return vitiProdhimit;
    }
    public abstract boolean eshteAutomatik();
    @Override
    public String toString(){
        return nrShasis+": "+prodhuesi+"-"+vitiProdhimit;
    }
    public boolean equals(Object obj){
        if(obj instanceof Automjeti){
            Automjeti a=(Automjeti)obj;
        if(nrShasis.equals(a.getNrShasis())){
            return true;
        }
        }
        return false;
    }
    }