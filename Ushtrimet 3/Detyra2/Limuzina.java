public class Limuzina extends Automjeti{
	private String ngjyra;
	@Override
	public boolean eshteAutomatik(){
		return true;
	}
	public Limuzina(double nsh, String pr,int vp,String ngj){
		super(nsh,pr,vp);
		ngjyra=ngj;
	}
	public void setNgjyra(String ngj){
		ngjyra=ngj;
	}
	public String getNgjyra(){
		return ngjyra;
	}
	public String toString(){
		return "Limuzina: "+super.toString()+" "+ngjyra;
	}
}