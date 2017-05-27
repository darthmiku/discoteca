package darthmiku;

public class Condicio {
	private int edat;
	private String sexe;
	private String calsat;
	private int diners;
	
	public Condicio(int edat, String sexe, String calsat, int diners) {
		super();
		this.edat = edat;
		this.sexe = sexe;
		this.calsat = calsat;
		this.diners = diners;
	}

	public boolean comprovaEdat(int a){
		if(edat==0 || (edat<=a)){
			return true;
		}
		return false;
	}
	
	public boolean comprovaSexe(String x){
		if(sexe==null ||sexe.equals(x)){
			return true;
		}
		return false;
	}
	
	public boolean comprovaCalsat(String sabata){
		if(calsat==null || calsat.equals(sabata) ){
			return true;
		}
		return false;
	}
	
	public boolean comprovaDiners(int pempins){
		if(diners==0 || diners==pempins){
			return true;
		}
		return false;
	}




}
