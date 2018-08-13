package packTp1;

public class Personne extends Ninja{
	Ninja n;
	public Personne(){
		CVoler cv= new NepasVoler();
		affiche1();
		cv.voler();
		//affiche();
		bouger();
		effect();
	}
	public void affiche1(){
		System.out.println("Je suis un Personne");
	}
}
