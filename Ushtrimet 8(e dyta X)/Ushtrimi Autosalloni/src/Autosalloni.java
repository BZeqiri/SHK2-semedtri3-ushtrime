/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LED COM
 */
public class Autosalloni {
    private String emri;
    private Automjeti[] a;
    private int indexi;
    public Autosalloni(String e,int k){
        emri=e;
        a=new Automjeti[k];
    }
    public void shtoAutomjetin(Automjeti auto){
        if(auto==null){
            System.out.println("Objekti eshte null.");
            return;
        }
        if(indexi>=a.length){
            System.out.println("Nuk ka vend ne varg.");
            return;
        }
        if(ekziston(auto)){
            System.out.println("Automjeti ekzison.");
            return;
        }
        a[indexi++]=auto;
    }
    public boolean ekziston(Automjeti auto){
        for(int i=0;i<indexi;i++){
            if(a[i].equals(auto)){
                return true;
            }
        }
        return false;
    }
    public Vozitet[] shtypNumriShpejtiesive(int nr){
        int count=0;
        for(int i=0;i<indexi;i++){
            if(a[i] instanceof Vozitet){
            Vozitet v=(Vozitet)a[i];
            if(v.nrShpejtesive()==nr){
                count++;
            }
        }
        }
        if(count==0)
            return null;
        int count1=0;
        Vozitet[] vija=new Vozitet[count];
        for(int i=0;i<indexi;i++){
            if(a[i] instanceof Vozitet){
                Vozitet v=(Vozitet)a[i];
                if(v.nrShpejtesive()==nr){
                    vija[count1++]=a[i];
                }
            }
        }
        return vija;
}
    public Vozitet[] ktheMeTempomat(){
        int count=0;
        int count1=0;
        for(int i=0;i<indexi;i++){
            if(a[i] instanceof Vozitet){
                Vozitet v=(Vozitet)a[i];
                if(v.kaTempomat()==true){
                    count++;
                }
            }
        }
        if(count==0)
            return null;
        Vozitet[] vija=new Vozitet[count];
        for(int i=0;i<indexi;i++){
            if(a[i] instanceof Vozitet){
                Vozitet v=(Vozitet)a[i];
                if(v.kaTempomat()==true){
                    vija[count1++]=a[i];
                }
            }
        }
        return vija;
    }
    public static void main(String[]bz){
        Autosalloni a=new Autosalloni("Salloni ABC",50);
        Limuzina l1=new Limuzina("1234b5z","BMW",2020,"E Kuqe");
        Limuzina l2=new Limuzina("1235b5z","AUDI",2021,"E Hirte");
        Limuzina l3=new Limuzina("1236b5z","Mercedes",1999,"E Zeze");
        SUV s1=new SUV("bz123zb4","Volkswagen",2014,"nuk eshte");
        SUV s2=new SUV("12b34zz2","Nissan",2019,"eshte");
        SUV s3=new SUV("8bzzb324","Peugeot",2010,"nuk eshte");
        a.shtoAutomjetin(l1);
        a.shtoAutomjetin(l2);
        a.shtoAutomjetin(l3);
        a.shtoAutomjetin(s1);
        a.shtoAutomjetin(s2);
        a.shtoAutomjetin(s3);
        a.shtoAutomjetin(l2);
         System.out.println("");
        System.out.println("Automjetet me 5 shpejtesi jane:");
        Vozitet[] vi=a.shtypNumriShpejtiesive(5);
        for (Vozitet vi1 : vi) {
            System.out.println(vi1);
        }
         System.out.println("");
        System.out.println("Automjetet qe kane tempomat jane:");
       Vozitet[] v1=a.ktheMeTempomat();
        for(Vozitet vvv:v1){
        System.out.println(vvv);
        }
    }
}