public class Asistenti1 extends Mesimdhenesi1{
	private String llojiiUshtrimeve;
	
	
	 public Asistenti1(String emri,int vitiLindjes,String llojiiUshtrimeve){
		 super(emri,vitiLindjes,"Ushtrime");
		 this.llojiiUshtrimeve=llojiiUshtrimeve;
	 }
	 @Override
	 public boolean mentoron(){
		 return false;
	 }
	 public void setLlojiiUshtrimeve(String ll){
		 llojiiUshtrimeve=ll;
	 }
	 public String getLlojiiUshtrimeve(){
		 return llojiiUshtrimeve;
	 }
	 public String toString(){
		 return "Asistenti: "+super.toString()+" "+llojiiUshtrimeve;
	 }
}