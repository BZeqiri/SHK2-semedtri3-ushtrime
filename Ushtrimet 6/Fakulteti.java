//Krijoni klasën Fakulteti që ka drejtimin dhe mësimdhënës të ndryshëm
public class Fakulteti{
	private String drejtimi;
	private Mesimdhenesi m[];
	private static int nrMesimdhenesve;
	private static int nrDekanit;
	private int indexi;
//a) Ofroni konstruktorin e kësaj klase, i cili pranon drejtimin e fakultetit.
public Fakulteti(String d){
	drejtimi=d;
}
/*b) Klasa e brendshme (ang. Inner class) Tutori është një Mësimdhënës, ka vitin e studimeve, nuk
mund të mentoroj, ka angazhimin "Tutorime", dhe reprezentohet në String si:
Tutori i vitit <vitiStudimeve>: <emri> : < vitiLindjes > angazhohet ne <angazhimi>*/
public class Tutori extends Mesimdhenesi{
	private int vitiStudimeve;
	public boolean mentoron(){
		return false;
	}
	public Tutori(String e,int vl,int vs){
		super(e,vl,"Tutorime");
		vitiStudimeve=vs;
	}
	public String toString(){
		return "Tutori i vitit "+vitiStudimeve+" "+super.toString();
	}
}
/*c) Klasa e ndërthurur (ang. static nested class) Vizituesi është një Mësimdhënës, ka numrin e orëve,
mund të mentoroj, me angazhim të ndryshëmm, dhe reprezentohet në String si:
Mesimdhenesi vizitues <emri> : < vitiLindjes > angazhohet ne <angazhimi> me <nrOreve> ore*/
public static class Vizituesi extends Mesimdhenesi{
	private int nrOreve;
	public boolean mentoron(){
		return true;
	}
	public Vizituesi(String e,int vl,String an,int no){
		super(e,vl,an);
		nrOreve=no;
	}
	public String toString(){
		return "Mesimdhenesi vizitues "+super.toString()+" me "+nrOreve+" ore";
	}
}
//d) Një fakultet mund të ketë 25 mësimdhënës (nuk duhet te deklarohet si konstante).
static{
	nrMesimdhenesve=25;
}
//e) Çdo fakultet ka një mësimdhënës vizitues me 10 orë mësimore për semestër
{
	m=new Mesimdhenesi[nrMesimdhenesve];
	m[indexi++]=new Fakulteti.Vizituesi("Besart Zeqiri",2000,"ushtirme",10);
}
//f) Ofroni metodën shtoMesimdhenesin që e shton një mësimdhënës nëse ai nuk ekziston
public void shtoMesimdhenesin(Mesimdhenesi me){
	if(me==null){
		System.out.println("Objekti eshte null.");
		return;
	}
	if(indexi>=m.length){
		System.out.println("Nuk ka vend ne varg.");
		return;
	}
	if(ekziston(me)){
		System.out.println("Mesimdhenesi ekziston.");
		return;
	}
	m[indexi++]=me;
}
public boolean ekziston(Mesimdhenesi me){
	for(int i=0;i<indexi;i++){
		if(m[i].equals(me))
			return true;
	}
	return false;
}
/*g) Metoda shtoNjeMesimdhenes pranon parametrat për një mësimdhënës gjenerik, treguesin
se a mentoron apo jo dhe e shton këtë mësimdhënës në varg.*/
public void shtoNjeMesimdhenes(String e,int vl,String an, boolean mentoron){
	Mesimdhenesi me=new Mesimdhenesi(e,vl,an){
		public boolean mentoron(){
			return mentoron;
		}
	};
	shtoMesimdhenesin(me);
}
//h) Metoda shtypSipasEmrit shtyp mësimdhënësit emri i të cilëve përfundon me tekst të caktuar. 
public void shtypSipasEmrit(String txt){
	if(indexi==0){
		System.out.println("Nuk ka mesimdhens.");
		return;
	}
	for(int i=0;i<indexi;i++){
		if(m[i].getEmri().endsWith(txt)){
			System.out.println(m[i]);
		}
	}	
  }
/*i) Metoda avgVitiLindjes kthen mësimdhënësin e fundit me vit të lindjes më të hershëm se
mesatarja e viteve të lindjes së të gjithë mësimdhënësve.*/
public Mesimdhenesi avgVitiLindjes(){
	double shuma=0;
	for(int i=0;i<indexi;i++){
		shuma=shuma+m[i].getVitiLindjes();
	}
	double mesatarja=shuma;
	Mesimdhenesi me=null;
	for(int i=0;i<indexi;i++){
		if(m[i].getVitiLindjes()<mesatarja){
			me=m[i];
		}
	}
	return me;
}
/*j) Metoda shtoDekanin pranon si parametra emrin dhe vitin e lindjes së dekanit të cilin e shton
në varg. Dekani është një Mësimdhënës, ka angazhimin "Menaxhim", mentoron dhe
reprezentohet në String si:
Dekani <emri> i lindur me <vitiLindjes> menaxhon Fakultetin <drejtimi_i_fakultetit>
Vini re: Një fakultet mund të ketë vetëm një dekan.*/
public void shtoDekanin(String e, int vl){
	Mesimdhenesi me=new Mesimdhenesi(e,vl,"Menaxhim"){
		public boolean mentoron(){
			return true;
		}
		public String toString(){
			return "dekani"+e+"i lindur me "+vl+" menaxhon fakultetin "+drejtimi;
		}
	};
	shtoMesimdhenesin(me);
}
/*k) Ofroni metodën main ku do të krijohet një instancë e klasës Fakulteti me drejtim "Shkenca
Kompjuterike", shtoni mësimdhënës të ndryshëm dhe testoni të gjitha metodat.*/
public static void main(String[]bz){
	Fakulteti f=new Fakulteti("Shkenca Kompjuterike");
	Profesori p1=new Profesori("Ariana Zeqiri",2003,"I rregullt");
	Profesori p2=new Profesori("Finesa Sopi",1999,"I rregullt");
	Profesori p3=new Profesori("Flakron Makolli",2001,"I rregullt");
	Asistenti a1=new Asistenti("Tringa Krasniqi",1998,"Laboratorike");
	Asistenti a3=new Asistenti("Festim Mehanja",2000,"Numerike");
	Asistenti a2=new Asistenti("Sara Kastrati",2000,"Laboratorike");
	f.shtoMesimdhenesin(p1);
	f.shtoMesimdhenesin(p2);
	f.shtoMesimdhenesin(p3);
	f.shtoMesimdhenesin(a1);
	f.shtoMesimdhenesin(a2);
	f.shtoMesimdhenesin(a3);
	System.out.println("===============================================");
	System.out.println(f.avgVitiLindjes());
	System.out.println("===============================================");
	f.shtypSipasEmrit("ti");
	System.out.println("===============================================");
	f.shtoNjeMesimdhenes("Finesa Zeqiri",1999,"I rregullt",true);
	f.shtoDekanin("Albert Maniaku",1992);
	f.shtoDekanin("Alba Morina",1998);
}
}


































































































