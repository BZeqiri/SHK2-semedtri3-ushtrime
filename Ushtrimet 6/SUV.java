//2.3.Krijoni klasën konkrete SUV që është një Automjet jo-automatik, dhe ka atributin eshte4x4.
public class SUV extends Automjeti{
	public boolean eshteAutomatik(){
		return false;
	}
	private String eshte4x4;
	public SUV(int nrsh,String pr,int vp,String x){
		super(nrsh,pr,vp);
		eshte4x4=x;
	}
//a) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme
public void getEshte4x4(String x){
	eshte4x4=x;
}
public String setEshte4x4(){
	return eshte4x4;
}
/*b) Ofroni metodën që reprezenton në String një objekt të klasës SUV në formatin:
SUV <nrShasise> : <prodhuesi> - <vitiProdhimit> : (nuk) eshte 4x4*/
public String toString(){
	return "SUV "+super.toString()+": "+eshte4x4;
}
}