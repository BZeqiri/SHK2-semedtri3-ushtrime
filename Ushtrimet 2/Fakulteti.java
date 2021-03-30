public class Fakulteti{
	private String drejtimi;
	private Mesimdhenesi[] m;
	private int index;
	
	// Fakulteti f = new Fakulteti("SHKI", 10);
	public Fakulteti(String d, int kapaciteti){
		drejtimi = d;
		m= new Mesimdhenesi[kapaciteti];
	}
	
	public boolean ekziston(Mesimdhenesi me){
		for(int i = 0; i < index; i++){
			if(m[i].equals(me)){
				return true;
			}
		}
		return false;	
	}
	
	public void shtoMesimdhenesin(Mesimdhenesi me){
		if(me == null){
			System.out.println("Objekti eshte null");
			return;
		}
		if(index >= m.length){
			System.out.println("Nuk ka vende te lira");
			return;			
		}
		if(ekziston(me)){
			System.out.println("Mesimdhenesi ekziston ne varg");
			return;		
		}
		m[index++] = me;	
	}
	
	public Profesori profesoriMeIRI(){
		if(index == 0){
			System.out.println("Nuk ka elemente ne varg");
			return null;	
		}
		Profesori iRi = null;
		
		/*
			m[0] = Profesor; 1993
			m[1] = Asistent; 1994
			m[2 ] = Asistent; 2000
			m[3] = Profesor; 1995
		
		*/
		
		
		for(int i = 0; i < index; i++){
			if(m[i] instanceof Profesori){
				Profesori p = (Profesori) m[i];
				if(iRi == null 
				|| p.getVitiLindjes() > iRi.getVitiLindjes()){
					iRi = p;
				}	
			}
		}	
		return iRi;
	}
	
	public void shtypLlojinEUshtrimeve(String lloji){
		if(index == 0){
			System.out.println("Nuk ka elemente ne varg");
			return;
		}
		for(int i = 0; i < index; i++){
			if(m[i] instanceof Asistenti){
				Asistenti a = (Asistenti) m[i];
				if(a.getLlojiUshtrimeve().equals(lloji)){
					System.out.println(a);	
				}
			}	
		}
	}
	
	public static void main(String[]args){
		Fakulteti f = new Fakulteti("SHKI", 5);
		Mesimdhenesi p1 = new Profesori("Filan Fisteku", 1993, "Profesor i rregullt");
		Mesimdhenesi a1 = new Asistenti("Filan Asistenti", 1995, "Numerike");
		Mesimdhenesi p2 = new Profesori("Filan2 Fisteku2", 1995, "Profesor i asocuar");
		Mesimdhenesi a2 = new Asistenti("Filan2 Asistenti2", 1997, "Laboratorike");
		
		f.shtoMesimdhenesin(p1);
		f.shtoMesimdhenesin(a1);
		f.shtoMesimdhenesin(p2);
		f.shtoMesimdhenesin(a2);
		f.shtoMesimdhenesin(a2);
		
		System.out.println("Profesori me i ri : " + f.profesoriMeIRI());
		
		f.shtypLlojinEUshtrimeve("Numerike");
		
		
	}
	
	
	
}