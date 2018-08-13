package packTp1;

public class Menu {

	public static void main(String[] args) {
		Ninja[] tabN = new Ninja[3];
		
		tabN[0] =new NinjaN();
		tabN[1] = new NinjaR();
		tabN[2] = new Personne();

		for(int i=0;i<tabN.length;i++){
			tabN[i].voler();
			System.out.println();
		
		}

	}

}
