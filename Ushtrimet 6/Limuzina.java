//2.2.Krijoni klasën konkrete Limuzina që është një Automjet automatik, dhe ka atributin ngjyra.
public class Limuzina extends Automjeti{
	public boolean eshteAutomatik(){
		return true;
	}
	private String ngjyra;
	public Limuzina(int nsh,String pr,int vp,String ngj){
		super(nsh,pr,vp);
		ngjyra=ngj;
	}
//a) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme
public void setNgjyra(String ngj){
	ngjyra=ngj;
}
public String getNgjyra(){
	return ngjyra;
}
/*b) Ofroni metodën që reprezenton në String një objekt të klasës Limuzina në formatin:
Limuzina <nrShasise> : <prodhuesi> - <vitiProdhimit> : <ngjyra>*/
public String toString(){
	return "Limuzina "+super.toString()+": "+ngjyra;
}
}
