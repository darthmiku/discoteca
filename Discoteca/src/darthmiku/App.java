package darthmiku;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Persona>persones= Arrays.asList(
				new Persona("Pere",20,"home","sabates",25),
				new Persona("Manel",21,"home","bambes",50),
				new Persona("Maria",18,"dona","sandàlies",8),
				new Persona("Mercè",25,"dona","sabates",100),
				new Persona("Joan",17,"home","bambes",5));
		
		Condicio condicio= new Condicio(0,null,null,0);
		Porter porter = new Porter();
		
		
		System.out.println(porter.deixarPassar(persones, condicio));
		

	}

}
