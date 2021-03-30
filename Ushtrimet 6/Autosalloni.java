//2.4.Krijoni klasën Autosalloni që ka emrin dhe automjete të ndryshme
public class Autosalloni{
	private String emri;
	private static int nrAutomjeteve;
	private Automjeti[] a;
	private int indexi;
//a) Ofroni konstruktorin e kësaj klase, i cili pranon emrin e autosallonit.
public Autosalloni(String e){
	emri=e;
}
/*b) Klasa e brendshme (ang. Inner class) Minibusi është një Automjet automatik, ka numrin e dyerëve,
reprezentohet në String si:
Minibusi <nrShasise> : <prodhuesi> - <vitiProdhimit> : <nrDyereve>*/
public class Minibusi extends Automjeti{
	public boolean eshteAutomatik(){
		return true;
	}
	private int nrDyereve;
	public Minibusi(int nrsh,String pr,int vp,int nd){
		super(nrsh,pr,vp);
		nrDyereve=nd;
	}
	public String toString(){
		return "Minibusi "+super.toString()+": "+nrDyereve;
	}
}
/*c) Klasa e ndërthurur (ang. static nested class) Coupe është një Automjet jo automatik, ka numrin e
ulëseve, reprezentohet në String si:
Coupe <nrShasise> : <prodhuesi> - <vitiProdhimit> - me <nrUleseve> ulese*/
public static class Coupe extends Automjeti{
	public boolean eshteAutomatik(){
		return false;
	}
	private int nrUleseve;
	public Coupe(int nrsh,String pr,int vp,int nru){
		super(nrsh,pr,vp);
		nrUleseve=nru;
	}
	public void setNrUlesve(int nru){
		nrUleseve=nru;
	}
	public int getNrUlseve(){
		return nrUleseve;
	}
	public String toString(){
		return "Coupe "+super.toString()+"me "+nrUleseve+" ulese";
	}
}
//d) Një autosallon mund të ketë 250 automjete (nuk duhet te deklarohet si konstante).
static{
	nrAutomjeteve=250;
}
//e) Çdo Autosallon e ka një Coupe të vjetër dy vite me dy ulëse
      {
	a=new Automjeti[nrAutomjeteve];
	a[indexi++]=new Autosalloni.Coupe(123456,"Kosova",2018,2);
      }
//f) Ofroni metodën shtoAutomjetin që e shton një automjet nëse nuk ekziston dhe ka vend në varg.
public void shtoAutomjetin(Automjeti au){
	if(au==null){
		System.out.println("Objekti eshte null");
		return;
	}
	if(ekziston(au)){
		System.out.println("Automjeti ekziston.");
		return;
	}
	if(indexi>a.length){
		System.out.println("nuk ka vend ne varg.");
		return;
	}
	a[indexi++]=au;
}
public boolean ekziston(Automjeti au){
	for(int i=0;i<indexi;i++){
		if(a[i].equals(au))
			return true;
	}
	return false;
}
/*g) Metoda shtoNjeAutomjet pranon parametrat per një automjet gjenerik, treguesin se a është
automatik apo jo dhe e shton këtë automjet në varg*/
public void shtoNjeAutomjet(int nrsh,String pr,int vp,boolean eshteAutomatik){
	Automjeti auto=new Automjeti(nrsh,pr,vp){
		public boolean eshteAutomatik(){
			return eshteAutomatik;
		}
	};
	shtoAutomjetin(auto);
}
/*h) Metoda shtoPrototipin pranon si parametra numrin e shasisë dhe prodhuesin (fillestar) dhe e shton
automjetin prototip në varg. Prototipi është i vitit aktual dhe nuk është automatik. Një autosallon
mund të ketë vetëm një automjet prototip.*/
public void shtoPrototipin(int nrsh, String pr){
	Automjeti auto=new Automjeti(nrsh,pr,2020){
		public boolean eshteAutomatik(){
			return false;
		}
	};
	shtoAutomjetin(auto);
}
//i) Ofroni metodën avgNumriUleseve që kthen automjetin e fundit me më pak ulëse se mesatarja.

//j) Metoda shtypAutomatik që shtyp automjetet (jo)automatike, varësisht nga parametri i pranuar.
public Automjeti[] shtypAutomatik(boolean automatik){
	int count=0;
	for(int i=0;i<indexi;i++){
		if(a[i].eshteAutomatik()==automatik){
			count++;
		}
	}
	if(count==0){
		return null;
	}
	int count1=0;
	Automjeti[] vargu=new Automjeti[count];
	for(int i=0;i<indexi;i++){
		if(a[i].eshteAutomatik()==automatik){
			vargu[count1++]=a[i];
		}
	}
	return vargu;
}
/*k) Ofroni metodën main ku do të krijohet një instancë e klasës Autosalloni me emrin "Salloni ABC",
dhe shtoni një prototip dhe nga një automjet të secilit lloj.*/
public static void main(String[]bz){
	Autosalloni a=new Autosalloni("Salloni ABC");
	a.shtoPrototipin(10001,"BMW");
	SUV s=new SUV(12345,"SUV",2020,"nuk eshte automatik");
	SUV s1=new SUV(12346,"SUV",2019,"nuk eshte automatik");
	Limuzina l=new Limuzina(12347,"Limuzina",2020,"black");
	Limuzina l1=new Limuzina(12348,"Limuzina",2017,"ocean");
	SUV s2=new SUV(12349,"SUV",2017,"nuk eshte autoamtik");
	Limuzina l2=new Limuzina(12355,"Limuzina",2018,"metalic");
	a.shtoAutomjetin(s);
	a.shtoAutomjetin(s1);
	a.shtoAutomjetin(s2);
	a.shtoAutomjetin(l);
	a.shtoAutomjetin(l1);
	a.shtoAutomjetin(l2);
//l) Të testohen të gjitha metodat	
	a.shtoAutomjetin(s);
	a.shtoNjeAutomjet(12333,"Audi RS7",2020,true);
	
	Automjeti[] aa=a.shtypAutomatik(false);
	for(int i=0;i<aa.length;i++){
		System.out.println(aa[i]);
	}
}

}














