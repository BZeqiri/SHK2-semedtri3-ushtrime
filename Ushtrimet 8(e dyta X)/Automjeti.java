
/*2.1. Krijoni klasën abstrakte Automjeti që ka tri atribute: nrShasise [readonly], prodhuesi si dhe
vitiProdhimit
a) Ofroni konstruktorin që pranon që të tri parametrat, ku inicializohen të gjitha atributet.
b) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme
c) Ofroni metodën abstrakte eshteAutomatik që tregon nëse një automjet është automatik
d) Ofroni metodën që reprezenton në String një objekt të klasës Automjeti në formatin:
<nrShasise> : <prodhuesi> - <vitiProdhimit>
e) Ofroni metodën për krahasimin e dy objekteve Automjeti.
Vini re: Dy automjete janë të njejtë nëse kanë numrin e shasisë të njejtë.*/ 
public abstract class Automjeti{
	private int nrshasise;
	private String prodhuesi;
	private int vitiprodhimit;
 public Automjeti(int nsh, String pr, int vp){
	 nrshasise=nsh;
	 prodhuesi=pr;
	 vitiprodhimit=vp;
 }
 public int getNrshasis(){
	 return nrshasise;
 }
 public void setProdhuesi(String pr){
	 prodhuesi=pr;
 }
 public String getProdhuesi(){
	 return prodhuesi;
 }
 public void setVitiprodhimit(int vp){
	 vitiprodhimit=vp;
 }
 public int getVitiprodhimit(){
	 return vitiprodhimit;
 }
 public abstract boolean eshteAutomatik();
 public String toString(){
	 return nrshasise+": "+prodhuesi+"-"+vitiprodhimit;
 }
}