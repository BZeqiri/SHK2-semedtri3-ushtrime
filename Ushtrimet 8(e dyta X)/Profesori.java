//1.3. Klasa konkrete Profesori është një Mësimdhënës dhe ka atributin shtesë: thirrjaAkademike
public class Profesori extends Mesimdhenesi implements Angazhohet{
	private String thirrjaAkademike;
	public Profesori(String e,int vl,String fsh,String tha){
		super(e,vl,fsh);
		thirrjaAkademike=tha;
	}
//a) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme.
public void setThirrjaAkademike(String tha){
	thirrjaAkademike=tha;
}
public String getThirrjaAkademike(){
	return thirrjaAkademike;
}
//b) Një profesor ka angazhimin "Ligjerata" dhe mund të mentoroj punime diplome.
public String getAngazhimi(){
	return "Ligjerata";
}
/*c) Ofroni metodën që reprezenton në String një objekt të klasës Profesori në formatin:
Profesori <emri> : < vitiLindjes > me fushe studimi <fushaStudimit>, ka thirrje <thirrjaAkademike>*/
public String toString(){
	return "Profesori "+super.toString()+", ka thirrje akademike "+thirrjaAkademike;
}
}