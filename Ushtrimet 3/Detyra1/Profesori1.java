public class Profesori1 extends Mesimdhenesi1{
	private String thirrjaAkademike;
	@Override
	public boolean mentoron(){
		return true;
	}
	
	
	public Profesori1(String emri,int vitiLindjes,String thirrjaAkademike){
		super(emri,vitiLindjes,"Ligjerata");
		this.thirrjaAkademike=thirrjaAkademike;
	}
	public void setThirrjaAkademike(String tha){
		thirrjaAkademike=tha;
	}
	public String getThirrjaAkademike(){
		return thirrjaAkademike;
	}
	public String toString(){
		return "Profesori: "+super.toString()+" "+thirrjaAkademike;
	}
}