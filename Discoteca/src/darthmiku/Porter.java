package darthmiku;

import java.util.ArrayList;
import java.util.List;

public class Porter {
	
	public List<Persona> deixarPassar(List<Persona>persones, Condicio condicio){
		
		List<Persona>entren=new ArrayList<>();

		for(Persona persona:persones){
			if(condicio.comprovaEdat(persona.getEdat()) && condicio.comprovaSexe(persona.getSexe()) && condicio.comprovaCalsat(persona.getCalsat()) 
					&& condicio.comprovaDiners(persona.getDiners())){
				entren.add(persona);
			}
		}
		
		return entren;
		}

}
