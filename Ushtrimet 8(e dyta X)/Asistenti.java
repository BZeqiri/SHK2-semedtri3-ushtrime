/*1.4. Klasa konkrete Asistenti ësht
ë një Mësimdhënës dhe ka atributin shtesë: llojiUshtimreve*/
public class Asistenti extends Mesimdhenesi implements Angazhohet{
	private String llojiUshtrimeve;
	public Asistenti(String e,int vl,String an, String llu){
		super(e,vl,an);
		llojiUshtrimeve=llu;
	}
//a) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme.
public void setLlojiUshtrimeve(String llu){
	llojiUshtrimeve=llu;
}
public String getLlojiUshtrimeve(){
	return llojiUshtrimeve;
}
//b) Një asistent ka angazhimin "Ushtrime" dhe nuk mund të mentoroj punime diplome.
@Override
public String getAngazhimi(){
	return "Ushtrime";
} 
@Override
public boolean mentoron(){
	return false;
}
/*c) Ofroni metodën që reprezenton në String një objekt të klasës Asistenti në formatin:
Asistenti <emri> : < vitiLindjes > me fushe studimi <fushaStudimit> <llojiUshtrimeve>*/
public String toString(){
	return "Asistenti "+super.toString()+" "+llojiUshtrimeve;
}
}