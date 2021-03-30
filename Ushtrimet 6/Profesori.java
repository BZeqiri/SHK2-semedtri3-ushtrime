public class Profesori extends Mesimdhenesi{
	private String thirrjaAkademike;
	public boolean mentoron(){
		return true;
	}
	public void setThirrjaAkademike(String tha){
		thirrjaAkademike=tha;
	}
	public String getThirrjaAkademike(){
		return thirrjaAkademike;
	}
	public Profesori(String e,int vl,String tha){
		super(e,vl,"Ligjerata");
		thirrjaAkademike=tha;
	}
	public String toString(){
		return "Profesori "+super.toString()+" ka thirrje "+thirrjaAkademike;
	}
}