public class SUV extends Automjeti{
	@Override
     public boolean eshteAutomatik(){
		return false;
	 }
	 public String eshte4x4;
	 public SUV(double nsh,String pr,int vp,String x){
		 super(nsh,pr,vp);
		 eshte4x4=x;
	 }
	 public void setEshte4x4(String x){
		 eshte4x4=x;
	 }
	 public String getEshte4x4(){
		 return eshte4x4;
	 }
	 public String toString(){
		 return "SUV: "+super.toString()+eshte4x4;
	 }
	 
}