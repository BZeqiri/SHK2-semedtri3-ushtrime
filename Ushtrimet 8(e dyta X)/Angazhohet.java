//1.2. Krijoni interface-in Angazhohet që ka metodat:
public interface Angazhohet{
//a) String getAngazhimi();
public String getAngazhimi();
//b) boolean mentoron() (supozoni se në përgjithësi mësimdhënësit mentorojnë).
default boolean mentoron(){
	return true;
}
}