/*1.1. Krijoni klasën abstrakte Mesimdhenesi që atributet: emri[readonly], vitiLindjes si dhe
fushaStudimit*/
public abstract class Mesimdhenesi{
	private String emri;
	private int vitiLindjes;
	private String fushaStudimit;
//a) Ofroni konstruktorin që pranon që të tri parametrat, ku inicializohen të gjitha atributet.
public Mesimdhenesi(String e,int vl,String fsh){
	emri=e;
	vitiLindjes=vl;
	fushaStudimit=fsh;
}
//b) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme
public String getEmri(){
	return emri;
}
public void setVitiLindjes(int vl){
	vitiLindjes=vl;
}
public int getVitiLindjes(){
	return vitiLindjes;
}
public void setFushaStudimit(String fsh){
	fushaStudimit=fsh;
}
public String getFushaStudimit(){
	return fushaStudimit;
}
/*c) Reprezentimi në String i një Mesimdhenesi ka formatin:
<emri> : < vitiLindjes > me fushe studimi <fushaStudimit>*/
@Override
public String toString(){
	return emri+": "+vitiLindjes+" me fushe studimi "+fushaStudimit;
}
/*d) Ofroni metodën për krahasimin e dy objekteve Mesimdhenesi për barazi.
Vini re: Dy mësimdhënës janë të njëjtë nëse kanë emrin dhe vitin e lindjes të njëjtë. */
public boolean equals(Object obj){
	if(obj instanceof Mesimdhenesi){
		Mesimdhenesi m=(Mesimdhenesi)obj;
		if(emri.equals(m.getEmri())&&vitiLindjes==m.getVitiLindjes())
			return true;
	}
	return false;
}
}