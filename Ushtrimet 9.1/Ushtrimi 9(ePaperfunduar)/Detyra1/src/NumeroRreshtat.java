/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;



 
public class NumeroRreshtat {
   String Shk2txt=null;
   String Shk2out=null;
   FileReader fr=null;
   BufferedReader br=null;
   FileWriter fw=null;
    public NumeroRreshtat (String input, String output) throws IOException{
        if(input==null||input.trim().isEmpty()){
            throw new IOException("File input nuk duhet te jete i zbrazet.");
        }
        if(output==null||output.trim().isEmpty()){
            throw new IOException("File output nuk duhet te jete i zbrazet.");
        }
        Shk2txt=input;
        Shk2out=output;
        fr=new FileReader(Shk2txt);
        br=new BufferedReader(fr);
        fw=new FileWriter(Shk2out);
    }
    public int numero(String teksti)throws IOException{
        int count=0;
        String line=null;
        while((line=br.readLine())!=null){
            if(line.startsWith(teksti)){
            count++;
        }
        }
        return count;
    }
    public void numeroRreshtat(String teksti)throws IOException{
        if(teksti==null||teksti.trim().isEmpty()){
            throw new IOException("Teksti nuk duhet te jete i zbrazet.");
        }
        fw.write("Numri i rreshtave ne file-in \""+Shk2txt+"\" qe fillojne me tekstin \""+teksti+"\" eshte: "+numero(teksti)); 
        fw.flush();
    }
    public void mbylliResurset(){
        try{
            if(br!=null){
                br.close();
            }
            if(fw!=null){
                fw.close();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[]bz){
        NumeroRreshtat nr=null;
        try{
            nr=new NumeroRreshtat("intext.txt","outtext.txt");
            nr.numeroRreshtat("Une");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
           if(nr!=null){
               nr.mbylliResurset();
           }
        }
    }
}
