public abstract class Automjeti{
	private double nrShasis;
	private String prodhuesi;
	private int vitiProdhimit;
	public Automjeti(double nsh, String pr,int vp){
		nrShasis=nsh;
		prodhuesi=pr;
		vitiProdhimit=vp;
	}
	public double getNrShasis(){
		return nrShasis;
	}
	public void setprodhuesi(String pr){
		prodhuesi=pr;
	}
	public String getProdhuesi(){
		return prodhuesi;
	}
	public void setVitiProdhimit(int vp){
		vitiProdhimit=vp;
	}
	public int getVitiProdhimit(){
		return vitiProdhimit;
	}
    public abstract boolean eshteAutomatik();
	@Override
    public String toString(){
		return nrShasis+": "+prodhuesi+" - "+vitiProdhimit;
	}
	@Override
    public boolean equals(Object obj){
		if(obj instanceof Automjeti){
			Automjeti a=(Automjeti)obj;
			if(nrShasis==a.getNrShasis())
				return true;
		}
		return false;
	}
}