
public class Fakulteti{
	private String drejtimi;
	private Mesimdhenesi[] m;
	private int indexi;

public Fakulteti(String d,int nrMesimdhenesve){
	drejtimi=d;
	m=new Mesimdhenesi[nrMesimdhenesve];
}

public void shtoMesimdhenesin(Mesimdhenesi me){
	if(me==null){
		System.out.println("Objekti eshte null.");
		return;
	}
	if(indexi>=m.length){
		System.out.println("Nuk ka vend ne varg.");
		return;
	}
	if(ekziston(me)){
		System.out.println("Mesimdhenesi ekziston.");
	}
	m[indexi++]=me;
}
public boolean ekziston(Mesimdhenesi me){
	for(int i=0;i<indexi;i++){
		if(m.equals(me))
			return true;
	}
	return false;
}

public void shtypFushaStudimit(String fsh){
	if(indexi==0){
		System.out.println("Nuk ka mesimdhenes ne varg.");
		return;
	}
	for(int i=0;i<indexi;i++){
		if(m[i].getFushaStudimit().equals(fsh)){
			System.out.println(m[i]);
		}
	}
	
}


    public Angazhohet[] ktheAngazhimin(String angazhimi) {
        if (indexi == 0) {
            System.out.println("Nuk ka asnje mesimdhenes ne varg");
            return null;
        }
        int numriPerVarg = 0;
        for (int i = 0; i < indexi; i++) {
            if (m[i] instanceof Angazhohet) {
                Angazhohet ang = (Angazhohet) m[i];
                if (ang.getAngazhimi().equals(angazhimi)) {
                    numriPerVarg++;
                 
                }
            }
        }
        if (numriPerVarg == 0) {
            System.out.println("Nuk ka asnje mesimdhenes me kete angazhim");
            return null;
        }
        Angazhohet[] vargu = new Angazhohet[numriPerVarg];
        int index2 = 0;
        for (int i = 0; i < indexi; i++) {
            if (m[i] instanceof Angazhohet) {
             Angazhohet ang = (Angazhohet) m[i];
             if(ang.getAngazhimi().equals(angazhimi)){
           //     if (((Angazhohet) m[i]).getAngazhimi().equals(angazhimi)) {
                    vargu[index2++] = ang;
                }
            }
        }
        return vargu;

    }


public static void main(String[]bz){
	Fakulteti f=new Fakulteti("Shkenca Kompjuterike",10);
	    Profesori p1 = new Profesori("Besart",2012,"SHK1","i rregullt");
        Profesori p2 = new Profesori("Granit",2013,"SHK2","i rregullt");
        Asistenti a1 = new Asistenti("Diamant", 2015,"Databaze","Laboratorike");
        Asistenti a2 = new Asistenti("Albese", 2015,"SHK1","Numerike");
		System.out.println("-----------------------------------------");
		f.shtoMesimdhenesin(p1);
		f.shtoMesimdhenesin(p2);
		f.shtoMesimdhenesin(a1);
		f.shtoMesimdhenesin(a2);
		f.shtoMesimdhenesin(p1);
		System.out.println("-----------------------------------------");
		f.shtypFushaStudimit("SHK2");
		System.out.println("-----------------------------------------");
		Angazhohet[] temp=f.ktheAngazhimin("Ushtrime");
		for(Angazhohet a: temp){
			System.out.println(a);
		}
}
}






























