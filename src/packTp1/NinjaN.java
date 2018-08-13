package packTp1;

public class NinjaN extends Ninja{
	public NinjaN(){
		CVoler cv= new Voler10();
		affiche1();
		cv.voler();
		bouger();
		effect();
		
	}
	public void affiche1(){
		System.out.println("Je suis un Ninja Noir");
	}

}
