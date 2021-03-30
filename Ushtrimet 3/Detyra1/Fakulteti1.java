public class Fakulteti1{
   private String drejtimi;
   private Mesimdhenesi1[] m;
   private int indexi;
   public Fakulteti1(String d,int kapaciteti){
	   drejtimi=d;
	   m=new Mesimdhenesi1[kapaciteti];
   }
   public boolean ekziston(Mesimdhenesi1 me){
	   for(int i=0;i<indexi;i++){
		   if(m[i].equals(me))
			   return true;
	   }
	   return false;
   }
   public void shtoMesimdhenesin(Mesimdhenesi1 me){
	   if(me==null){
		   System.out.println("Objekti eshte null");
		   return;
	   }
	   if(indexi>=m.length){
		   System.out.println("Nuk ka vend ne varg.");
		   return;
	   }
	   if(ekziston(me)){
		   System.out.println("Mesimdhdenesi ekziston.");
		   return;
	   }
	   m[indexi++]=me;
   }
   
   
   
   public Mesimdhenesi1 thirrjameEVjeter(String tha){
	   if(indexi==0){
		   System.out.println("Nuk ka element ne varg.");
		   return null;
	   }
	   Mesimdhenesi1 me=null;
	   for(int i=0;i<indexi;i++){
		   if(m[i] instanceof Profesori1){
				Profesori1 p = (Profesori1) m[i];
		  if(p.getThirrjaAkademike().equals(tha)){
			  if(me==null||m[i].getVitiLindjes()<=me.getVitiLindjes()){
				  me=m[i];
			  }
		  }
	   }
	  }
    return me;
   }
 public void shtypMentoret(boolean mentoron){
	if(indexi==0){
		System.out.println("Nuk ka asnje element ne varg.");
		return;
	}
	for(int i=0;i<indexi;i++){
		if(m[i].mentoron()==mentoron){
			System.out.println(m[i]);
		}
	}
 }
   public static void main(String[]bz){
	   Fakulteti1 f=new Fakulteti1("Shkenca kompjuterike",15);
	    Mesimdhenesi1 p1 = new Profesori1("Besart Zeqiri", 1993, "I rregullt");
		Mesimdhenesi1 a2 = new Asistenti1("Blerim Zylfiu", 1995, "Numerike");
		Mesimdhenesi1 p3 = new Profesori1("Mimoza Berisha", 1995, "I rregullt");
		Mesimdhenesi1 a4 = new Asistenti1("Ariana Zeqiri", 1997, "laboratorike");
		Mesimdhenesi1 a5 = new Asistenti1("Finesa Sopi", 1997, "I rregullt");
	   f.shtoMesimdhenesin(p1);
	   f.shtoMesimdhenesin(a2);
	   f.shtoMesimdhenesin(p3);
	   f.shtoMesimdhenesin(a4);
	   f.shtoMesimdhenesin(a5);
	   System.out.println("----------------------------------");
	   f.shtoMesimdhenesin(p1);
	   System.out.println("----------------------------------");
	   System.out.println("Mesimdhenesi me i vjeter:"+f.thirrjameEVjeter("I rregullt"));
	   System.out.println("----------------------------------");
	   System.out.println("Mesimdhenesit qe nuk kane te drejte te mentorojn: ");
	   f.shtypMentoret(false);
	   System.out.println("----------------------------------");
	  
	   
		
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
}