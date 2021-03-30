public class Autosalloni{
	public String emri;
	public Automjeti []a;
	public int indexi;
	public Autosalloni(String e, int maximalja){
		emri=e;
		a=new Automjeti[maximalja];
	}
	public boolean ekziston(Automjeti auto){
		for(int i=0;i<indexi;i++){
			if(a[i].equals(auto))
				return true;
		}
		return false;
	}
	public void shtoAutomjetin(Automjeti auto){
		if(auto == null){
			System.out.println("objekti eshte null.");
			return;
		}
		if(indexi>=a.length){
			System.out.println("Nuk ka vend ne varg.");
			return;
		}
		if(ekziston(auto)){
			System.out.println("Automjeti ekziston.");
			return;
		}
		a[indexi++]=auto;
	}
	public Automjeti[] shtypSUVprodheusi(String pr){
		int count=0;
		for(int i=0;i<indexi;i++){
			if(a[i] instanceof SUV){
				SUV s=(SUV)a[i];
			if(a[i].getProdhuesi()==pr){
				count++;
			}
		}
		}
		if(count==0){
			return null;
		}
		Automjeti[] vargu=new Automjeti[count];
		int count1=0;
		for(int i=0;i<indexi;i++){
			if(a[i] instanceof SUV){
				SUV s=(SUV)a[i];
			if(a[i].getProdhuesi()==pr){
				vargu[count1++]=a[i];
			}
		}
		}
		return vargu;
	}
	public Automjeti[] shtypLimuzinaViti(int vp){
		int count=0;
		for(int i=0;i<indexi;i++){
			if(a[i] instanceof Limuzina){
				Limuzina l=(Limuzina)a[i];
				if(a[i].getVitiProdhimit()==vp){
					count++;
				}
			}
		}
		if(count==0){
			return null;
		}
		Automjeti[] vargu=new Automjeti[count];
		int count1=0;
		for(int i=0;i<indexi;i++){
			if(a[i] instanceof Limuzina){
				Limuzina l=(Limuzina)a[i];
				if(a[i].getVitiProdhimit()==vp){
					vargu[count1++]=a[i];
				}
			}
		}
		return vargu;
	}
  public void automatikuMeIRi(boolean automatik){
	if(indexi==0){
		System.out.println("Nuk ka elemente ne varg.");
		return;
	}
	Automjeti auto=null;
	for(int i=0;i<indexi;i++){
		if(a[i].eshteAutomatik()==automatik){
			if(auto==null||a[i].getVitiProdhimit()<auto.getVitiProdhimit())
			auto=a[i];
		}
		
	}
	System.out.println(auto);
}
public static void main(String[]bz){
	Autosalloni a=new Autosalloni("Salloni ABC",50);
	Automjeti a1=new Limuzina(12345,"Japonia",2019,"I Zi");
	Automjeti a2=new Limuzina(12346,"Japonia",2019,"I Bardhe");
	Automjeti a3=new Limuzina(12347,"Kosova",2020,"I Kuq");
	Automjeti a4=new SUV(12348,"Kosova",2019,"eshte 4x4");
	Automjeti a5=new SUV(12310,"Shqiperia",2017,"eshte 4x4");
	Automjeti a6=new SUV(12349,"Kosova",2012,"eshte 4x4");
	a.shtoAutomjetin(a1);
	a.shtoAutomjetin(a2);
	a.shtoAutomjetin(a3);
	a.shtoAutomjetin(a4);
	a.shtoAutomjetin(a5);
	a.shtoAutomjetin(a6);
	System.out.println("------------");
	a.shtoAutomjetin(a6);
	System.out.println("------------");
	System.out.println("Automatiku me i ri eshte: ");
	a.automatikuMeIRi(true);
	
	
	
    System.out.println("------------");
	Automjeti[] varg=a.shtypLimuzinaViti(2019);
	for(int i=0;i<varg.length;i++){
		System.out.println(varg[i]);
	}

	System.out.println("----------------------");
	Automjeti[] vargu=a.shtypSUVprodheusi("Kosova");
	for(int i=0;i<vargu.length;i++){
		System.out.println(vargu[i]);
	}
	System.out.println("----------------------");
	System.out.println("----------------------");
	System.out.println("PO PO \n ANI THOJSHIN JA BESARTI I DOBT :)");
	System.out.println("----------------------");
	System.out.println("----------------------");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}