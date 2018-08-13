package packTp1;

public class NinjaR extends Ninja{
	public NinjaR(){
		CVoler cv= new Voler5();
		affiche1();
		cv.voler();
		bouger();
		effect();
	}
	public void affiche1(){
		System.out.println("Je suis un Ninja Rouge");
	}
}
