public abstract class Mesimdhenesi1{
       private String emri;
       private int vitiLindjes;
       private String angazhimi;
  public Mesimdhenesi1(String e,int vl,String a){
	  emri=e;
	  vitiLindjes=vl;
	  angazhimi=a;
  }
  public String getEmri(){
	  return emri;
  }
  public void setVitiLindjes(int vl){
	  vitiLindjes=vl;
  }
  public int getVitiLindjes(){
	  return vitiLindjes;
  }
  public void setAngazhimi(String a){
	  angazhimi=a;
  }
  public String getAngazhimi(){
	  return angazhimi;
  }
  
  public abstract boolean mentoron();
  @Override
  public String toString(){
	  return emri+": "+vitiLindjes+" mban "+angazhimi;
  }
  @Override
  public boolean equals(Object obj){
	  if(obj instanceof Mesimdhenesi1){
		  Mesimdhenesi1 m=(Mesimdhenesi1)obj;
		  if(emri.equals(m.getEmri())&&vitiLindjes==m.getVitiLindjes())
			  return true;
	  }
	  return false;
  }
}