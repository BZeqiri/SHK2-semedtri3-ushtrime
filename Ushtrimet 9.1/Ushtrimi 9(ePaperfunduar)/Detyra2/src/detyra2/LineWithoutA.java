/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detyra2;

/**
 *
 * @author LED COM
 */
import java.io.*;

public class LineWithoutA {
    String shk2;
    String sshk2;
    FileReader fr=null;
    BufferedReader br=null;
    FileWriter fw=null;
 public LineWithoutA(String txt,String out)throws IOException{
    shk2=txt;
    sshk2=out;
    fr=new FileReader(shk2);
    br=new BufferedReader(fr);
    fw=new FileWriter(sshk2);
}

    public String longestNonALine(String text) throws IOException{
     String line=null;
     String texti = null;
        while((line=br.readLine())!=null&&(texti=br.readLine())!=null){
           if(!line.contains(text)&&!texti.contains(text)){
            if(line.length()>=texti.length())
                texti=line;
           }
       }
        return line;
 }
    public void shkruaj(String texti) throws IOException{
        if(texti==null||texti.trim().isEmpty()){
            throw new IOException("Text nuk duhet te jete i zbrazet.");
        }
        fw.write("Rreshti i fundit me i gjate qe nuk permban shkronjen A eshte: \n"+longestNonALine(texti));
        fw.flush();
    }
    public void mbyllResurset(){
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
    public static void main(String[]args){
        LineWithoutA a=null;
        try{
            a= new LineWithoutA("intext2.txt","outtext2.txt");
            a.shkruaj("a");
        }
        catch(Exception e){
           e.printStackTrace();
        }
        finally{
            if(a!=null){
                a.mbyllResurset();
            }
        }
    }
}