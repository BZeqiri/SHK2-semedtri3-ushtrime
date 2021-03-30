/*2.1.Krijoni klasën abstrakte Automjeti që ka tri atribute: nrShasise [readonly], prodhuesi si dhe
vitiProdhimit*/
public abstract class Automjeti{
	private int nrShasis;
	private String prodhuesi;
	private int vitiProdhimit;
//a) Ofroni konstruktorin që pranon që të tri parametrat, ku inicializohen të gjitha atributet.
public Automjeti(int nrsh,String pr,int vp){
	nrShasis=nrsh;
	prodhuesi=pr;
	vitiProdhimit=vp;
}
//b) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme
public int getNrShasis(){
	return nrShasis;
}
public void setProdhuesi(String pr){
	prodhuesi=pr;
}
public String getProdhuesi(){
	return prodhuesi;
}
public void setVitiprodhimit(int vp){
	vitiProdhimit=vp;
}
public int getVitiProdhimit(){
	return vitiProdhimit;
}
//c) Ofroni metodën abstrakte eshteAutomatik
public abstract boolean eshteAutomatik();
/*d) Ofroni metodën që reprezenton në String një Automejti në formatin:
<nrShasise> : <prodhuesi> - <vitiProdhimit>*/
public String toString(){
	return nrShasis+": "+prodhuesi+"-"+vitiProdhimit;
}
/*e) Ofroni metodën për krahasimin e dy Automjeteve
(Dy automjete të njejtë kanë numrin e shasisë të njejtë).*/
public boolean equals(Object obj){
	if(obj instanceof Automjeti){
		Automjeti a=(Automjeti)obj;
		if(nrShasis==a.getNrShasis())
			return true;
	}
return false;
}
}























